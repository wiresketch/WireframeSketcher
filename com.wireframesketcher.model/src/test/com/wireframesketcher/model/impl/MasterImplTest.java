package com.wireframesketcher.model.impl;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;

import com.wireframesketcher.model.Button;
import com.wireframesketcher.model.ButtonBar;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.overrides.ItemOverrides;
import com.wireframesketcher.model.overrides.Move;
import com.wireframesketcher.model.overrides.Operation;
import com.wireframesketcher.model.overrides.Overrides;
import com.wireframesketcher.model.overrides.WidgetOverrides;
import com.wireframesketcher.model.util.Persister;

public class MasterImplTest extends TestCase {
	public void testOverrides() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		ButtonBar buttonBar = ModelFactory.eINSTANCE.createButtonBar();
		buttonBar.setX(10);
		buttonBar.setY(0);
		buttonBar.setText("Item1,Item2,Item3");
		Item item1 = ModelFactory.eINSTANCE.createItem();
		item1.setText("Item1");
		buttonBar.getItems().add(item1);
		Item item2 = ModelFactory.eINSTANCE.createItem();
		item2.setText("Item2");
		buttonBar.getItems().add(item2);
		Item item3 = ModelFactory.eINSTANCE.createItem();
		item3.setText("Item3");
		buttonBar.getItems().add(item3);
		a.getWidgets().add(buttonBar);
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setX(30);
		button.setY(0);
		button.setText("OK");
		a.getWidgets().add(button);

		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master master = ModelFactory.eINSTANCE.createMaster();
		master.setX(20);
		master.setY(20);
		master.setScreen(a);
		b.getWidgets().add(master);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		assertNotNull(master.getInstance());
		ButtonBar buttonBarInstance = (ButtonBar) master.getInstance()
				.getWidgets().get(0);
		buttonBarInstance.setX(20);

		Overrides overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());

		WidgetOverrides wo = (WidgetOverrides) overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals(Integer.valueOf(20), wo.getX());

		buttonBarInstance.setX(10);
		assertNull(master.getOverrides());

		buttonBarInstance.setSelection("2");
		overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = (WidgetOverrides) overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("2", wo.getAttributes().get("selection"));
		buttonBarInstance.setSelection(null);
		overrides = master.getOverrides();
		assertNull(overrides);
	
		buttonBarInstance.getFont().setBold(Boolean.TRUE);
		overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = (WidgetOverrides) overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertNotNull(wo.getFont());
		assertEquals(Boolean.TRUE, wo.getFont().getBold());

		buttonBarInstance.getFont().setItalic(Boolean.TRUE);
		assertSame(overrides, master.getOverrides());
		buttonBarInstance.getFont().setItalic(null);
		buttonBarInstance.getFont().setBold(null);
		assertNull(master.getOverrides());

		Item item1Instance = buttonBarInstance.getItems().get(0);
		item1Instance.setLink(URI.createURI("link.screen"));

		overrides = master.getOverrides();
		
		assertEquals(1, overrides.getWidgets().size());
		wo = (WidgetOverrides) overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals(1, wo.getItems().size());
		ItemOverrides io = wo.getItems().get(0);
		assertEquals("@items.0", io.getRef());
		assertEquals(URI.createURI("link.screen"), io.getLink());

		item1Instance.setLink(null);
		assertNull(master.getOverrides());

		master.getInstance().getWidgets().move(1, 0);
		
		overrides = master.getOverrides();
		assertEquals(1, overrides.getWidgetChanges().size());
		Operation op = overrides.getWidgetChanges().get(0);
		assertTrue(op instanceof Move);
		Move move = (Move) op;
		assertEquals("1", move.getRef());
		assertEquals(1, move.getNewIndex());
	}
}
