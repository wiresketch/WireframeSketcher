package com.wireframesketcher.model;

import junit.framework.TestCase;

public class FontSizeTest extends TestCase {
	public void testString() {
		assertEquals("12px", FontSize.inPixels(12).toString());
		assertEquals("12pt", FontSize.inPoints(12).toString());
		assertEquals("12", FontSize.inPixels(12).toString(FontSize.Unit.PIXELS));
	}

	public void testFromString() {
		assertEquals(FontSize.inPixels(12), FontSize.createFromString("12px"));
		assertEquals(FontSize.inPoints(12), FontSize.createFromString("12pt"));
		// This ensures that old unitless values are interpreted as points:
		assertEquals(FontSize.inPoints(12), FontSize.createFromString("12"));
		assertNull(FontSize.createFromString(""));
		assertNull(FontSize.createFromString(null));
	}

	public void testInvalidFormat() {
		try {
			FontSize.createFromString("abc");
			fail();
		} catch (Exception e) {
		}
	}

	public void testConversion() {
		FontSize _9pt = FontSize.inPoints(9);
		assertEquals(_9pt, _9pt.toPoints(96));
		assertEquals(_9pt, _9pt.toPixels(96).toPoints(96));

		testConversionForDPI(72);
		testConversionForDPI(96);
		testConversionForDPI(120);
	}

	private void testConversionForDPI(int dpi) {
		for (int size = 7; size <= 72; size++) {
			FontSize fontSize = FontSize.inPoints(size);
			assertEquals(fontSize, fontSize.toPixels(dpi).toPoints(dpi));
		}
	}

	public void testDefaultFontSize() {
		// Segoe UI on Windows defaults to 9pt and DPI is 96
		assertEquals(FontSize.inPixels(12), FontSize.inPoints(9).toPixels(96));
	}
}
