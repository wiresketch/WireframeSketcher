package com.wireframesketcher.model.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin.Implementation;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.wireframesketcher.model.Button;
import com.wireframesketcher.model.ButtonBar;
import com.wireframesketcher.model.Checkbox;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.Item;
import com.wireframesketcher.model.Label;
import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.Panel;
import com.wireframesketcher.model.Placeholder;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.State;
import com.wireframesketcher.model.Text;
import com.wireframesketcher.model.TextAlignment;
import com.wireframesketcher.model.TextField;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetContainer;
import com.wireframesketcher.model.WidgetGroup;
import com.wireframesketcher.model.overrides.Delete;
import com.wireframesketcher.model.overrides.Insert;
import com.wireframesketcher.model.overrides.ItemOverrides;
import com.wireframesketcher.model.overrides.Move;
import com.wireframesketcher.model.overrides.Operation;
import com.wireframesketcher.model.overrides.Overrides;
import com.wireframesketcher.model.overrides.WidgetOverrides;
import com.wireframesketcher.model.util.Persister;

import junit.framework.TestCase;

public class MasterImplTest extends TestCase {
	private static class TestEcorePluginImplementation extends Implementation {
		@Override
		public void log(Object logEntry) {
			if (logEntry instanceof RuntimeException)
				throw (RuntimeException) logEntry;

			super.log(logEntry);
		}
	}

	@Override
	protected void setUp() throws Exception {
		TestEcorePluginImplementation impl = new TestEcorePluginImplementation();
	}

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

		buttonBarInstance.setSelection(2);
		overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = (WidgetOverrides) overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("2", wo.getAttributes().get("selection"));
		buttonBarInstance.setSelection(-1);
		overrides = master.getOverrides();
		assertNull(overrides);

		buttonBarInstance.getFont().setBold(Boolean.TRUE);
		overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = (WidgetOverrides) overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertNull(wo.getAttributes().get("selection"));
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

	public void testBug1171() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		WidgetGroup group = ModelFactory.eINSTANCE.createWidgetGroup();
		group.setId(new Long(2));
		a.getWidgets().add(group);

		Panel panel1 = ModelFactory.eINSTANCE.createPanel();
		panel1.setId(new Long(23));
		group.getWidgets().add(panel1);

		Panel panel2 = ModelFactory.eINSTANCE.createPanel();
		panel2.setId(new Long(3));
		group.getWidgets().add(panel2);

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

		// Remove the panel with id=23
		((WidgetGroup) master.getInstance().getWidgets().get(0)).getWidgets()
				.remove(0);

