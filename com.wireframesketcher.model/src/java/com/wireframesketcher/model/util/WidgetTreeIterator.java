package com.wireframesketcher.model.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.ECollections;

import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.WidgetContainer;

/**
 * Iterator for widget tree
 */
public class WidgetTreeIterator extends AbstractTreeIterator<Widget> {
	private final boolean includeComponents;

	public WidgetTreeIterator(Object object, boolean includeComponents) {
		super(object, object instanceof Widget);
		this.includeComponents = includeComponents;
	}

	public WidgetTreeIterator(Object object) {
		this(object, true);
	}

	@Override
	protected Iterator<? extends Widget> getChildren(Object object) {
		if (object instanceof WidgetContainer)
			return ((WidgetContainer) object).getWidgets().iterator();
		else if (object instanceof Master) {
			if (includeComponents) {
				return getComponentChildren((Master) object);
			}
		}

		return ECollections.<Widget> emptyEList().iterator();
	}

	/**
	 * Returns an iterator overs widgets owned by the component. Default
	 * implementation iterates over instantiated component.
	 */
	protected Iterator<? extends Widget> getComponentChildren(Master master) {
		WidgetContainer component = master.getInstance();
		if (component != null)
			return getChildren(component);
		return ECollections.<Widget> emptyEList().iterator();
	}
}
