package com.wireframesketcher.model.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import junit.framework.TestCase;

import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.Screen;

public class PersisterTest extends TestCase {
	public void testSave() throws IOException {
		Persister persister = new Persister();
		Screen screen = ModelFactory.eINSTANCE.createScreen();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		persister.save(screen, out);
	}
}
