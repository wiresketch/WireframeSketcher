package com.wireframesketcher.model.util;

import junit.framework.TestCase;

public class WidgetTreeIteratorTest extends TestCase {

	public void testNull() {
		WidgetTreeIterator i = new WidgetTreeIterator(null);
		assertFalse(i.hasNext());
	}
}
