package com.wireframesketcher.model;

import junit.framework.TestCase;

public class LayoutParamsTest extends TestCase {
	public void testParsing() {
		assertEquals(LayoutParams.NONE, LayoutParams.createFromString(null));
		assertEquals(LayoutParams.NONE, LayoutParams.createFromString(""));
		assertEquals(LayoutParams.NONE, LayoutParams.createFromString("none"));
		assertEquals(LayoutParams.create(LayoutParams.ANCHOR_START, 0),
				LayoutParams.createFromString("anchor-left"));
		assertEquals(
				LayoutParams.create(LayoutParams.ANCHOR_START
						| LayoutParams.ANCHOR_END, 0),
				LayoutParams.createFromString("anchor-left, anchor-right"));
		assertEquals(
				LayoutParams.create(LayoutParams.ANCHOR_CENTER, 0),
				LayoutParams
						.createFromString("anchor-left, anchor-right, anchor-center"));
	}

	public void testInvalidFlagsHandling() {
		assertEquals(
				LayoutParams.create(LayoutParams.ANCHOR_CENTER, 0),
				LayoutParams.create(LayoutParams.ANCHOR_CENTER
						| LayoutParams.ANCHOR_START, 0));
	}

	public void testFormatting() {
		assertEquals("none", LayoutParams.NONE.toString());
		assertEquals("anchor-left",
				LayoutParams.create(LayoutParams.ANCHOR_START, 0).toString());
		assertEquals(
				"anchor-left|anchor-middle",
				LayoutParams.create(LayoutParams.ANCHOR_START,
						LayoutParams.ANCHOR_CENTER).toString());
		assertEquals(
				"anchor-left,anchor-right|anchor-middle",
				LayoutParams.create(
						LayoutParams.ANCHOR_START | LayoutParams.ANCHOR_END,
						LayoutParams.ANCHOR_CENTER).toString());
		assertEquals(
				"|anchor-top,anchor-bottom",
				LayoutParams.create(0,
						LayoutParams.ANCHOR_START | LayoutParams.ANCHOR_END)
						.toString());
	}

	public void testInstancePooling() {
		int[] allFlags = new int[] { LayoutParams.ANCHOR_NONE,
				LayoutParams.ANCHOR_START, LayoutParams.ANCHOR_CENTER,
				LayoutParams.ANCHOR_END, LayoutParams.ANCHOR_START_END };

		for (int h = 0; h < allFlags.length; h++) {
			for (int v = 0; v < allFlags.length; v++) {
				LayoutParams o1 = LayoutParams.create(allFlags[h], allFlags[v]);
				LayoutParams o2 = LayoutParams.create(allFlags[h], allFlags[v]);
				assertTrue("Testing: " + o1, o1 == o2);
			}
		}
	}
}
