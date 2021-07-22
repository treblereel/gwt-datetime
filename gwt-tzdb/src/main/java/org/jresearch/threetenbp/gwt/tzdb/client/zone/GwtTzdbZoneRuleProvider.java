package org.jresearch.threetenbp.gwt.tzdb.client.zone;

import java.nio.ByteBuffer;
import java.time.zone.ZoneRulesProvider;

import elemental2.dom.DomGlobal;
import org.gwtproject.core.client.ScriptInjector;
import org.gwtproject.nio.TypedArrayHelper;
import org.jresearch.threetenbp.gwt.time.client.zone.GwtZoneRuleProvider;
import org.jresearch.threetenbp.gwt.tzdb.client.TzdbJs;
import org.jresearch.threetenbp.gwt.tzdb.client.loader.TzdbJsBundle;
import org.jresearch.threetenbp.gwt.tzdb.client.loader.TzdbJsBundleImpl;

import elemental2.core.ArrayBuffer;

public class GwtTzdbZoneRuleProvider implements GwtZoneRuleProvider {

	private static final TzdbJsBundle bundle = new TzdbJsBundleImpl();

	private static boolean initialized = false;

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public void initialize() {
		DomGlobal.console.debug("TZDB sync initialization called");
		if (!initialized) {
			DomGlobal.console.debug("TZDB sync initialization started");
			ScriptInjector.fromString(bundle.base64binary().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			String tzData = bundle.tzdbEncoded().getText();
			ArrayBuffer buffer = TzdbJs.decodeArrayBuffer(tzData);
			ByteBuffer data = TypedArrayHelper.wrap(buffer);
			ZoneRulesProvider provider = new TzdbZoneRulesProvider(data);
			if (!initialized) {
				ZoneRulesProvider.registerProvider(provider);
			}
			DomGlobal.console.debug("TZDB sync initialization finished");
			initialized = true;
		}
	}

	@Override
	public String getProviderId() {
		return TzdbZoneRulesProvider.class.getName();
	}

}
