package com.wireframesketcher.model.util;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Extends the persister with method that handle workspace resources
 */
public class PlatformPersister extends Persister {
	public EObject load(IFile file) throws IOException {
		URI uri = createFileURI(file);
		Resource resource = null;
		try {
			resource = getResourceSet().getResource(uri, true);
		} catch (WrappedException e) {
			// ingore first on load problem
		}
		if (resource == null)
			resource = getResourceSet().getResource(uri, true);
		checkErrors(resource);
		return (EObject) resource.getContents().get(0);
	}

	public void saveAs(EObject o, IFile file) throws IOException {
		URI uri = createFileURI(file);
		if (o.eResource() != null) {
			o.eResource().setURI(uri);
		} else {
			Resource resource = getResourceSet().createResource(
					createFileURI(file));
			resource.getContents().add(o);
		}
		save(o);
	}

	private static URI createFileURI(IFile file) {
		return URI.createPlatformResourceURI(file.getFullPath().toString(),
				true);
	}
}
