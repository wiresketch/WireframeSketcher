package com.wireframesketcher.spy;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.util.Persister;

public class SpyHandler extends AbstractHandler {
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			Shell shell = HandlerUtil.getActiveShell(event);
			Screen screen = new Converter(shell).getScreen();
			String s = serializeScreen(screen);
			putToClipboard(shell.getDisplay(), s);
			MessageDialog.openInformation(shell, "WireframeSketcher Spy",
					"Window '" + shell.getText()
							+ "' was exported to clipboard in XML format. "
							+ "Paste it directly into an existing screen.");
		} catch (Exception e) {
			throw new ExecutionException("Spy failed", e);
		}

		return null;
	}

	private void putToClipboard(Display display, String s) {
		Clipboard clipboard = new Clipboard(display);
		clipboard.setContents(new Object[] { s }, new Transfer[] { TextTransfer
				.getInstance() });
		clipboard.dispose();
	}

	private String serializeScreen(Screen screen) throws IOException {
		Persister persister = new Persister();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		persister.save(screen, out);
		return new String(out.toByteArray(), "UTF-8");
	}
}
