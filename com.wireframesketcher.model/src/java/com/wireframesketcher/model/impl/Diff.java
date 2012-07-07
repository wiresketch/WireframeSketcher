package com.wireframesketcher.model.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Diff {
	public static final Comparator<Object> EQUALITY_COMPARATOR = new Comparator<Object>() {
		public int compare(Object o1, Object o2) {
			return o1.equals(o2) ? 0 : 1;
		}
	};

	public static enum EditType {
		INSERT, DELETE, MOVE
	}

	private static final Edit[] EMPTY = new Edit[0];

	/**
	 * Describes a edit
	 */
	public static class Edit {
		/** Edit type */
		public final EditType type;

		/** Affected index in the first sequence */
		public final int index0;

		/**
		 * Affected index in the second sequence. The first sequence for MOVE
		 * edit.
		 */
		public final int index1;

		Edit(EditType type, int index0, int index1) {
			this.type = type;
			this.index0 = index0;
			this.index1 = index1;
		}

		@Override
		public String toString() {
			return "[" + type + ", " + index0 + ", " + index1 + "]";
		}

		@Override
		public boolean equals(Object obj) {
			Edit other = (Edit) obj;
			return type.equals(other.type) && index0 == other.index0
					&& index1 == other.index1;
		}

		public static Edit insert(int index0, int index1) {
			return new Edit(EditType.INSERT, index0, index1);
		}

		public static Edit delete(int index0, int index1) {
			return new Edit(EditType.DELETE, index0, index1);
		}

		public static Edit move(int index0, int index1) {
			return new Edit(EditType.MOVE, index0, index1);
		}
	}

	/**
	 * Diffs two sequences and returns a change script for making sequence a
	 * match sequence b. Matching inserts and deletes are replaced with moves.
	 * 
	 * @param a
	 *            first sequence
	 * @param b
	 *            second sequence
	 * @param comparator
	 *            comparator used for equality tests
	 * @return the change script
	 */
	public static <T> Edit[] diffWithMoves(T[] a, T[] b,
			Comparator<? super T> comparator) {
		List<Edit> result = basicDiff(a, b, comparator);

		result = calculateMoves(a, b, comparator, result);

		return convertResult(result);
	}

	/**
	 * Diffs two sequences and returns a change script for making sequence a
	 * match sequence b. The change script consists of inserts and deletes.
	 * 
	 * @param a
	 *            first sequence
	 * @param b
	 *            second sequence
	 * @param comparator
	 *            comparator used for equality tests
	 * @return the change script
	 */
	public static <T> Edit[] diff(T[] a, T[] b, Comparator<? super T> comparator) {
		List<Edit> result = basicDiff(a, b, comparator);

		return convertResult(result);
	}

	private static Edit[] convertResult(List<Edit> result) {
		if (result == null || result.isEmpty())
			return EMPTY;

		return (Edit[]) result.toArray(new Edit[result.size()]);
	}

	private static <T> List<Edit> calculateMoves(T[] a, T[] b,
			Comparator<? super T> comparator, List<Edit> result) {
		if (result == null || result.size() < 2)
			return result;

		boolean[] processed = new boolean[result.size()];
		List<Edit> moves = new ArrayList<Edit>(result.size());
		int delta = 0;
		for (int k = 0; k < result.size(); k++) {
			Edit c0 = result.get(k);

			if (processed[k]) {
				if (c0.type == EditType.DELETE)
					delta++;
				else
					delta--;
				continue;
			}
			if (c0.type == EditType.DELETE) {
				T deleted = a[c0.index0];
				int tmpDelta = delta;

				for (int i = k + 1; i < result.size(); i++) {
					Edit c1 = result.get(i);

					if (processed[i]) {
						if (c1.type == EditType.DELETE)
							tmpDelta++;
						else
							tmpDelta--;
						continue;
					} else if (c1.type == EditType.INSERT
							&& comparator.compare(deleted, b[c1.index1]) == 0) {
						processed[i] = true;
						processed[k] = true;
						moves.add(Edit.move(delta + c0.index0, tmpDelta
								+ c1.index0));
						delta++;
						break;
					}
				}
			} else if (c0.type == EditType.INSERT) {
				T inserted = b[c0.index1];
				int tmpDelta = delta;

				for (int i = k + 1; i < result.size(); i++) {
					Edit c1 = result.get(i);

					if (processed[i]) {
						if (c1.type == EditType.DELETE)
							tmpDelta++;
						else
							tmpDelta--;
						continue;
					} else if (c1.type == EditType.DELETE
							&& comparator.compare(a[c1.index0], inserted) == 0) {
						processed[i] = true;
						processed[k] = true;
						moves.add(Edit.move(tmpDelta + c1.index0, delta
								+ c0.index0));
						delta--;
						break;
					}
				}
			}

			if (!processed[k]) {
				if (delta == 0)
					moves.add(c0);
				else
					moves.add(new Edit(c0.type, delta + c0.index0, c0.index1));
			}
		}

		return moves;
	}

	private static <T> List<Edit> basicDiff(T[] a, T[] b,
			Comparator<? super T> comparator) {
		int[][] m = new int[a.length + 1][b.length + 1]; // 2D array,
		// initialized to 0

		// Actual algorithm
		for (int i = 1; i <= a.length; i++)
			for (int j = 1; j <= b.length; j++)
				if (comparator.compare(a[i - 1], b[j - 1]) == 0)
					m[i][j] = 1 + m[i - 1][j - 1];
				else
					m[i][j] = Math.max(m[i - 1][j], m[i][j - 1]);

		int i = a.length, j = b.length;
		List<Edit> result = new ArrayList<Edit>(
				Math.max(a.length, b.length) + 1);

		while (i != 0 && j != 0) {
			if (comparator.compare(a[i - 1], b[j - 1]) == 0) {
				i--;
				j--;
			} else if (m[i][j - 1] >= m[i - 1][j]) {
				j--;
				result.add(Edit.insert(i, j));
			} else {
				i--;
				result.add(Edit.delete(i, j));
			}
		}
		while (j != 0) {
			j--;
			result.add(Edit.insert(i, j));
		}
		while (i != 0) {
			i--;
			result.add(Edit.delete(i, j));
		}
		return result;
	}
}