		Overrides overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());

		WidgetOverrides widgetOverrides = overrides.getWidgets().get(0);
		assertEquals(1, widgetOverrides.getWidgetChanges().size());

		Operation operation = widgetOverrides.getWidgetChanges().get(0);
		assertTrue(operation instanceof Delete);
		assertEquals("23", ((Delete) operation).getRef());
	}

	public void testEmptyGroupBug() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		WidgetGroup group = ModelFactory.eINSTANCE.createWidgetGroup();
		group.setId(new Long(2));
		a.getWidgets().add(group);

		Panel panel1 = ModelFactory.eINSTANCE.createPanel();
		panel1.setId(new Long(23));
		group.getWidgets().add(panel1);

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

		// Remove the panel with id=23
		((WidgetGroup) master.getInstance().getWidgets().get(0)).getWidgets()
				.remove(0);

		Overrides overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());

		WidgetOverrides widgetOverrides = overrides.getWidgets().get(0);
		assertEquals(1, widgetOverrides.getWidgetChanges().size());

		Operation operation = widgetOverrides.getWidgetChanges().get(0);
		assertTrue(operation instanceof Delete);
		assertEquals("23", ((Delete) operation).getRef());
	}

	public void testRelativeURIBug() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		WidgetGroup group = ModelFactory.eINSTANCE.createWidgetGroup();
		a.getWidgets().add(group);

		Panel panel1 = ModelFactory.eINSTANCE.createPanel();
		group.getWidgets().add(panel1);

		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(a);
		resetIds(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master master = ModelFactory.eINSTANCE.createMaster();
		master.setX(20);
		master.setY(20);
		master.setScreen(a);
		b.getWidgets().add(master);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		// Remove the panel with id=23
		((WidgetGroup) master.getInstance().getWidgets().get(0)).getWidgets()
				.remove(0);

		Overrides overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());

		WidgetOverrides widgetOverrides = overrides.getWidgets().get(0);
		assertEquals(1, widgetOverrides.getWidgetChanges().size());

		Operation operation = widgetOverrides.getWidgetChanges().get(0);
		assertTrue(operation instanceof Delete);
		assertEquals("/@widgets.0", ((Delete) operation).getRef());

		// Force overrides to be reapplied
		master.setScreen(a);

		// Test that the panel remove is properly applied
		assertTrue(((WidgetGroup) master.getInstance().getWidgets().get(0))
				.getWidgets().isEmpty());
	}

	private void resetIds(WidgetContainer container) {
		EList<Widget> widgets = container.getWidgets();
		for (Widget widget : widgets) {
			widget.setId(null);
			if (widget instanceof WidgetContainer)
				resetIds((WidgetContainer) widget);
		}
	}

	public void testDeleteWidgetLink() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setId(new Long(1));
		button.setLink(URI.createURI("link.screen"));
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

		// Remove the link for button
		((Button) master.getInstance().getWidgets().get(0)).setLink(null);

		Overrides overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());

		WidgetOverrides widgetOverrides = overrides.getWidgets().get(0);

		assertNull(widgetOverrides.getLink());
		assertTrue(widgetOverrides.isNoLink());

		// Force overrides to be reapplied
		master.setScreen(a);

		// Test that the link delete is properly applied
		assertNull(((Button) master.getInstance().getWidgets().get(0))
				.getLink());

		((Button) master.getInstance().getWidgets().get(0)).setLink(URI
				.createURI("link1.screen"));
		overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());

		widgetOverrides = overrides.getWidgets().get(0);

		assertEquals(URI.createURI("link1.screen"), widgetOverrides.getLink());
		assertFalse(widgetOverrides.isNoLink());

		((Button) master.getInstance().getWidgets().get(0)).setLink(URI
				.createURI("link.screen"));
		overrides = master.getOverrides();
		assertNull(overrides);
	}

	public void testDeleteItemLink() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		ButtonBar buttonBar = ModelFactory.eINSTANCE.createButtonBar();
		buttonBar.setId(new Long(1));
		buttonBar.setX(10);
		buttonBar.setY(0);
		buttonBar.setText("Item1,Item2,Item3");
		Item item1 = ModelFactory.eINSTANCE.createItem();
		item1.setText("Item1");
		item1.setLink(URI.createURI("link1.screen"));
		buttonBar.getItems().add(item1);
		Item item2 = ModelFactory.eINSTANCE.createItem();
		item2.setText("Item2");
		item2.setLink(URI.createURI("link2.screen"));
		buttonBar.getItems().add(item2);
		Item item3 = ModelFactory.eINSTANCE.createItem();
		item3.setText("Item3");
		item3.setLink(URI.createURI("link3.screen"));
		buttonBar.getItems().add(item3);
		a.getWidgets().add(buttonBar);

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

		ButtonBar buttonBarInstance = (ButtonBar) master.getInstance()
				.getWidgets().get(0);

		// Remove the link for button
		buttonBarInstance.getItems().get(1).setLink(null);

		Overrides overrides = master.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		WidgetOverrides wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals(1, wo.getItems().size());
		ItemOverrides io = wo.getItems().get(0);
		assertEquals("@items.1", io.getRef());
		assertNull(io.getLink());
		assertTrue(io.isNoLink());

		// Force overrides to be reapplied
		master.setScreen(a);

		buttonBarInstance = (ButtonBar) master.getInstance().getWidgets()
				.get(0);

		// Test that the link delete is properly applied
		assertNull(buttonBarInstance.getItems().get(1).getLink());

		buttonBarInstance.getItems().get(1)
				.setLink(URI.createURI("link1.screen"));

		overrides = master.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals(1, wo.getItems().size());
		io = wo.getItems().get(0);
		assertEquals("@items.1", io.getRef());
		assertEquals(URI.createURI("link1.screen"), io.getLink());
		assertFalse(io.isNoLink());

		buttonBarInstance.getItems().get(1)
				.setLink(URI.createURI("link2.screen"));

		overrides = master.getOverrides();

		assertNull(overrides);
	}

	public void testNestingNotifications2Levels() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setX(10);
		button.setY(0);
		button.setText("Button");
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

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		assertNotNull(cMaster.getInstance());
		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		assertNotNull(bMasterInstance.getInstance());
		Button aButtonInstance = (Button) bMasterInstance.getInstance()
				.getWidgets().get(0);
		assertNotNull(aButtonInstance);
		aButtonInstance.setBackground(ColorDesc.red);

		Screen aAlt = ModelFactory.eINSTANCE.createScreen();
		Button buttonAlt = ModelFactory.eINSTANCE.createButton();
		buttonAlt.setX(10);
		buttonAlt.setY(0);
		buttonAlt.setText("Button Alt");
		aAlt.getWidgets().add(buttonAlt);

		persister.getResourceSet()
				.getResource(URI.createURI("a.screen"), false).unload();
		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(aAlt);

		bMaster.setScreen(aAlt);

		bMasterInstance = (Master) cMaster.getInstance().getWidgets().get(0);
		assertNotNull(bMasterInstance.getInstance());
		aButtonInstance = (Button) bMasterInstance.getInstance().getWidgets()
				.get(0);
		assertNotNull(aButtonInstance);
		assertEquals("Button Alt", aButtonInstance.getText());
		assertEquals(ColorDesc.red, aButtonInstance.getBackground());
	}

	public void testNestingNotifications3Levels() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setX(10);
		button.setY(0);
		button.setText("Button");
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

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		Screen d = ModelFactory.eINSTANCE.createScreen();
		Master dMaster = ModelFactory.eINSTANCE.createMaster();
		dMaster.setX(20);
		dMaster.setY(20);
		dMaster.setScreen(c);
		d.getWidgets().add(dMaster);
		persister.getResourceSet().createResource(URI.createURI("d.screen"))
				.getContents().add(d);

		assertNotNull(dMaster.getInstance());
		Master cMasterInstance = (Master) dMaster.getInstance().getWidgets()
				.get(0);
		assertNotNull(cMasterInstance.getInstance());
		Master bMasterInstance = (Master) cMasterInstance.getInstance()
				.getWidgets().get(0);
		assertNotNull(bMasterInstance.getInstance());
		Button aButtonInstance = (Button) bMasterInstance.getInstance()
				.getWidgets().get(0);
		assertNotNull(aButtonInstance);
		aButtonInstance.setBackground(ColorDesc.red);

		Screen cAlt = ModelFactory.eINSTANCE.createScreen();
		Master cAltMaster = ModelFactory.eINSTANCE.createMaster();
		cAltMaster.setX(20);
		cAltMaster.setY(20);
		cAltMaster.setScreen(b);
		cAlt.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(cAlt);

		dMaster.setScreen(cAlt);

		Screen aAlt = ModelFactory.eINSTANCE.createScreen();
		Button buttonAlt = ModelFactory.eINSTANCE.createButton();
		buttonAlt.setX(10);
		buttonAlt.setY(0);
		buttonAlt.setText("Button Alt");
		aAlt.getWidgets().add(buttonAlt);

		persister.getResourceSet()
				.getResource(URI.createURI("a.screen"), false).unload();
		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(aAlt);

		bMasterInstance.setScreen(aAlt); // Replace screen ref in instances too
		bMaster.setScreen(aAlt);

		cMasterInstance = (Master) dMaster.getInstance().getWidgets().get(0);
		assertNotNull(cMasterInstance.getInstance());
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets()
				.get(0);
		assertNotNull(bMasterInstance.getInstance());
		aButtonInstance = (Button) bMasterInstance.getInstance().getWidgets()
				.get(0);
		assertNotNull(aButtonInstance);
		assertEquals("Button Alt", aButtonInstance.getText());
		assertEquals(ColorDesc.red, aButtonInstance.getBackground());
	}

	public void testDeepOverrides() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setX(10);
		button.setY(0);
		button.setText("Button");
		button.setId(Long.valueOf(2));
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

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		assertNotNull(cMaster.getInstance());
		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		assertNotNull(bMasterInstance.getInstance());
		Button aButtonInstance = (Button) bMasterInstance.getInstance()
				.getWidgets().get(0);
		assertNotNull(aButtonInstance);

		aButtonInstance.setLocked(true);

		Overrides overrides = cMaster.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		WidgetOverrides wo = overrides.getWidgets().get(0);
		assertEquals(Boolean.TRUE, EcoreUtil.createFromString(
				ModelPackage.Literals.WIDGET__LOCKED.getEAttributeType(), wo
						.getAttributes().get("locked")));
		assertEquals("1/2", wo.getRef());

		// Force overrides to be reapplied
		cMaster.setScreen(b);

		// TODO: Test that content trackers are removed?

		Master bMasterInstanceAlt = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		assertTrue(bMasterInstance != bMasterInstanceAlt);
		assertNotNull(bMasterInstanceAlt.getInstance());
		Button aButtonInstanceAlt = (Button) bMasterInstanceAlt.getInstance()
				.getWidgets().get(0);
		assertNotNull(aButtonInstanceAlt);
		assertTrue(aButtonInstanceAlt != aButtonInstance);
		assertTrue(aButtonInstanceAlt.isLocked());
	}

	public void testNestedInsert() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setX(10);
		button.setY(0);
		button.setText("Button");
		a.getWidgets().add(button);

		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master bMaster = ModelFactory.eINSTANCE.createMaster();
		bMaster.setX(20);
		bMaster.setY(20);
		bMaster.setId(Long.valueOf(1));
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setId(Long.valueOf(1));
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		Screen d = ModelFactory.eINSTANCE.createScreen();
		Master dMaster = ModelFactory.eINSTANCE.createMaster();
		dMaster.setX(20);
		dMaster.setY(20);
		dMaster.setId(Long.valueOf(1));
		dMaster.setScreen(c);
		d.getWidgets().add(dMaster);
		persister.getResourceSet().createResource(URI.createURI("d.screen"))
				.getContents().add(d);

		Master cMasterInstance = (Master) dMaster.getInstance().getWidgets()
				.get(0);
		Master bMasterInstance = (Master) cMasterInstance.getInstance()
				.getWidgets().get(0);
		Label label = ModelFactory.eINSTANCE.createLabel();
		label.setText("Label");
		cMasterInstance.getInstance().getWidgets().add(label);
		Label label2 = ModelFactory.eINSTANCE.createLabel();
		label2.setText("Label 2");
		bMasterInstance.getInstance().getWidgets().add(label2);

		assertNotNull(dMaster.getOverrides());
		EList<WidgetOverrides> widgetsOverrides = dMaster.getOverrides()
				.getWidgets();
		assertEquals(2, widgetsOverrides.size());
		WidgetOverrides widgetOverrides = widgetsOverrides.get(0);
		assertEquals("1/1", widgetOverrides.getRef());
		assertEquals(1, widgetOverrides.getWidgetChanges().size());
		Operation op = widgetOverrides.getWidgetChanges().get(0);
		assertTrue(op instanceof Insert);

		widgetOverrides = widgetsOverrides.get(1);
		assertEquals("1", widgetOverrides.getRef());
		assertEquals(1, widgetOverrides.getWidgetChanges().size());
		op = widgetOverrides.getWidgetChanges().get(0);
		assertTrue(op instanceof Insert);

		Screen aAlt = ModelFactory.eINSTANCE.createScreen();
		Button buttonAlt = ModelFactory.eINSTANCE.createButton();
		buttonAlt.setX(10);
		buttonAlt.setY(0);
		buttonAlt.setText("Button Alt");
		aAlt.getWidgets().add(buttonAlt);

		persister.getResourceSet()
				.getResource(URI.createURI("a.screen"), false).unload();
		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(aAlt);

		bMasterInstance.setScreen(aAlt); // Replace screen ref in instances too
		bMaster.setScreen(aAlt);

		cMasterInstance = (Master) dMaster.getInstance().getWidgets().get(0);
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets()
				.get(0);
		Label insertedLabel = (Label) cMasterInstance.getInstance()
				.getWidgets().get(1);
		assertEquals("Label", insertedLabel.getText());
		Label insertedLabel2 = (Label) bMasterInstance.getInstance()
				.getWidgets().get(1);
		assertEquals("Label 2", insertedLabel2.getText());
	}

	public void testMissingNestedMasterNPE() {
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
		bMaster.setId(Long.valueOf(1));
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);
		Master bMasterMissing = ModelFactory.eINSTANCE.createMaster();
		bMasterMissing.setX(20);
		bMasterMissing.setY(20);
		bMasterMissing.setId(Long.valueOf(2));
		b.getWidgets().add(bMasterMissing);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setId(Long.valueOf(1));
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		Button buttonInstance = (Button) bMasterInstance.getInstance()
				.getWidgets().get(0);
		buttonInstance.setState(State.DISABLED);
		Label label = ModelFactory.eINSTANCE.createLabel();
		label.setText("Label");
		bMasterInstance.getInstance().getWidgets().add(label);

		assertNotNull(cMaster.getOverrides());

		EList<WidgetOverrides> widgetsOverrides = cMaster.getOverrides()
				.getWidgets();
		assertEquals(2, widgetsOverrides.size());
		WidgetOverrides widgetOverrides = widgetsOverrides.get(0);
		assertEquals("1/1", widgetOverrides.getRef());
		assertEquals(
				State.DISABLED.getLiteral(),
				widgetOverrides.getAttributes().get(
						ModelPackage.Literals.STATE_SUPPORT__STATE.getName()));

		widgetOverrides = widgetsOverrides.get(1);
		assertEquals("1", widgetOverrides.getRef());
		assertEquals(1, widgetOverrides.getWidgetChanges().size());
		Operation op = widgetOverrides.getWidgetChanges().get(0);
		assertTrue(op instanceof Insert);
	}

	public void testDeleteText() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		TextField textField = ModelFactory.eINSTANCE.createTextField();
		textField.setId(new Long(1));
		textField.setX(10);
		textField.setY(0);
		textField.setText("Text");
		a.getWidgets().add(textField);

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

		TextField textFieldInstance = (TextField) master.getInstance()
				.getWidgets().get(0);

		// Remove the text
		textFieldInstance.setText("");

		Overrides overrides = master.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		WidgetOverrides wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("", wo.getText());
		assertTrue(wo.isNoText());

		// Force overrides to be reapplied
		master.setScreen(a);

		textFieldInstance = (TextField) master.getInstance().getWidgets()
				.get(0);

		// Test that the text delete is properly applied
		assertEquals("", textFieldInstance.getText());

		textFieldInstance.setText("Override");

		overrides = master.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("Override", wo.getText());
		assertFalse(wo.isNoText());

		textFieldInstance.setText("Text");

		overrides = master.getOverrides();

		assertNull(overrides);
	}

	public void testNestedMasterClassCast() {
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
		bMaster.setId(Long.valueOf(1));
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setId(Long.valueOf(1));
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		Button buttonInstance = (Button) bMasterInstance.getInstance()
				.getWidgets().get(0);
		buttonInstance.setState(State.DISABLED);

		assertNotNull(cMaster.getOverrides());

		EList<WidgetOverrides> widgetsOverrides = cMaster.getOverrides()
				.getWidgets();
		assertEquals(1, widgetsOverrides.size());
		WidgetOverrides widgetOverrides = widgetsOverrides.get(0);
		assertEquals("1/1", widgetOverrides.getRef());
		assertEquals(
				State.DISABLED.getLiteral(),
				widgetOverrides.getAttributes().get(
						ModelPackage.Literals.STATE_SUPPORT__STATE.getName()));

		b.getWidgets().remove(0);
		Button replacement = ModelFactory.eINSTANCE.createButton();
		replacement.setX(20);
		replacement.setY(20);
		replacement.setId(Long.valueOf(1));
		b.getWidgets().add(replacement);

		cMaster.setScreen(b);
	}

	public void testNestedMasterMissingNPE() {
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
		bMaster.setId(Long.valueOf(1));
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setId(Long.valueOf(1));
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		Button buttonInstance = (Button) bMasterInstance.getInstance()
				.getWidgets().get(0);
		buttonInstance.setState(State.DISABLED);

		assertNotNull(cMaster.getOverrides());

		EList<WidgetOverrides> widgetsOverrides = cMaster.getOverrides()
				.getWidgets();
		assertEquals(1, widgetsOverrides.size());
		WidgetOverrides widgetOverrides = widgetsOverrides.get(0);
		assertEquals("1/1", widgetOverrides.getRef());
		assertEquals(
				State.DISABLED.getLiteral(),
				widgetOverrides.getAttributes().get(
						ModelPackage.Literals.STATE_SUPPORT__STATE.getName()));

		persister.getResourceSet()
				.getResource(URI.createURI("a.screen"), false).unload();

		cMaster.setScreen(b);
	}

	public void testMasterInsertURIs() {
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

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		Button buttonInstance = (Button) bMasterInstance.getInstance()
				.getWidgets().get(1);
		assertEquals("Inserted Button", buttonInstance.getText());
		buttonInstance.setState(State.DISABLED);

		WidgetGroup groupInstance = (WidgetGroup) bMasterInstance.getInstance()
				.getWidgets().get(2);
		Button groupedButtonInstance = (Button) groupInstance.getWidgets().get(
				0);
		assertEquals("Grouped Button", groupedButtonInstance.getText());
		groupedButtonInstance.setState(State.DISABLED);
		groupInstance.setLocked(true);

		assertNotNull(cMaster.getOverrides());

		EList<WidgetOverrides> widgetsOverrides = cMaster.getOverrides()
				.getWidgets();
		assertEquals(3, widgetsOverrides.size());
		WidgetOverrides widgetOverrides = widgetsOverrides.get(0);
		assertEquals("2", widgetOverrides.getRef());
		assertEquals(
				State.DISABLED.getLiteral(),
				widgetOverrides.getAttributes().get(
						ModelPackage.Literals.STATE_SUPPORT__STATE.getName()));

		widgetOverrides = widgetsOverrides.get(1);
		assertEquals("4", widgetOverrides.getRef());
		assertEquals(
				State.DISABLED.getLiteral(),
				widgetOverrides.getAttributes().get(
						ModelPackage.Literals.STATE_SUPPORT__STATE.getName()));

		widgetOverrides = widgetsOverrides.get(2);
		assertEquals("3", widgetOverrides.getRef());
		assertEquals(Boolean.TRUE.toString(), widgetOverrides.getAttributes()
				.get(ModelPackage.Literals.WIDGET__LOCKED.getName()));

		// Force overrides to be reapplied
		cMaster.setScreen(b);

		bMasterInstance = (Master) cMaster.getInstance().getWidgets().get(0);
		buttonInstance = (Button) bMasterInstance.getInstance().getWidgets()
				.get(1);
		assertEquals("Inserted Button", buttonInstance.getText());
		assertEquals(State.DISABLED, buttonInstance.getState());

		groupInstance = (WidgetGroup) bMasterInstance.getInstance()
				.getWidgets().get(2);
		groupedButtonInstance = (Button) groupInstance.getWidgets().get(0);
		assertEquals("Grouped Button", groupedButtonInstance.getText());
		assertEquals(State.DISABLED, groupedButtonInstance.getState());

		// Test another level of indirection
		Screen d = ModelFactory.eINSTANCE.createScreen();
		Master dMaster = ModelFactory.eINSTANCE.createMaster();
		dMaster.setX(20);
		dMaster.setY(20);
		dMaster.setScreen(c);
		d.getWidgets().add(dMaster);
		persister.getResourceSet().createResource(URI.createURI("d.screen"))
				.getContents().add(d);

		Master cMasterInstance = (Master) dMaster.getInstance().getWidgets()
				.get(0);
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets()
				.get(0);
		buttonInstance = (Button) bMasterInstance.getInstance().getWidgets()
				.get(1);
		assertEquals("Inserted Button", buttonInstance.getText());
		assertEquals(State.DISABLED, buttonInstance.getState());
		buttonInstance.setTextAlignment(TextAlignment.RIGHT_LITERAL);

		groupInstance = (WidgetGroup) bMasterInstance.getInstance()
				.getWidgets().get(2);
		groupedButtonInstance = (Button) groupInstance.getWidgets().get(0);
		assertEquals("Grouped Button", groupedButtonInstance.getText());
		groupedButtonInstance.setTextAlignment(TextAlignment.RIGHT_LITERAL);
		groupInstance.setX(40);
		assertNotNull(dMaster.getOverrides());

		widgetsOverrides = dMaster.getOverrides().getWidgets();
		assertEquals(3, widgetsOverrides.size());
		widgetOverrides = widgetsOverrides.get(0);
		assertEquals("1/2", widgetOverrides.getRef());
		assertEquals(
				TextAlignment.RIGHT_LITERAL.getLiteral(),
				widgetOverrides
						.getAttributes()
						.get(ModelPackage.Literals.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT
								.getName()));
		widgetOverrides = widgetsOverrides.get(1);
		assertEquals("1/4", widgetOverrides.getRef());
		assertEquals(
				TextAlignment.RIGHT_LITERAL.getLiteral(),
				widgetOverrides
						.getAttributes()
						.get(ModelPackage.Literals.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT
								.getName()));
		widgetOverrides = widgetsOverrides.get(2);
		assertEquals("1/3", widgetOverrides.getRef());
		assertEquals(Integer.valueOf(40), widgetOverrides.getX());

		// Force overrides to be reapplied
		dMaster.setScreen(c);

		cMasterInstance = (Master) dMaster.getInstance().getWidgets().get(0);
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets()
				.get(0);
		buttonInstance = (Button) bMasterInstance.getInstance().getWidgets()
				.get(1);
		assertEquals("Inserted Button", buttonInstance.getText());
		assertEquals(State.DISABLED, buttonInstance.getState());
		assertEquals(TextAlignment.RIGHT_LITERAL,
				buttonInstance.getTextAlignment());

		groupInstance = (WidgetGroup) bMasterInstance.getInstance()
				.getWidgets().get(2);
		groupedButtonInstance = (Button) groupInstance.getWidgets().get(0);
		assertEquals("Grouped Button", groupedButtonInstance.getText());
		assertEquals(State.DISABLED, groupedButtonInstance.getState());
		assertEquals(TextAlignment.RIGHT_LITERAL,
				groupedButtonInstance.getTextAlignment());
		assertEquals(true, groupInstance.isLocked());
		assertEquals(40, groupInstance.getX());
	}

	public void testStaleOverrides() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button1 = ModelFactory.eINSTANCE.createButton();
		button1.setX(10);
		button1.setY(0);
		button1.setText("Button 1");
		a.getWidgets().add(button1);

		Button button2 = ModelFactory.eINSTANCE.createButton();
		button2.setX(10);
		button2.setY(20);
		button2.setText("Button 2");
		a.getWidgets().add(button2);

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

		Button button1Instance = (Button) bMaster.getInstance().getWidgets()
				.get(0);
		Button button2Instance = (Button) bMaster.getInstance().getWidgets()
				.get(1);

		button1Instance.setState(State.DISABLED);
		button2Instance.setTextAlignment(TextAlignment.RIGHT_LITERAL);

		assertNotNull(bMaster.getOverrides());

		EList<WidgetOverrides> widgetsOverrides = bMaster.getOverrides()
				.getWidgets();
		assertEquals(2, widgetsOverrides.size());
		WidgetOverrides widgetOverrides = widgetsOverrides.get(0);
		assertEquals("1", widgetOverrides.getRef());
		assertEquals(
				State.DISABLED.getLiteral(),
				widgetOverrides.getAttributes().get(
						ModelPackage.Literals.STATE_SUPPORT__STATE.getName()));
		widgetOverrides = widgetsOverrides.get(1);
		assertEquals("2", widgetOverrides.getRef());
		assertEquals(
				TextAlignment.RIGHT_LITERAL.getLiteral(),
				widgetOverrides
						.getAttributes()
						.get(ModelPackage.Literals.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT
								.getName()));

		a.getWidgets().remove(button1);
		bMaster.setScreen(a);

		button2Instance = (Button) bMaster.getInstance().getWidgets().get(0);
		widgetsOverrides = bMaster.getOverrides().getWidgets();
		assertEquals(2, widgetsOverrides.size());

		// Here we expect that overrides are recalculated completely
		// so that stale overrides are removed
		button2Instance.setState(State.DISABLED);
		widgetsOverrides = bMaster.getOverrides().getWidgets();
		assertEquals(1, widgetsOverrides.size());

		widgetOverrides = widgetsOverrides.get(0);
		assertEquals("2", widgetOverrides.getRef());
		assertEquals(
				State.DISABLED.getLiteral(),
				widgetOverrides.getAttributes().get(
						ModelPackage.Literals.STATE_SUPPORT__STATE.getName()));
		assertEquals(
				TextAlignment.RIGHT_LITERAL.getLiteral(),
				widgetOverrides
						.getAttributes()
						.get(ModelPackage.Literals.TEXT_ALIGNMENT_SUPPORT__TEXT_ALIGNMENT
								.getName()));
	}
	
	public void testNestedInsertMissingScreenNPE() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setX(10);
		button.setY(0);
		button.setText("Button");
		a.getWidgets().add(button);

		persister.getResourceSet().createResource(URI.createURI("a.screen"))
				.getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master bMaster = ModelFactory.eINSTANCE.createMaster();
		bMaster.setX(20);
		bMaster.setY(20);
		bMaster.setId(Long.valueOf(1));
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);
		persister.getResourceSet().createResource(URI.createURI("b.screen"))
				.getContents().add(b);

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setId(Long.valueOf(1));
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen"))
				.getContents().add(c);

		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets()
				.get(0);
		
		Label label = ModelFactory.eINSTANCE.createLabel();
		label.setText("Label");
		bMasterInstance.getInstance().getWidgets().add(label);

		assertNotNull(cMaster.getOverrides());
		
		bMaster.setScreen(null);
	}	
	
	public void testInsertItemsIntoEmpty() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		ButtonBar buttonBar = ModelFactory.eINSTANCE.createButtonBar();
		buttonBar.setId(new Long(1));
		buttonBar.setX(10);
		buttonBar.setY(0);
		a.getWidgets().add(buttonBar);

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

		ButtonBar buttonBarInstance = (ButtonBar) master.getInstance()
				.getWidgets().get(0);

		// Insert item
		Item item1 = ModelFactory.eINSTANCE.createItem();
		item1.setText("Item1");
		buttonBarInstance.getItems().add(item1);
		
		Overrides overrides = master.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		WidgetOverrides wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		EList<Operation> ic = wo.getItemChanges();
		assertEquals(1, ic.size());
		Operation op = ic.get(0);
		assertTrue(op instanceof Insert);
		Insert insert = (Insert) op;
		assertEquals(0, insert.getNewIndex());
		assertTrue(insert.getObject() instanceof Item);
		Item item = (Item) insert.getObject();
		assertEquals("Item1", item.getText());
		
		// Force overrides to be reapplied
		master.setScreen(a);

		buttonBarInstance = (ButtonBar) master.getInstance().getWidgets()
				.get(0);
		assertEquals(1, buttonBarInstance.getItems().size());
		assertEquals("Item1", buttonBarInstance.getItems().get(0).getText());
	}
	
	public void testNoteOverrides() {
		Persister persister = new Persister();
		
		Screen a = ModelFactory.eINSTANCE.createScreen();
		ButtonBar buttonBar = ModelFactory.eINSTANCE.createButtonBar();
		buttonBar.setId(new Long(1));
		buttonBar.setX(10);
		buttonBar.setY(0);
		buttonBar.setNote("Note");
		a.getWidgets().add(buttonBar);

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
		
		ButtonBar buttonBarInstance = (ButtonBar) master.getInstance()
				.getWidgets().get(0);
		
		assertEquals("", buttonBarInstance.getNote());
		
		buttonBarInstance.setNote("Note 1");
		
		Overrides overrides = master.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		WidgetOverrides wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("Note 1", wo.getAttributes().get(ModelPackage.Literals.NOTE_SUPPORT__NOTE.getName()));

		buttonBarInstance.setNote("");
		
		overrides = master.getOverrides();

		assertNull(overrides);

		// Force overrides to be reapplied
		master.setScreen(a);

		buttonBarInstance = (ButtonBar) master.getInstance().getWidgets()
				.get(0);
		overrides = master.getOverrides();
		assertNull(overrides);

		buttonBarInstance.setNote("Note");
		
		overrides = master.getOverrides();

		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("Note", wo.getAttributes().get(ModelPackage.Literals.NOTE_SUPPORT__NOTE.getName()));
		
		// Force overrides to be reapplied
		master.setScreen(a);

		buttonBarInstance = (ButtonBar) master.getInstance().getWidgets()
				.get(0);
		overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("Note", wo.getAttributes().get(ModelPackage.Literals.NOTE_SUPPORT__NOTE.getName()));
		
		// Insert a label to force a recalculation
		Label label = ModelFactory.eINSTANCE.createLabel();
		label.setText("Label");
		master.getInstance().getWidgets().add(label);
		
		overrides = master.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		wo = overrides.getWidgets().get(0);
		assertEquals("1", wo.getRef());
		assertEquals("Note", wo.getAttributes().get(ModelPackage.Literals.NOTE_SUPPORT__NOTE.getName()));
	}

	public void testOverridesInserts() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Placeholder placeholder = ModelFactory.eINSTANCE.createPlaceholder();
		placeholder.setId(new Long(1));
		placeholder.setX(0);
		placeholder.setY(0);
		placeholder.setWidth(100);
		placeholder.setHeight(100);
		a.getWidgets().add(placeholder);

		persister.getResourceSet().createResource(URI.createURI("a.screen")).getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master bMaster = ModelFactory.eINSTANCE.createMaster();
		bMaster.setId(new Long(11));
		bMaster.setX(20);
		bMaster.setY(20);
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);

		persister.getResourceSet().createResource(URI.createURI("b.screen")).getContents().add(b);

		Panel insertPanel = ModelFactory.eINSTANCE.createPanel();
		insertPanel.setX(0);
		insertPanel.setY(0);
		insertPanel.setWidth(100);
		insertPanel.setHeight(100);
		bMaster.getInstance().getWidgets().add(insertPanel);

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setId(new Long(1111));
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen")).getContents().add(c);
		
		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets().get(0);
		Panel insertPanelInstance = (Panel) bMasterInstance.getInstance().getWidgets().get(1);
		assertNotNull(insertPanelInstance);
		insertPanelInstance.setBackground(ColorDesc.red);
		
		final Overrides overrides = cMaster.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		final WidgetOverrides widgetOverrides = overrides.getWidgets().get(0);
		assertEquals(ColorDesc.red.toString(), widgetOverrides.getAttributes()
				.get(ModelPackage.Literals.COLOR_BACKGROUND_SUPPORT__BACKGROUND.getName()));
		assertEquals("1", widgetOverrides.getRef());
		
		// Force overrides to be reapplied
		cMaster.setScreen(b);
		
		bMasterInstance = (Master) cMaster.getInstance().getWidgets().get(0);
		insertPanelInstance = (Panel) bMasterInstance.getInstance().getWidgets().get(1);
		assertNotNull(insertPanelInstance);
		assertEquals(ColorDesc.red, insertPanelInstance.getBackground());
	}

	public void testOverridesNestingInserts() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Placeholder placeholder = ModelFactory.eINSTANCE.createPlaceholder();
		placeholder.setId(new Long(1));
		placeholder.setX(0);
		placeholder.setY(0);
		placeholder.setWidth(100);
		placeholder.setHeight(100);
		a.getWidgets().add(placeholder);

		persister.getResourceSet().createResource(URI.createURI("a.screen")).getContents().add(a);

		Screen b = ModelFactory.eINSTANCE.createScreen();
		Master bMaster = ModelFactory.eINSTANCE.createMaster();
		bMaster.setId(new Long(11));
		bMaster.setX(20);
		bMaster.setY(20);
		bMaster.setScreen(a);
		b.getWidgets().add(bMaster);

		persister.getResourceSet().createResource(URI.createURI("b.screen")).getContents().add(b);

		Screen c = ModelFactory.eINSTANCE.createScreen();
		Master cMaster = ModelFactory.eINSTANCE.createMaster();
		cMaster.setId(new Long(111));
		cMaster.setX(20);
		cMaster.setY(20);
		cMaster.setScreen(b);
		c.getWidgets().add(cMaster);
		persister.getResourceSet().createResource(URI.createURI("c.screen")).getContents().add(c);

		Master bMasterInstance = (Master) cMaster.getInstance().getWidgets().get(0);
		Panel insertPanel = ModelFactory.eINSTANCE.createPanel();
		insertPanel.setX(0);
		insertPanel.setY(0);
		insertPanel.setWidth(100);
		insertPanel.setHeight(100);
		bMasterInstance.getInstance().getWidgets().add(insertPanel);

		Screen d = ModelFactory.eINSTANCE.createScreen();
		Master dMaster = ModelFactory.eINSTANCE.createMaster();
		dMaster.setId(new Long(1111));
		dMaster.setX(20);
		dMaster.setY(20);
		dMaster.setScreen(c);
		d.getWidgets().add(dMaster);
		persister.getResourceSet().createResource(URI.createURI("d.screen")).getContents().add(d);
		
		Master cMasterInstance = (Master) dMaster.getInstance().getWidgets().get(0);
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets().get(0);
		Panel insertPanelInstance = (Panel) bMasterInstance.getInstance().getWidgets().get(1);
		assertNotNull(insertPanelInstance);
		insertPanelInstance.setBackground(ColorDesc.red);
		
		Overrides overrides = dMaster.getOverrides();
		assertNotNull(overrides);
		assertEquals(1, overrides.getWidgets().size());
		WidgetOverrides widgetOverrides = overrides.getWidgets().get(0);
		assertEquals(ColorDesc.red.toString(), widgetOverrides.getAttributes()
				.get(ModelPackage.Literals.COLOR_BACKGROUND_SUPPORT__BACKGROUND.getName()));
		assertEquals("1", widgetOverrides.getRef());
		
		// Force overrides to be reapplied
		dMaster.setScreen(c);
		
		cMasterInstance = (Master) dMaster.getInstance().getWidgets().get(0);
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets().get(0);
		insertPanelInstance = (Panel) bMasterInstance.getInstance().getWidgets().get(1);
		assertNotNull(insertPanelInstance);
		assertEquals(ColorDesc.red, insertPanelInstance.getBackground());
		
		Button insertButton = ModelFactory.eINSTANCE.createButton();
		insertButton.setX(0);
		insertButton.setY(0);
		insertButton.setWidth(100);
		insertButton.setHeight(100);
		bMasterInstance.getInstance().getWidgets().add(insertButton);
		
		Screen e = ModelFactory.eINSTANCE.createScreen();
		Master eMaster = ModelFactory.eINSTANCE.createMaster();
		eMaster.setId(new Long(1111));
		eMaster.setX(20);
		eMaster.setY(20);
		eMaster.setScreen(d);
		e.getWidgets().add(eMaster);
		persister.getResourceSet().createResource(URI.createURI("e.screen")).getContents().add(e);
		
		Master dMasterInstance = (Master) eMaster.getInstance().getWidgets().get(0);
		cMasterInstance = (Master) dMasterInstance.getInstance().getWidgets().get(0);
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets().get(0);
		insertPanelInstance = (Panel) bMasterInstance.getInstance().getWidgets().get(1);
		assertNotNull(insertPanelInstance);
		insertPanelInstance.setForeground(ColorDesc.blue);
		Button insertButtonInstance = (Button) bMasterInstance.getInstance().getWidgets().get(2);
		assertNotNull(insertButtonInstance);
		insertButtonInstance.setText("Override");

		overrides = eMaster.getOverrides();
		assertNotNull(overrides);
		assertEquals(2, overrides.getWidgets().size());
		widgetOverrides = overrides.getWidgets().get(0);
		assertEquals(ColorDesc.blue.toString(), widgetOverrides.getAttributes()
				.get(ModelPackage.Literals.COLOR_FOREGROUND_SUPPORT__FOREGROUND.getName()));
		assertEquals("1111/1", widgetOverrides.getRef());
		widgetOverrides = overrides.getWidgets().get(1);
		assertEquals("Override", widgetOverrides.getText());
		assertEquals("1", widgetOverrides.getRef());
		
		// Force overrides to be reapplied
		eMaster.setScreen(d);
		
		dMasterInstance = (Master) eMaster.getInstance().getWidgets().get(0);
		cMasterInstance = (Master) dMasterInstance.getInstance().getWidgets().get(0);
		bMasterInstance = (Master) cMasterInstance.getInstance().getWidgets().get(0);
		insertPanelInstance = (Panel) bMasterInstance.getInstance().getWidgets().get(1);
		assertNotNull(insertPanelInstance);
		assertEquals(ColorDesc.blue, insertPanelInstance.getForeground());
		assertEquals(ColorDesc.red, insertPanelInstance.getBackground());
		insertButtonInstance = (Button) bMasterInstance.getInstance().getWidgets().get(2);
		assertNotNull(insertButtonInstance);
		assertEquals("Override", insertButtonInstance.getText());
	}
	
	public void testGetSourceWidget() {
		Persister persister = new Persister();

		Screen a = ModelFactory.eINSTANCE.createScreen();
		Button button = ModelFactory.eINSTANCE.createButton();
		button.setId(new Long(1));
		a.getWidgets().add(button);
		Text text = ModelFactory.eINSTANCE.createText();
		text.setId(new Long(2));
		a.getWidgets().add(text);

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

		Button buttonInstance = (Button) master.getInstance().getWidgets().get(0);
		buttonInstance.setText("OK");
		final Widget buttonSrc = master.getSourceWidget(buttonInstance);
		assertEquals(button, buttonSrc);
		
		Text textInstance = (Text) master.getInstance().getWidgets().get(1);
		textInstance.setText("Text");
		final Widget textSrc = master.getSourceWidget(textInstance);
		assertEquals(text, textSrc);
	}

	private void printObject(Persister persister, EObject object)
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			persister.save(object, out);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		System.out.println(new String(out.toByteArray()));
	}
}
