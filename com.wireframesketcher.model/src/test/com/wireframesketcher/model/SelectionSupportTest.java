package com.wireframesketcher.model;

import java.io.ByteArrayInputStream;

import junit.framework.TestCase;

import com.wireframesketcher.model.util.Persister;

public class SelectionSupportTest extends TestCase {
	public void testSelectionParsing() throws Exception {
		String xml = "<?xml version='1.0' encoding='UTF-8'?>"
				+ "<model:Screen xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:model='http://wireframesketcher.com/1.0/model.ecore'>"
				+ "<widgets xsi:type='model:ButtonBar' id='1' selection='0'/>"
				+ "</model:Screen>";

		Persister persister = new Persister();
		Screen screen = (Screen) persister.load(new ByteArrayInputStream(xml
				.getBytes("UTF-8")));
		ButtonBar buttonBar = (ButtonBar) screen.getWidgets().get(0);
		assertEquals(0, buttonBar.getSelection());
	}

	public void testEmptySelectionParsing() throws Exception {
		String xml = "<?xml version='1.0' encoding='UTF-8'?>"
				+ "<model:Screen xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:model='http://wireframesketcher.com/1.0/model.ecore'>"
				+ "<widgets xsi:type='model:ButtonBar' id='1' selection=''/>"
				+ "</model:Screen>";

		Persister persister = new Persister();
		Screen screen = (Screen) persister.load(new ByteArrayInputStream(xml
				.getBytes("UTF-8")));
		ButtonBar buttonBar = (ButtonBar) screen.getWidgets().get(0);
		assertEquals(-1, buttonBar.getSelection());
	}

	public void testNullSelectionParsing() throws Exception {
		String xml = "<?xml version='1.0' encoding='UTF-8'?>"
				+ "<model:Screen xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:model='http://wireframesketcher.com/1.0/model.ecore'>"
				+ "<widgets xsi:type='model:ButtonBar' id='1'/>"
				+ "</model:Screen>";

		Persister persister = new Persister();
		Screen screen = (Screen) persister.load(new ByteArrayInputStream(xml
				.getBytes("UTF-8")));
		ButtonBar buttonBar = (ButtonBar) screen.getWidgets().get(0);
		assertEquals(-1, buttonBar.getSelection());
	}

	public void testAlternativeSelectionParsing() throws Exception {
		String xml = "<?xml version='1.0' encoding='UTF-8'?>"
				+ "<model:Screen xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:model='http://wireframesketcher.com/1.0/model.ecore'>"
				+ "<widgets xsi:type='model:ButtonBar' id='1' selection='Item 1'/>"
				+ "</model:Screen>";

		Persister persister = new Persister();
		Screen screen = (Screen) persister.load(new ByteArrayInputStream(xml
				.getBytes("UTF-8")));
		ButtonBar buttonBar = (ButtonBar) screen.getWidgets().get(0);
		assertEquals(-1, buttonBar.getSelection());
	}
}
