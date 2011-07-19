package com.wireframesketcher.model.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;

public class ResourceURIHandler extends URIHandlerImpl.PlatformSchemeAware {
	@Override
	public URI resolve(URI uri) {
		// Fix broken absolute image URIs
		if (uri.scheme() == null && uri.segmentCount() > 1
				&& "resource".equals(uri.segment(0))) {
			uri = URI.createURI("platform:" + uri.toString());
		}

		return super.resolve(uri);
	}
}
