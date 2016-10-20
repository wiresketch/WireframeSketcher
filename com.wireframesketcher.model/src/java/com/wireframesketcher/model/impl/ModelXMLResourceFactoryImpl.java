package com.wireframesketcher.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class ModelXMLResourceFactoryImpl extends XMLResourceFactoryImpl {
	public static final Map<Object, Object> DEFAULT_SAVE_OPTIONS = new HashMap<Object, Object>(),
			DEFAULT_LOAD_OPTIONS = new HashMap<Object, Object>(),
			DEFAULT_LOAD_SAVE_OPTIONS = new HashMap<Object, Object>();

	static {
		// Load and Save options

		// NOTE: URIHandlerImpl is not thread safe
		// DEFAULT_LOAD_SAVE_OPTIONS.put(XMLResource.OPTION_URI_HANDLER,
		// new URIHandlerImpl.PlatformSchemeAware());

		// Save options
		DEFAULT_SAVE_OPTIONS.put(XMLResource.OPTION_ENCODING, "UTF-8");
		DEFAULT_SAVE_OPTIONS.put(XMLResource.OPTION_XML_VERSION, "1.0");
		DEFAULT_SAVE_OPTIONS.put(XMLResource.OPTION_CONFIGURATION_CACHE,
				Boolean.TRUE);
		DEFAULT_SAVE_OPTIONS.put(XMLResource.OPTION_SKIP_ESCAPE_URI,
				Boolean.FALSE);

		// Load options
		DEFAULT_LOAD_OPTIONS.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
				Boolean.TRUE);
		DEFAULT_LOAD_OPTIONS.put(XMLResource.OPTION_DEFER_ATTACHMENT,
				Boolean.TRUE);
		DEFAULT_LOAD_OPTIONS.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION,
				Boolean.TRUE);
		DEFAULT_LOAD_OPTIONS.put(XMLResource.OPTION_USE_DEPRECATED_METHODS,
				Boolean.FALSE);
		DEFAULT_LOAD_OPTIONS.put(XMLResource.OPTION_USE_PARSER_POOL,
				new XMLParserPoolImpl(10, false));
		DEFAULT_LOAD_OPTIONS.put(XMLResource.OPTION_LAX_FEATURE_PROCESSING,
				Boolean.TRUE);
	}

	@Override
	public Resource createResource(URI uri) {
		return new ModelXMLResourceImpl(uri);
	}
}
