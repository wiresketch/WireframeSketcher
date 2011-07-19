package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import com.wireframesketcher.model.NameSupport;

public class ModelXMLResourceImpl extends XMLResourceImpl {
	public ModelXMLResourceImpl() {
		super();
	}

	public ModelXMLResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new ModelXMLHelperImpl(this);
	}

	@Override
	public String getURIFragment(EObject object) {
		if (object instanceof NameSupport) {
			String name = ((NameSupport) object).getName();
			if (name != null)
				return name;
		}

		return super.getURIFragment(object);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		EList<EObject> contents = getContents();
		for (int i = 0; i < contents.size(); i++) {
			EObject root = contents.get(i);

			EList<EObject> children = root.eContents();
			for (int j = 0; j < children.size(); j++) {
				EObject child = children.get(j);

				if (child instanceof NameSupport
						&& uriFragment.equals(((NameSupport) child).getName()))
					return child;
			}
		}

		return super.getEObject(uriFragment);
	}
}
