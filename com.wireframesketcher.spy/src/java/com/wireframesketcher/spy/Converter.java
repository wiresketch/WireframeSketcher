package com.wireframesketcher.spy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.regex.Pattern;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.CoolItem;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Sash;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Scrollable;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import com.wireframesketcher.model.Checkbox;
import com.wireframesketcher.model.ColorDesc;
import com.wireframesketcher.model.FontSize;
import com.wireframesketcher.model.FontSupport;
import com.wireframesketcher.model.Icon;
import com.wireframesketcher.model.IconDesc;
import com.wireframesketcher.model.IconSize;
import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.Panel;
import com.wireframesketcher.model.Position;
import com.wireframesketcher.model.RadioButton;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.SearchField;
import com.wireframesketcher.model.SelectionSupport;
import com.wireframesketcher.model.State;
import com.wireframesketcher.model.StateSupport;
import com.wireframesketcher.model.TabbedPane;
import com.wireframesketcher.model.TextAlignment;
import com.wireframesketcher.model.TextAlignmentSupport;
import com.wireframesketcher.model.TextArea;
import com.wireframesketcher.model.TextField;
import com.wireframesketcher.model.VerticalScrollbarSupport;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.Window;

public class Converter {
	private final Shell shell;

	private final ModelFactory factory = ModelFactory.eINSTANCE;

	private final Screen screen;

	private Point origin = new Point(25, 25);

	public Converter(Shell shell) {
		this.shell = shell;
		this.screen = factory.createScreen();
		this.screen.getFont().setSize(FontSize.inPixels(12));
		convert(shell);
	}

