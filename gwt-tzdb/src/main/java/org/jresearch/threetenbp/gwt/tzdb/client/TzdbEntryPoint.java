package org.jresearch.threetenbp.gwt.tzdb.client;

import org.jresearch.threetenbp.gwt.emu.org.jresearch.threetenbp.gwt.time.client.Support;
import org.jresearch.threetenbp.gwt.tzdb.client.zone.GwtTzdbZoneRuleProvider;

public class TzdbEntryPoint {

	//@Override
	public void onModuleLoad() {
		Support.registerGwtZoneRuleProvider(new GwtTzdbZoneRuleProvider());
	}

}
