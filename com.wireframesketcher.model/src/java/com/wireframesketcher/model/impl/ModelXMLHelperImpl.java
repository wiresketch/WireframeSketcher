package com.wireframesketcher.model.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;

import com.wireframesketcher.model.ModelFactory;
import com.wireframesketcher.model.ModelPackage;

public class ModelXMLHelperImpl extends XMLHelperImpl {
	public ModelXMLHelperImpl() {
		super();
	}

	public ModelXMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	@Override
	public String convertToString(EFactory factory, EDataType dataType,
			Object value) {
		if (dataType == ModelPackage.Literals.URI_DATA_TYPE && value != null) {
			value = deresolve((URI) value);
		}

		return super.convertToString(factory, dataType, value);
	}

	@Override
	protected Object createFromString(EFactory factory, EDataType dataType,
			String value) {
		Object actualValue = super.createFromString(factory, dataType, value);

		if (dataType == ModelPackage.Literals.URI_DATA_TYPE
				&& actualValue != null) {
			actualValue = resolve((URI) actualValue, resourceURI);
		}

		return actualValue;
	}
	
	@Override
	public EObject createObject(EFactory factory, EClassifier type) {
		// Fix the missing xsi:type attribute for master refs in old screen files
		if(type == ModelPackage.Literals.WIDGET_CONTAINER)
			return ModelFactory.eINSTANCE.createScreen();
		
		return super.createObject(factory, type);
	}
}