	private void convert(Control control) {
		if (control == null)
			return;

		if (!control.isVisible())
			return;

		Point size = control.getSize();
		if (size.x == 0 || size.y == 0)
			return;

		String methodName = "convert" + control.getClass().getSimpleName();
		Method method = null;
		try {
			method = getClass().getMethod(methodName,
					new Class[] { control.getClass() });
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			// ignore
		}

		if (method != null) {
			try {
				method.invoke(this, new Object[] { control });
			} catch (IllegalArgumentException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			} catch (InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		} else if (control instanceof Canvas) {
			if (size.x > 30 && size.y > 30) {
				Panel panel = factory.createPanel();
				applyScrollbar(panel, (Canvas) control);
				add(panel, control);
			}
		}

		if (control instanceof Composite && !isWidgetComposite(control)) {
			Composite composite = (Composite) control;
			Control[] children = composite.getChildren();
			for (int i = 0; i < children.length; i++) {
				convert(children[i]);
			}
		}
	}

	private boolean isWidgetComposite(Control control) {
		if (control instanceof DateTime)
			return true;

		return false;
	}

	private void add(Widget widget, int x, int y, int width, int height) {
		widget.setX(origin.x + x);
		widget.setY(origin.y + y);
		if ((widget.getDescriptor().getResizeMode().getValue() & ResizeMode.HORIZONTAL) != 0
				&& !(widget instanceof com.wireframesketcher.model.Label || widget instanceof Icon))
			widget.setWidth(width);
		if ((widget.getDescriptor().getResizeMode().getValue() & ResizeMode.VERTICAL) != 0
				&& !(widget instanceof Icon))
			widget.setHeight(height);

		screen.getWidgets().add(widget);
	}

	private void add(Widget widget, Control control) {
		add(widget, control, 0, 0);
	}

	private void add(Widget widget, Control control, int dx, int dy) {
		Rectangle bounds = control.getBounds();
		int x = bounds.x, y = bounds.y;
		if (control.getParent() != null && !(control instanceof Shell)) {
			Point location = control.getParent().toDisplay(x, y);
			x = location.x;
			y = location.y;
		}
		x -= shell.getBounds().x;
		y -= shell.getBounds().y;

		x += dx;
		y += dy;

		add(widget, x, y, bounds.width - dx, bounds.height - dy);
	}

	private void add(Widget widget, Composite parent, Rectangle bounds, int dx,
			int dy) {
		Point location = parent.toDisplay(bounds.x, bounds.y);
		int x = location.x;
		int y = location.y;
		x -= shell.getBounds().x;
		y -= shell.getBounds().y;

		add(widget, x + dx, y + dy, bounds.width - dx, bounds.height - dy);
	}

	public void convertShell(Shell control) {
		Window window = factory.createWindow();
		window.setText(control.getText());
		int style = control.getStyle();
		window.setCloseButton((style & SWT.CLOSE) != 0);
		window.setMinimizeButton((style & SWT.MIN) != 0);
		window.setMaximizeButton((style & SWT.MAX) != 0);
		applyScrollbar(window, control);
		add(window, control);

		if (control.getMenuBar() != null
				&& !("carbon".equals(SWT.getPlatform()) || "cocoa".equals(SWT
						.getPlatform()))) {
			Menu menuWidget = control.getMenuBar();
			com.wireframesketcher.model.Menu menu = factory.createMenu();
			MenuItem[] items = menuWidget.getItems();
			StringBuilder content = new StringBuilder();
			for (int i = 0; i < items.length; i++) {
				content.append(Action.removeMnemonics(items[i].getText()));
				if (i < items.length - 1)
					content.append(',');
			}
			menu.setText(content.toString());
			Rectangle bounds = control.getBounds();
			add(menu, 0, 19, bounds.width, -1);
		}
	}

	public void convertGroup(Group control) {
		com.wireframesketcher.model.Group group = factory.createGroup();
		group.setText(Action.removeMnemonics(control.getText()));
		add(group, control);
	}

	public void convertButton(Button control) {
		Widget widget = null;

		if ((control.getStyle() & SWT.CHECK) != 0) {
			Checkbox checkbox = factory.createCheckbox();
			checkbox.setSelected(control.getSelection());
			applyState(checkbox, control);
			widget = checkbox;
		} else if ((control.getStyle() & SWT.RADIO) != 0) {
			RadioButton radioButton = factory.createRadioButton();
			radioButton.setSelected(control.getSelection());
			applyState(radioButton, control);
			widget = radioButton;
		} else if ((control.getStyle() & SWT.PUSH) != 0) {
			com.wireframesketcher.model.Button button = factory.createButton();
			applyState(button, control);
			widget = button;
		} else if ((control.getStyle() & SWT.ARROW) != 0) {
			com.wireframesketcher.model.Button button = factory.createButton();
			String iconName;

			if ((control.getStyle() & SWT.UP) != 0)
				iconName = "empty-arrow-up";
			else if ((control.getStyle() & SWT.LEFT) != 0)
				iconName = "empty-arrow-left";
			else if ((control.getStyle() & SWT.RIGHT) != 0)
				iconName = "empty-arrow-right";
			else
				iconName = "empty-arrow-down";

			button.setIcon(new IconDesc(iconName, IconSize.SMALL_LITERAL));
			applyState(button, control);

			widget = button;
		}

		if (widget != null)
			widget.setText(Action.removeMnemonics(control.getText()));

		if (widget != null)
			add(widget, control);
	}

	public void convertLabel(Label control) {
		if ((control.getStyle() & SWT.SEPARATOR) != 0) {
			add(factory.createHLine(), control);
		} else {
			if (control.getText().trim().length() > 0) {
				if (isMultiLine(control)) {
					com.wireframesketcher.model.Text text = factory
							.createText();
					text.setText(Action.removeMnemonics(control.getText()));
					applyAlignment(text, control);
					applyFont(text, control);
					add(text, control);
				} else {
					com.wireframesketcher.model.Label label = factory
							.createLabel();
					label.setText(Action.removeMnemonics(control.getText()));
					applyAlignment(label, control);
					applyFont(label, control);
					applyState(label, control);
					add(label, control);
				}
			} else if (control.getImage() != null) {
				add(factory.createPlaceholder(), control);
			}
		}
	}

	public void convertCLabel(CLabel control) {
		if (control.getText() != null && control.getText().trim().length() > 0) {
			if (isMultiLine(control)) {
				com.wireframesketcher.model.Text text = factory.createText();
				text.setText(Action.removeMnemonics(control.getText()));
				applyAlignment(text, control);
				applyFont(text, control);
				add(text, control);
			} else {
				com.wireframesketcher.model.Label label = factory.createLabel();
				label.setText(Action.removeMnemonics(control.getText()));
				applyAlignment(label, control);
				applyFont(label, control);
				applyState(label, control);
				add(label, control);
			}
		} else if (control.getImage() != null) {
			add(factory.createPlaceholder(), control);
		}
	}

	public void convertText(Text control) {
		if ((control.getStyle() & SWT.SEARCH) != 0) {
			SearchField searchField = factory.createSearchField();
			searchField.setText(control.getText());
			add(searchField, control);
		} else if (isUsedAsLabel(control)) {
			if (isMultiLine(control)) {
				com.wireframesketcher.model.Text text = factory.createText();
				text.setText(control.getText());
				applyAlignment(text, control);
				applyFont(text, control);
				add(text, control);
			} else {
				com.wireframesketcher.model.Label label = factory.createLabel();
				label.setText(control.getText());
				applyAlignment(label, control);
				applyFont(label, control);
				applyState(label, control);
				add(label, control);
			}
		} else {
			if (isMultiLine(control)) {
				TextArea textArea = factory.createTextArea();
				textArea.setText(control.getText());
				applyState(textArea, control);
				applyScrollbar(textArea, control);
				add(textArea, control);
			} else {
				TextField textField = factory.createTextField();
				if ((control.getStyle() & SWT.PASSWORD) != 0) {
					textField.setText(createPasswordText(control.getText()));
				} else {
					textField.setText(control.getText());
				}

				applyState(textField, control);

				add(textField, control);
			}
		}
	}

	public void convertCombo(Combo control) {
		com.wireframesketcher.model.Combo combo = factory.createCombo();
		combo.setText(control.getText());
		applyState(combo, control);
		add(combo, control);

		if ((control.getStyle() & SWT.SIMPLE) != 0) {
			com.wireframesketcher.model.List list = factory.createList();
			String[] items = control.getItems();
			StringBuilder content = new StringBuilder();
			for (int i = 0; i < items.length; i++) {
				content.append(items[i]);
				content.append('\n');
			}
			list.setText(content.toString());
			list.setSelection(control.getSelectionIndex());
			add(list, control, 0, 22);
			// force auto-size
			list.setWidth(-1);
			list.setHeight(-1);
		}
	}

	public void convertCCombo(CCombo control) {
		com.wireframesketcher.model.Combo combo = factory.createCombo();
		combo.setText(control.getText());
		applyState(combo, control);
		add(combo, control);
	}

	public void convertLink(Link control) {
		if (isMultiLine(control)) {
			com.wireframesketcher.model.Text link = factory.createText();
			link.setText(replaceLinkTags(control.getText()));
			add(link, control);
		} else {
			com.wireframesketcher.model.Label link = factory.createLabel();
			link.setText(replaceLinkTags(control.getText()));
			applyState(link, control);
			add(link, control);
		}
	}

	public void convertTree(Tree control) {
		TreeColumn[] columns = control.getColumns();
		if (columns.length > 1) {
			com.wireframesketcher.model.Table table = factory.createTable();
			StringBuilder content = new StringBuilder();
			if (columns.length > 0) {
				for (int i = 0; i < columns.length; i++) {
					content.append(columns[i].getText());
					if (i < columns.length - 1)
						content.append(',');
				}
				content.append('\n');
			}

			TreeItem[] items = control.getItems();
			for (int i = 0; i < items.length; i++) {
				TreeItem item = items[i];
				if (isItemVisible(item)) {
					for (int j = 0; j < columns.length; j++) {
						content.append(item.getText(j));
						if (j < columns.length - 1)
							content.append(',');
					}
					content.append('\n');
				}
			}

			table.setText(content.toString());
			applyScrollbar(table, control);
			add(table, control);
		} else {
			com.wireframesketcher.model.Tree tree = factory.createTree();
			TreeItem[] items = control.getItems();
			StringBuilder content = new StringBuilder();
			for (int i = 0; i < items.length; i++)
				convertTreeItem(items[i], content, 0);
			tree.setText(content.toString());
			applyScrollbar(tree, control);
			add(tree, control);
		}
	}

	private void convertTreeItem(TreeItem item, StringBuilder content,
			int indent) {
		String text = item.getText();
		if (text != null && text.length() > 0) {
			for (int i = 0; i < indent; i++)
				content.append('-');
			content.append(text);
			content.append('\n');
			TreeItem[] items = item.getItems();
			if (items != null)
				for (int i = 0; i < items.length; i++)
					convertTreeItem(items[i], content, indent + 1);
		}
	}

	public void convertTable(Table control) {
		com.wireframesketcher.model.Table table = factory.createTable();
		table.setAlternative(ColorDesc.createFromString("#EEEEEE"));
		StringBuilder content = new StringBuilder();
		TableColumn[] columns = control.getColumns();
		if (columns.length > 0) {
			for (int i = 0; i < columns.length; i++) {
				TableColumn col = columns[i];
				if ((col.getStyle() & SWT.CENTER) != 0)
					content.append("=. ");
				else if ((col.getStyle() & SWT.RIGHT) != 0)
					content.append(">. ");
				content.append(col.getText());
				if (i < columns.length - 1)
					content.append(',');
			}
			content.append('\n');
		}

		boolean checkTable = (control.getStyle() & SWT.CHECK) != 0;

		TableItem[] items = control.getItems();
		for (int i = 0; i < items.length; i++) {
			TableItem item = items[i];

			if (isItemVisible(item)) {
				if (checkTable) {
					if (item.getChecked())
						content.append("[x] ");
					else
						content.append("[ ] ");
				}

				if (columns.length > 0) {
					for (int j = 0; j < columns.length; j++) {
						content.append(item.getText(j));
						if (j < columns.length - 1)
							content.append(',');
					}
				} else {
					content.append(item.getText());
				}
				content.append('\n');
			}
		}

		table.setText(content.toString());

		if (control.getSelectionIndex() != -1)
			table.setSelection(control.getSelectionIndex() + 1); // +1 for header

		table.setHeader(control.getHeaderVisible());

		applyScrollbar(table, control);

		add(table, control);
	}

	public void convertSlider(Slider control) {
		if ((control.getStyle() & SWT.VERTICAL) != 0)
			add(factory.createVScrollbar(), control);
		else
			add(factory.createHScrollbar(), control);

	}

	public void convertTabFolder(TabFolder control) {
		if (control.getItemCount() == 0)
			return;

		Widget tabs = null;

		TabItem[] selection = control.getSelection();

		if (selection != null && selection.length > 0
				&& selection[0].getControl() != null
				&& selection[0].getControl().isVisible()) {
			tabs = factory.createTabbedPane();

			if ((control.getStyle() & SWT.BOTTOM) != 0)
				((TabbedPane) tabs).setPosition(Position.BOTTOM);
		} else {
			tabs = factory.createTabs();
		}

		StringBuilder content = new StringBuilder();
		TabItem[] items = control.getItems();
		for (int i = 0; i < items.length; i++) {
			content.append(Action.removeMnemonics(items[i].getText()));
			if (i < items.length - 1)
				content.append(',');
		}
		tabs.setText(content.toString());
		((SelectionSupport) tabs).setSelection(control
				.getSelectionIndex());
		if (tabs instanceof VerticalScrollbarSupport)
			applyScrollbar((VerticalScrollbarSupport) tabs, control);
		add(tabs, control);
	}

	public void convertCTabFolder(CTabFolder control) {
		if (control.getItemCount() == 0)
			return;

		Widget tabs = null;

		CTabItem selection = control.getSelection();

		if (selection != null && selection.getControl() != null
				&& selection.getControl().isVisible()) {
			tabs = factory.createTabbedPane();

			if ((control.getStyle() & SWT.BOTTOM) != 0)
				((TabbedPane) tabs).setPosition(Position.BOTTOM);
		} else {
			tabs = factory.createTabs();
		}

		StringBuilder content = new StringBuilder();
		CTabItem[] items = control.getItems();
		for (int i = 0; i < items.length; i++) {
			content.append(Action.removeMnemonics(items[i].getText()));
			if (i < items.length - 1)
				content.append(',');
		}
		tabs.setText(content.toString());
		((SelectionSupport) tabs).setSelection(control
				.getSelectionIndex());
		if (tabs instanceof VerticalScrollbarSupport)
			applyScrollbar((VerticalScrollbarSupport) tabs, control);
		add(tabs, control);
	}

	public void convertToolBar(ToolBar control) {
		ToolItem[] items = control.getItems();
		for (int i = 0; i < items.length; i++) {
			ToolItem item = items[i];
			if ((item.getStyle() & SWT.SEPARATOR) != 0)
				if ((control.getStyle() & SWT.VERTICAL) != 0)
					add(factory.createHLine(), control, item.getBounds(), 0, 0);
				else
					add(factory.createVLine(), control, item.getBounds(), 0, 0);
			else {
				{
					Icon icon = factory.createIcon();
					icon.setIcon(new IconDesc("image", IconSize.SMALL_LITERAL));
					add(icon, control, item.getBounds(), 6, 6);
				}

				if ((item.getStyle() & SWT.DROP_DOWN) != 0) {
					Icon icon = factory.createIcon();
					icon.setIcon(new IconDesc("empty-arrow-down",
							IconSize.SMALL_LITERAL));
					add(icon, control, item.getBounds(), 6 + 16, 6);
				}
			}
		}
	}

	public void convertCoolBar(CoolBar control) {
		CoolItem[] items = control.getItems();
		for (int i = 0; i < items.length; i++) {
			CoolItem item = items[i];
			if ((control.getStyle() & SWT.VERTICAL) != 0)
				add(factory.createHLine(), control, item.getBounds(), 0, 0);
			else
				add(factory.createVLine(), control, item.getBounds(), 0, 0);
		}
	}

	public void convertSash(Sash control) {
		if ((control.getStyle() & SWT.VERTICAL) != 0) {
			add(factory.createVLine(), control);
		} else {
			add(factory.createHLine(), control);
		}
	}

	public void convertProgressBar(ProgressBar control) {
		add(factory.createProgressBar(), control);
	}

	public void convertComposite(Composite control) {
		// if ((control.getStyle() & SWT.BORDER) != 0)
		// add(factory.createPanel(), control);
	}

	public void convertSpinner(Spinner control) {
		com.wireframesketcher.model.Spinner spinner = factory.createSpinner();
		spinner.setText(Integer.toString(control.getSelection()));
		applyState(spinner, control);
		add(spinner, control);
	}

	public void convertScale(Scale control) {
		if ((control.getStyle() & SWT.VERTICAL) != 0)
			add(factory.createVSlider(), control);
		else
			add(factory.createHSlider(), control);
	}

	public void convertStyledText(StyledText control) {
		if (isUsedAsLabel(control)) {
			com.wireframesketcher.model.Text text = factory.createText();
			text.setText(control.getText());
			applyAlignment(text, control);
			applyFont(text, control);
			add(text, control);
		} else {
			TextArea textArea = factory.createTextArea();
			textArea.setText(control.getText());
			applyState(textArea, control);
			applyScrollbar(textArea, control);
			add(textArea, control);
		}
	}

	public void convertList(List control) {
		com.wireframesketcher.model.List list = factory.createList();
		String[] items = control.getItems();
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < items.length; i++) {
			if (content.length() > 0)
				content.append('\n');
			content.append(items[i]);
		}
		list.setText(content.toString());

		if (control.getSelectionIndex() != -1)
			list.setSelection(control.getSelectionIndex());

		applyScrollbar(list, control);

		add(list, control);
	}

