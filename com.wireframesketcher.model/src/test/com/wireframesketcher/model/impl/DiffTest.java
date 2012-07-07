package com.wireframesketcher.model.impl;

import junit.framework.TestCase;

import com.wireframesketcher.model.impl.Diff.Edit;

public class DiffTest extends TestCase {
	public void testEmpty() {
		Edit[] diff = Diff.diff(new Object[0], new Object[0],
				Diff.EQUALITY_COMPARATOR);
		assertEquals(0, diff.length);
	}

	public void testEquals() {
		Edit[] diff = diff("ab", "ab");
		assertEquals(0, diff.length);
	}

	public void testDelete() {
		Edit[] diff = diff("abc", "ac");
		assertEquals(1, diff.length);
		assertEquals(Diff.Edit.delete(1, 1), diff[0]);
	}

	public void testTwoDeletes() {
		Edit[] diff = diff("abcd", "ac");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.delete(3, 2), diff[0]);
		assertEquals(Diff.Edit.delete(1, 1), diff[1]);
	}

	public void testAllDeletes() {
		Edit[] diff = diff("abc", "");
		assertEquals(3, diff.length);
		assertEquals(Diff.Edit.delete(2, 0), diff[0]);
		assertEquals(Diff.Edit.delete(1, 0), diff[1]);
		assertEquals(Diff.Edit.delete(0, 0), diff[2]);
	}

	public void testAllDeletes1() {
		Edit[] diff = diff("abc", "c");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.delete(1, 0), diff[0]);
		assertEquals(Diff.Edit.delete(0, 0), diff[1]);
	}

	public void testInsert() {
		Edit[] diff = diff("ac", "abc");
		assertEquals(1, diff.length);
		assertEquals(Diff.Edit.insert(1, 1), diff[0]);
	}

	public void testTwoInserts() {
		Edit[] diff = diff("ac", "abcd");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.insert(2, 3), diff[0]);
		assertEquals(Diff.Edit.insert(1, 1), diff[1]);
	}

	public void testAllInserts() {
		Edit[] diff = diff("", "abc");
		assertEquals(3, diff.length);
		assertEquals(Diff.Edit.insert(0, 2), diff[0]);
		assertEquals(Diff.Edit.insert(0, 1), diff[1]);
		assertEquals(Diff.Edit.insert(0, 0), diff[2]);
	}

	public void testAllInserts1() {
		Edit[] diff = diff("a", "abc");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.insert(1, 2), diff[0]);
		assertEquals(Diff.Edit.insert(1, 1), diff[1]);
	}

	public void testAllInserts2() {
		Edit[] diff = diff("c", "abc");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.insert(0, 1), diff[0]);
		assertEquals(Diff.Edit.insert(0, 0), diff[1]);
	}

	public void testChange() {
		Edit[] diff = diff("adc", "abc");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.insert(2, 1), diff[0]);
		assertEquals(Diff.Edit.delete(1, 1), diff[1]);
	}

	public void testTwoChanges() {
		Edit[] diff = diff("aefd", "abcd");
		assertEquals(4, diff.length);
		assertEquals(Diff.Edit.insert(3, 2), diff[0]);
		assertEquals(Diff.Edit.insert(3, 1), diff[1]);
		assertEquals(Diff.Edit.delete(2, 1), diff[2]);
		assertEquals(Diff.Edit.delete(1, 1), diff[3]);
	}

	public void testComplex() {
		Edit[] diff = diff("acde", "abce");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.delete(2, 3), diff[0]);
		assertEquals(Diff.Edit.insert(1, 1), diff[1]);
	}

	public void testMoves() {
		Edit[] diff = diffWithMoves("ab", "ba");
		assertEquals(1, diff.length);
		assertEquals(Diff.Edit.move(0, 2), diff[0]);

		diff = diffWithMoves("ab", "ab");
		assertEquals(0, diff.length);

		diff = diffWithMoves("abcd", "dabc");
		assertEquals(1, diff.length);
		assertEquals(Diff.Edit.move(3, 0), diff[0]);

		diff = diffWithMoves("abcd", "bcda");
		assertEquals(1, diff.length);
		assertEquals(Diff.Edit.move(0, 4), diff[0]);

		diff = diffWithMoves("abcdef", "feabcd");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.move(5, 0), diff[0]);
		assertEquals(Diff.Edit.move(5, 1), diff[1]);

		diff = diffWithMoves("abcdef", "efabcd");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.move(5, 0), diff[0]);
		assertEquals(Diff.Edit.move(5, 0), diff[1]);

		diff = diffWithMoves("abc", "ca");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.move(0, 3), diff[0]);
		assertEquals(Diff.Edit.delete(0, 0), diff[1]);

		diff = diffWithMoves("abcd", "abce");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.insert(4, 3), diff[0]);
		assertEquals(Diff.Edit.delete(3, 3), diff[1]);
		
		diff = diffWithMoves("abcde", "baced");
		assertEquals(2, diff.length);
		assertEquals(Diff.Edit.move(3, 5), diff[0]);
		assertEquals(Diff.Edit.move(0, 2), diff[1]);
	}

	private static Edit[] diff(String s1, String s2) {
		String[] a = split(s1);
		String[] b = split(s2);
		return Diff.diff(a, b, Diff.EQUALITY_COMPARATOR);
	}

	private static Edit[] diffWithMoves(String s1, String s2) {
		String[] a = split(s1);
		String[] b = split(s2);
		return Diff.diffWithMoves(a, b, Diff.EQUALITY_COMPARATOR);
	}

	private static String[] split(String s) {
		String[] r = new String[s.length()];
		for (int i = 0; i < r.length; i++)
			r[i] = Character.toString(s.charAt(i));
		return r;
	}
}
