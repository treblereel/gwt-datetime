package org.jresearch.threetenbp.gwt.tzdb.client.loader;

import org.gwtproject.resources.client.ClientBundle;
import org.gwtproject.resources.client.Resource;
import org.gwtproject.resources.client.TextResource;

import javax.annotation.Nonnull;

//@Resource
public interface TzdbJsBundle extends ClientBundle {

	@Nonnull
	@Source("base64-binary.js")
	TextResource base64binary();

	@Nonnull
	@Source("TZDB.txt")
	TextResource tzdbEncoded();

}