	public void convertDateTime(DateTime control) {
		// XXX: Handle SWT.CALENDAR style
		if ((control.getStyle() & SWT.CALENDAR) == 0) {
			TextField textField = factory.createTextField();

			if (control.getChildren().length > 0
					&& control.getChildren()[0] instanceof Text)
				textField.setText(((Text) control.getChildren()[0]).getText());

			applyState(textField, control);

			add(textField, control);
		}
	}

	private boolean isItemVisible(TableItem item) {
		Point size = item.getParent().getSize();
		Rectangle itemBounds = item.getBounds();
		return itemBounds.y >= 0 && itemBounds.y < size.y
				|| itemBounds.y + itemBounds.height > 5
				&& itemBounds.y + itemBounds.height <= size.y;
	}

	private boolean isItemVisible(TreeItem item) {
		Point size = item.getParent().getSize();
		Rectangle itemBounds = item.getBounds();
		return itemBounds.y >= 0 && itemBounds.y < size.y
				|| itemBounds.y + itemBounds.height > 5
				&& itemBounds.y + itemBounds.height <= size.y;
	}

	private static boolean isMultiLine(Control control) {
		if ((control.getStyle() & SWT.H_SCROLL) != 0)
			return true;
		if ((control.getStyle() & SWT.V_SCROLL) != 0)
			return true;
		if ((control.getStyle() & SWT.MULTI) != 0)
			return true;

		if (control instanceof Label || control instanceof CLabel
				|| control instanceof Link) {
			int fontHeight = getFontHeight(control);
			return control.getSize().y >= 2 * fontHeight;
		}

		return false;
	}

