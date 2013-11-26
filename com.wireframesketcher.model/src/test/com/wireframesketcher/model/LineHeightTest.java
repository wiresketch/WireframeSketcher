package com.wireframesketcher.model;

import junit.framework.TestCase;

public class LineHeightTest extends TestCase {
	public void testParsing() {
		assertEquals(LineHeight.inEm(1.1), LineHeight.createFromString("1.1"));
		assertEquals(LineHeight.inPixels(10),
				LineHeight.createFromString("10px"));
		assertEquals(LineHeight.inPercents(100),
				LineHeight.createFromString("100%"));
	}

	public void testEmForRoundErrors() {
		int intEm = 100;
		for (double em = 1.0; em <= 3.0; em += 0.01, intEm++) {
			LineHeight lineHeight = LineHeight.inEm(em);
			assertEquals(intEm, lineHeight.getValue());
			String string = lineHeight.toString();
			assertFalse(string.contains(","));
			LineHeight parsedLineHeight = LineHeight.createFromString(string);
			assertEquals(lineHeight, parsedLineHeight);
		}
	}

	public void testFormatting() {
		assertEquals("1.0em", LineHeight.inEm(1).toString());
		assertEquals("1.0", LineHeight.inEm(1).toString(LineHeight.Unit.EM));
		assertEquals("1.13em", LineHeight.inEm(1.13).toString());
		assertEquals("1.13em", LineHeight.inEm(1.132).toString());
		assertEquals("2.9",
				LineHeight.inPercents(290).toEm().toString(LineHeight.Unit.EM));
	}
	
	public void testNormal() {
		assertEquals(LineHeight.NORMAL, LineHeight.createFromString("normal"));
		assertEquals(LineHeight.NORMAL, LineHeight.createFromString("normal", LineHeight.Unit.EM));
		assertEquals("normal", LineHeight.NORMAL.toString());
		assertEquals("normal", LineHeight.NORMAL.toString(LineHeight.Unit.EM));
	}

	public void testInvalidFormat() {
		try {
			LineHeight.createFromString("abc");
			fail();
		} catch (Exception e) {
		}
	}

	public void testConversion() {
		assertEquals(20, LineHeight.inPixels(20).toIntPixels(23));
		assertEquals(23 * 120 / 100, LineHeight.inPercents(120).toIntPixels(23));
		assertEquals(23 * 120 / 100, LineHeight.inEm(1.2).toIntPixels(23));
	}
}
