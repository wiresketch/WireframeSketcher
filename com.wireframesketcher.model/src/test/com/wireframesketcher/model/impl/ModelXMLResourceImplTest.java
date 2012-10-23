package com.wireframesketcher.model.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;

import com.wireframesketcher.model.Label;
import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.WidgetGroup;
import com.wireframesketcher.model.util.Persister;

public class ModelXMLResourceImplTest extends TestCase {
	public void testFragmentEscaping() throws Exception {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		WidgetGroup group = ModelFactory.eINSTANCE.createWidgetGroup();
		Label label = ModelFactory.eINSTANCE.createLabel();
		label.setText("Label");
		group.getWidgets().add(label);
		group.setName("Copy & Paste"); // & must be escaped
		a.getWidgets().add(group);

		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master master = ModelFactory.eINSTANCE.createMaster();
		master.setScreen(group);
		b.getWidgets().add(master);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		persister.save(b, bytes); // save XML
		Screen c = (Screen) persister.load(new ByteArrayInputStream(bytes
				.toByteArray())); // parse
		// XML
		assertEquals("Copy & Paste", ((WidgetGroup) ((Master) c.getWidgets()
				.get(0)).getScreen()).getName());
	}
	
	public void testHrefEscaping() throws Exception {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();

		persister.getResourceSet().createResource(URI.createURI("Ampersand&Bug.screen"))
				.getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master master = ModelFactory.eINSTANCE.createMaster();
		master.setScreen(a);
		b.getWidgets().add(master);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		persister.save(b, bytes); // save XML
		Screen c = (Screen) persister.load(new ByteArrayInputStream(bytes
				.toByteArray())); // parse
	}
}
