package com.wireframesketcher.model;

import junit.framework.TestCase;

public class VersionDescTest extends TestCase {
	public void testParsing() {
		VersionDesc test = VersionDesc.parseVersion("4.0.1.abc");
		assertEquals(new VersionDesc(4, 0, 1, "abc"), test);
		assertEquals("4.0.1.abc", test.toString());
	}

	public void testCompare() {
		assertTrue(VersionDesc.parseVersion("4.0.1").compareTo(
				VersionDesc.parseVersion("3.0.0")) > 0);
		assertTrue(VersionDesc.parseVersion("4.0.1").compareTo(
				VersionDesc.parseVersion("4.0.1")) == 0);
		assertTrue(VersionDesc.parseVersion("4.0.1").compareTo(
				VersionDesc.parseVersion("4.0.2")) < 0);
		assertTrue(VersionDesc.parseVersion("4.0.1").compareTo(
				VersionDesc.parseVersion("4.0.1.abc")) < 0);
	}

	public void testNullVersion() {
		assertTrue(VersionDesc.NO_VERSION == VersionDesc.parseVersion(null));
		assertTrue(VersionDesc.NO_VERSION == VersionDesc.parseVersion(""));
	}

	public void testErrors() {
		try {
			VersionDesc.parseVersion("a.b.c");
			fail();
		} catch (IllegalArgumentException e) {
		}
	}
}
