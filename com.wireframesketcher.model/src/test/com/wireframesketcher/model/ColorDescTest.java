package com.wireframesketcher.model;

import junit.framework.TestCase;

public class ColorDescTest extends TestCase {

	public void testParseShortHex() {
		ColorDesc color = ColorDesc.createFromString("#ABC");
		assertEquals(0xAA, color.getRed());
		assertEquals(0xBB, color.getGreen());
		assertEquals(0xCC, color.getBlue());
	}

	public void testParseLongHex() {
		ColorDesc color = ColorDesc.createFromString("#ABCDEF");
		assertEquals(0xAB, color.getRed());
		assertEquals(0xCD, color.getGreen());
		assertEquals(0xEF, color.getBlue());
	}

	public void testParseNamed() {
		ColorDesc color = ColorDesc.createFromString("red");
		assertEquals(0xFF, color.getRed());
		assertEquals(0x00, color.getGreen());
		assertEquals(0x00, color.getBlue());
	}

	public void testParseInvalid() {
		assertNull(ColorDesc.createFromString("cucu"));
		assertNull(ColorDesc.createFromString("#A"));
	}

	public void testFormatting() {
		ColorDesc color = new ColorDesc(0, 0, 0xAB);
		assertEquals("#0000ab", color.toString());
		assertEquals("red", ColorDesc.red.toString());
	}
	
	public void testParseFallbacksToHex() {
		ColorDesc color = ColorDesc.createFromString("ABC");
		assertEquals(0xAA, color.getRed());
		assertEquals(0xBB, color.getGreen());
		assertEquals(0xCC, color.getBlue());
	}
}
