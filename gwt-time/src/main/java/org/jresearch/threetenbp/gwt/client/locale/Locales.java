package org.jresearch.threetenbp.gwt.client.locale;

import java.util.Locale;

//JDK version, only to pass compilation. See for real code in /src/main/super
public class Locales {

	private Locales() {
		// prevent instantiation
	}
	public static native Locale create(String language, String region, String script, String variant) /*-{
		return @java.util.Locale::new(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(language,region, script, variant);
	}-*/;

}
