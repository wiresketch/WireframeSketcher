package com.wireframesketcher.model.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.URIHandler;

import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.impl.ModelXMLResourceFactoryImpl;
import com.wireframesketcher.model.story.StoryPackage;

/**
 * Manages the loading and saving of EMF model objects. This class maintains a
 * unique instance of <tt>ResourceSet</tt> that is used for object loading.
 */
public class Persister {
	private final ResourceSet resourceSet;

	private final Map<Object, Object> saveOptions = new HashMap<Object, Object>();

	static {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"screen", new ModelXMLResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"story", new ModelXMLResourceFactoryImpl());

		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI,
				ModelPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(StoryPackage.eNS_URI,
				StoryPackage.eINSTANCE);
	}

	public Persister() {
		resourceSet = new ResourceSetImpl();

		URIHandler uriHandler = new ResourceURIHandler();

		getLoadOptions().putAll(
				ModelXMLResourceFactoryImpl.DEFAULT_LOAD_SAVE_OPTIONS);
		getLoadOptions().putAll(
				ModelXMLResourceFactoryImpl.DEFAULT_LOAD_OPTIONS);
		getLoadOptions().put(XMLResource.OPTION_URI_HANDLER, uriHandler);

		getSaveOptions().putAll(
				ModelXMLResourceFactoryImpl.DEFAULT_LOAD_SAVE_OPTIONS);
		getSaveOptions().putAll(
				ModelXMLResourceFactoryImpl.DEFAULT_SAVE_OPTIONS);
		getSaveOptions().put(XMLResource.OPTION_URI_HANDLER, uriHandler);
		// Force the use of intermediary buffer on save so that
		// we don't lose previous data in case of an error
		getSaveOptions().put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	private URI createLocalFileURI(File file) throws IOException {
		return URI.createFileURI(file.getCanonicalPath());
	}

	private void checkResource(EObject o) {
		if (o.eResource() == null) {
			URI uri = generateUniqueURI();
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(o);
		}
	}

	public void save(EObject o) throws IOException {
		checkResource(o);
		o.eResource().save(getSaveOptions());
	}

	public void save(EObject o, OutputStream out) throws IOException {
		checkResource(o);
		o.eResource().save(out, getSaveOptions());
	}

	public void save(EObject o, OutputStream out, URI uri) throws IOException {
		checkResource(o);
		o.eResource().setURI(uri);
		o.eResource().save(out, getSaveOptions());
	}

	public Map<Object, Object> getSaveOptions() {
		return saveOptions;
	}

	public EObject load(InputStream is) throws IOException {
		return load(is, null);
	}

	public EObject load(InputStream is, URI uri) throws IOException {
		URI loadURI = uri;

		if (loadURI == null)
			loadURI = generateUniqueURI();

		Resource resource = resourceSet.createResource(loadURI);
		try {
			resource.load(is, getLoadOptions());
		} catch (IOException e) {
			// ignore first load problem
		}
		checkErrors(resource);
		return resource.getContents().get(0);
	}

	private static URI generateUniqueURI() {
		// this is only needed to resolve the resource factory which is the
		// same both for .story and .screen
		return URI.createURI(generateUniqueResourceName() + ".screen");
	}

	private static class Lazy {
		static SecureRandom random = new SecureRandom();
	}

	private static String generateUniqueResourceName() {
		long a = Lazy.random.nextLong();
		if (a == Long.MIN_VALUE) {
			a = 0; // corner case
		} else {
			a = Math.abs(a);
		}

		long b = System.currentTimeMillis();

		return "tmp-" + Long.toString(a) + '-' + Long.toString(b);
	}

	public Map<Object, Object> getLoadOptions() {
		return resourceSet.getLoadOptions();
	}

	public EObject load(File file) throws IOException {
		URI uri = createLocalFileURI(file);
		Resource resource = null;
		try {
			resource = resourceSet.getResource(uri, true);
		} catch (WrappedException e) {
			// Ignore first on load exception
		}
		if (resource == null)
			resource = resourceSet.getResource(uri, true);
		checkErrors(resource);
		return (EObject) resource.getContents().get(0);
	}

	protected void checkErrors(Resource resource) throws IOException {
		if (!resource.getErrors().isEmpty()) {
			Throwable exception = getDiagnosticException(resource.getErrors());
			if (exception instanceof IOException)
				throw (IOException) exception;

			if (exception != null)
				throw new IOWrappedException(exception);

			Diagnostic diagnostic = EcoreUtil
					.computeDiagnostic(resource, false);

			throw new IOException(getDiagnosticMessage(diagnostic));
		}
	}

	private String getDiagnosticMessage(Diagnostic diagnostic) {
		String message = diagnostic.getMessage();
		if (message == null && !diagnostic.getChildren().isEmpty()) {
			List<Diagnostic> children = diagnostic.getChildren();
			for (int i = 0; i < children.size() && message == null; i++) {
				message = getDiagnosticMessage(children.get(i));
			}
		}
		return message;
	}

	private Throwable getDiagnosticException(EList<Resource.Diagnostic> errors) {
		for (Resource.Diagnostic error : errors) {
			if (error instanceof Throwable) {
				if (error instanceof WrappedException)
					return ((WrappedException) error).getCause();
			}
		}

		return null;
	}

	private static class IOWrappedException extends IOException {
		private static final long serialVersionUID = 1L;

		public IOWrappedException(Throwable cause) {
			super(cause.getLocalizedMessage());
			initCause(cause);
		}
	}
}
