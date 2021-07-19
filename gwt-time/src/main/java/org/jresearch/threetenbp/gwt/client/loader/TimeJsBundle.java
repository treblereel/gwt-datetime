package org.jresearch.threetenbp.gwt.client.loader;

import org.gwtproject.resources.client.ClientBundle;
import org.gwtproject.resources.client.DataResource;
import org.gwtproject.resources.client.Resource;
import org.gwtproject.resources.client.TextResource;

import javax.annotation.Nonnull;

//@Resource
public interface TimeJsBundle extends ClientBundle {

	@Nonnull
	@Source("support.js")
	TextResource support();

	@Nonnull
	@Source("base64-binary.js")
	TextResource base64binary();

	@Nonnull
	@Source("TZDB.dat")
	DataResource tzdb();

	@Nonnull
	@Source("TZDB.txt")
	TextResource tzdbEncoded();

}
