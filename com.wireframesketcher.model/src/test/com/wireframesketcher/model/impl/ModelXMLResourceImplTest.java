package com.wireframesketcher.model.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;

import com.wireframesketcher.model.Button;
import com.wireframesketcher.model.Label;
import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetGroup;
import com.wireframesketcher.model.impl.ModelXMLResourceImpl.DirectWidgetsIterator;
import com.wireframesketcher.model.overrides.Insert;
import com.wireframesketcher.model.story.Panel;
import com.wireframesketcher.model.story.StoryFactory;
import com.wireframesketcher.model.story.Storyboard;
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

		persister.getResourceSet()
				.createResource(URI.createURI("Ampersand&Bug.screen"))
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

	public void testPanelIdGeneration() {
		Persister persister = new Persister();
		Storyboard story = StoryFactory.eINSTANCE.createStoryboard();
		persister.getResourceSet()
				.createResource(URI.createURI("Storyboard.story"))
				.getContents().add(story);

		Screen a = ModelFactory.eINSTANCE.createScreen();
		persister.getResourceSet()
				.createResource(URI.createURI("ScreenA.screen")).getContents()
				.add(a);

		Panel aPanel = StoryFactory.eINSTANCE.createPanel();
		aPanel.setScreen(a);
		story.getPanels().add(aPanel);

		assertNotNull(aPanel.getId());

		Panel bPanel = StoryFactory.eINSTANCE.createPanel();
		bPanel.setScreen(a);
		story.getPanels().add(bPanel);

		assertNotNull(bPanel.getId());
		assertFalse(aPanel.getId().equals(bPanel.getId()));

		String id = aPanel.getId();

		story.getPanels().clear();
		aPanel = StoryFactory.eINSTANCE.createPanel();
		aPanel.setScreen(a);
		story.getPanels().add(aPanel);

		assertNotNull(aPanel.getId());
		assertEquals(id, aPanel.getId());
	}

	public void testDirectWidgetsIterator() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setX(10);
		button.setY(0);
		button.setText("Button");
		button.setId(Long.valueOf(1));
		a.getWidgets().add(button);

		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master bMaster = ModelFactory.eINSTANCE.createMaster();
		bMaster.setX(20);
		bMaster.setY(20);
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		Button insertButton = ModelFactory.eINSTANCE.createButton();
		insertButton.setX(20);
		insertButton.setY(20);
		insertButton.setText("Inserted Button");
		bMaster.getInstance().getWidgets().add(insertButton);

		WidgetGroup insertGroup = ModelFactory.eINSTANCE.createWidgetGroup();
		insertGroup.setX(20);
		insertGroup.setY(20);

		Button groupedButton = ModelFactory.eINSTANCE.createButton();
		groupedButton.setX(20);
		groupedButton.setY(20);
		groupedButton.setText("Grouped Button");
		insertGroup.getWidgets().add(groupedButton);

		bMaster.getInstance().getWidgets().add(insertGroup);

		DirectWidgetsIterator it = new DirectWidgetsIterator(b);
		List<Widget> directWidgetsList = new ArrayList<Widget>();
		while (it.hasNext()) {
			Widget w = it.next();
			directWidgetsList.add(w);
		}
		Set<Widget> directWidgetsSet = new HashSet<Widget>(directWidgetsList);

		assertEquals(directWidgetsSet.size(), directWidgetsList.size());

		assertTrue(directWidgetsSet.contains(bMaster));

		Insert insert = (Insert) bMaster.getOverrides().getWidgetChanges()
				.get(0);
		assertTrue(directWidgetsSet.contains(insert.getObject()));
		insert = (Insert) bMaster.getOverrides().getWidgetChanges().get(1);
		assertTrue(directWidgetsSet.contains(insert.getObject()));
	}

	public void testWidgetIdGeneration() throws IOException {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(a);

		Button button1 = ModelFactory.eINSTANCE.createButton();
		button1.setX(10);
		button1.setY(0);
		button1.setText("Button");
		a.getWidgets().add(button1);

		assertEquals(Long.valueOf(1), button1.getId());

		Button button2 = ModelFactory.eINSTANCE.createButton();
		button2.setX(10);
		button2.setY(0);
		button2.setText("Button");
		a.getWidgets().add(button2);

		assertEquals(Long.valueOf(2), button2.getId());

		button1.setId(null);

		persister.save(a, new ByteArrayOutputStream());

		assertEquals(Long.valueOf(3), button1.getId());

		Screen b = ModelFactory.eINSTANCE.createScreen();
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		Master bMaster = ModelFactory.eINSTANCE.createMaster();
		bMaster.setX(20);
		bMaster.setY(20);
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);

		assertEquals(Long.valueOf(1), bMaster.getId());

		Button insertButton = ModelFactory.eINSTANCE.createButton();
		insertButton.setX(20);
		insertButton.setY(20);
		insertButton.setText("Inserted Button");
		bMaster.getInstance().getWidgets().add(insertButton);

		Insert insert = (Insert) bMaster.getOverrides().getWidgetChanges()
				.get(0);
		Widget insertedWidget = (Widget) insert.getObject();
		assertEquals(Long.valueOf(2), insertedWidget.getId());

		insertedWidget.setId(null);
		
		persister.save(b, new ByteArrayOutputStream());
		assertEquals(Long.valueOf(3), insertedWidget.getId());
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		persister.save(a, out);

		Persister persister1 = new Persister();
		Screen a1 = (Screen) persister1.load(new ByteArrayInputStream(out
				.toByteArray()));
		Button button3 = ModelFactory.eINSTANCE.createButton();
		button3.setX(10);
		button3.setY(0);
		button3.setText("Button");
		a1.getWidgets().add(button3);

		assertEquals(Long.valueOf(4), button3.getId());
	}
}
