package org.jresearch.threetenbp.gwt.time.client;

import java.time.ZoneId;

import elemental2.dom.DomGlobal;
import org.junit.Test;

import com.google.gwt.junit.client.GWTTestCase;

public class GwtTest extends GWTTestCase {

	/**
	 * Must refer to a valid module that sources this class.
	 */
	@Override
	public String getModuleName() {
		return "org.jresearch.threetenbp.gwt.time.Time";
	}

	@Test
	public void testTzdbProviderInit() {
		ZoneId.of("Europe/Paris");
	}

	@Test
	public void testLogging() {
		String param = "test";
		DomGlobal.console.trace("trace message: {}", param);
		DomGlobal.console.debug("debug message: {}", param);
		DomGlobal.console.error("error message: {}", param);
		DomGlobal.console.info("info message: {}", param);
		DomGlobal.console.warn("warn message: {}", param);
	}
}