	private static int getFontHeight(Control control) {
		GC gc = new GC(control);
		try {
			return gc.getFontMetrics().getHeight();
		} finally {
			gc.dispose();
		}
	}

	private static void applyFont(FontSupport widget, Control control) {
		int fontStyle = control.getFont().getFontData()[0].getStyle();
		if ((fontStyle & SWT.BOLD) != 0)
			widget.getFont().setBold(Boolean.TRUE);
		if ((fontStyle & SWT.ITALIC) != 0)
			widget.getFont().setItalic(Boolean.TRUE);
	}

	private static void applyAlignment(TextAlignmentSupport widget,
			Control control) {
		if ((control.getStyle() & SWT.CENTER) != 0)
			widget.setTextAlignment(TextAlignment.CENTER_LITERAL);
		else if ((control.getStyle() & SWT.LEFT) != 0)
			widget.setTextAlignment(TextAlignment.LEFT_LITERAL);
		else if ((control.getStyle() & SWT.RIGHT) != 0)
			widget.setTextAlignment(TextAlignment.RIGHT_LITERAL);
	}

	private static void applyState(StateSupport widget, Control control) {
		if (widget.isValidState(State.DISABLED) && !control.isEnabled())
			widget.setState(State.DISABLED);
	}

	private static void applyScrollbar(VerticalScrollbarSupport widget,
			Scrollable control) {
		if (control.getVerticalBar() != null
				&& control.getVerticalBar().isVisible())
			widget.setVerticalScrollbar(true);
	}

	private static boolean isUsedAsLabel(Control control) {
		if ((control.getStyle() & SWT.BORDER) == 0
				&& (control.getStyle() & SWT.READ_ONLY) != 0
				&& control.getBackground().equals(
						control.getParent().getBackground()))
			return true;
		return false;
	}

	private static String createPasswordText(String text) {
		char[] chars = new char[text.length()];
		Arrays.fill(chars, '*');
		return new String(chars);
	}

	private String replaceLinkTags(String s) {
		Pattern openTag = Pattern.compile("<a.*?>", Pattern.CASE_INSENSITIVE);
		Pattern closeTag = Pattern.compile("</a>", Pattern.CASE_INSENSITIVE);
		s = openTag.matcher(s).replaceAll("[");
		s = closeTag.matcher(s).replaceAll("]");
		return s;
	}

	public Screen getScreen() {
		return screen;
	}
}
