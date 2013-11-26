package com.wireframesketcher.model;

import java.util.StringTokenizer;

/**
 * Layout parameters that control how a widget resizes when it's container is
 * resized.
 */
public final class LayoutParams {
	/**
	 * Anchor flag: no anchor
	 */
	public static final int ANCHOR_NONE = 0;

	/**
	 * Anchor flag: start anchor (left or top)
	 */
	public static final int ANCHOR_START = 1 << 0;

	/**
	 * Anchor flag: center anchor
	 */
	public static final int ANCHOR_CENTER = 1 << 2;

	/**
	 * Anchor flag: end anchor (right or bottom)
	 */
	public static final int ANCHOR_END = 1 << 3;

	/**
	 * Anchor flag: start and end anchor (left and right or top and bottom)
	 */
	public static final int ANCHOR_START_END = ANCHOR_START | ANCHOR_END;

	/**
	 * Default anchor parameters
	 */
	public static final LayoutParams NONE = new LayoutParams(ANCHOR_NONE,
			ANCHOR_NONE);

	private static final int[] FLAGS = new int[] { ANCHOR_START, ANCHOR_CENTER,
			ANCHOR_END };

	private static final String[] FLAG_STRINGS_H = { "anchor-left",
			"anchor-center", "anchor-right" };

	private static final String[] FLAG_STRINGS_V = { "anchor-top",
			"anchor-middle", "anchor-bottom" };

	private final int horizontal;

	private final int vertical;

	private LayoutParams(int horizontal, int vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}

	/**
	 * Returns horizontal parameter. It's an or combination of ANCHOR_XXX flags.
	 */
	public int getHorizontal() {
		return horizontal;
	}

	/**
	 * Returns vertical parameter. It's an or combination of ANCHOR_XXX flags.
	 */
	public int getVertical() {
		return vertical;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof LayoutParams))
			return false;

		LayoutParams other = (LayoutParams) obj;
		return horizontal == other.horizontal && vertical == other.vertical;
	}

	@Override
	public int hashCode() {
		return horizontal * 37 + vertical;
	}

	/**
	 * Formats this parameters as parsable string
	 */
	@Override
	public String toString() {
		if (horizontal == 0 && vertical == 0)
			return "none";

		StringBuilder b = new StringBuilder();
		formatFlags(b, horizontal, FLAG_STRINGS_H);
		if (vertical != 0) {
			b.append('|');
			formatFlags(b, vertical, FLAG_STRINGS_V);
		}
		return b.toString();
	}

	private void formatFlags(StringBuilder b, int flags, String[] strings) {
		boolean empty = true;
		for (int i = 0; i < FLAGS.length; i++) {
			if ((flags & FLAGS[i]) != 0) {
				if (!empty)
					b.append(',');
				b.append(strings[i]);
				empty = false;
			}
		}
	}

	/**
	 * Parses parameters string into an instance of layout parameters.
	 * 
	 * @param s
	 *            the string
	 * @return layout parameters
	 */
	public static LayoutParams createFromString(String s) {
		if (s == null)
			return NONE;

		s = s.trim();

		if (s.length() == 0)
			return NONE;

		StringTokenizer tok = new StringTokenizer(s, ",|", true);
		int horizontal = parseFlags(tok, FLAG_STRINGS_H);
		int vertical = parseFlags(tok, FLAG_STRINGS_V);

		return create(horizontal, vertical);
	}

	private static int parseFlags(StringTokenizer tok, String[] strings) {
		int flags = 0;

		while (tok.hasMoreTokens()) {
			String s = tok.nextToken();
			if ("|".equals(s))
				break;
			if (",".equals(s))
				continue;

			s = s.trim();

			for (int i = 0; i < FLAGS.length; i++) {
				if (strings[i].equals(s)) {
					flags |= FLAGS[i];
					break;
				}
			}
		}
		return flags;
	}

	/**
	 * Creates an instance of layout parameters
	 * 
	 * @param horizontal
	 *            horizontal flags
	 * @param vertical
	 *            vertical flags
	 * @return layout parameters
	 */
	public static LayoutParams create(int horizontal, int vertical) {
		if (horizontal == 0 && vertical == 0)
			return NONE;

		horizontal = validateFlags(horizontal);
		vertical = validateFlags(vertical);

		LayoutParams value = LayoutParamsCache.get(horizontal, vertical);
		if (value == null)
			value = new LayoutParams(horizontal, vertical);

		return value;
	}

	private static int validateFlags(int flags) {
		if ((flags & ANCHOR_CENTER) != 0) {
			flags &= ~(ANCHOR_START | ANCHOR_END);
		}
		return flags;
	}

	private static final class LayoutParamsCache {
		// Total number of possible values: 5 ** 2
		private static final LayoutParams[] cache = new LayoutParams[25];

		public static LayoutParams get(int horizontal, int vertical) {
			LayoutParams found = null;

			for (int i = 0; i < cache.length && found == null; i++) {
				LayoutParams value = cache[i];
				if (value == null) {
					value = new LayoutParams(horizontal, vertical);
					cache[i] = found = value;
				} else {
					if (value.horizontal == horizontal
							&& value.vertical == vertical)
						found = value;
				}
			}

			return found;
		}
	}
}
