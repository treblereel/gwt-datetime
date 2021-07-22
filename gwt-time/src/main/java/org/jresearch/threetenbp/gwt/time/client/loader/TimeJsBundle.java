package org.jresearch.threetenbp.gwt.time.client.loader;

import org.gwtproject.resources.client.ClientBundle;
import org.gwtproject.resources.client.Resource;
import org.gwtproject.resources.client.TextResource;

import javax.annotation.Nonnull;

//@Resource
public interface TimeJsBundle extends ClientBundle {

	@Nonnull
	@Source("support.js")
	public TextResource support();

}
