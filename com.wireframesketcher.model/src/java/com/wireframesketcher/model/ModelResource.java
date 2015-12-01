package com.wireframesketcher.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * This interface represents a model resource
 */
public interface ModelResource extends XMLResource {
	/**
	 * The {@link #getURIFragment(org.eclipse.emf.ecore.EObject)} behaves
	 * differently from the default implementation in {@link XMLResource} to
	 * handle named groups. This method provides access to the default,
	 * unaltered implementation.
	 * 
	 * @param object
	 *            the object
	 * @return the default URI fragment
	 */
	public String getDefaultURIFragment(EObject object);
}
