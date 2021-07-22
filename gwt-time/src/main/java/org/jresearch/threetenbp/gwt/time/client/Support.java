package org.jresearch.threetenbp.gwt.time.client;

import elemental2.core.JsDate;
import elemental2.dom.DomGlobal;
import org.gwtproject.core.client.ScriptInjector;
import org.jresearch.threetenbp.gwt.time.client.loader.TimeJsBundle;
import org.jresearch.threetenbp.gwt.time.client.loader.TimeJsBundleImpl;
import org.jresearch.threetenbp.gwt.time.client.locale.LocaleWrapper;
import org.jresearch.threetenbp.gwt.time.client.zone.GwtZoneRuleProvider;

import javax.annotation.Nonnull;
import java.time.zone.ZoneRulesProvider;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

public class Support {

	public static final TimeJsBundle bundle = new TimeJsBundleImpl();
	private static final Map<String, GwtZoneRuleProvider> gwtZoneRuleProviders = new HashMap<>();

	private static boolean commonInitialized = false;

	public static void init() {
		if (!commonInitialized) {
			DomGlobal.console.debug("common initialization");
			ScriptInjector.fromString(bundle.support().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			commonInitialized = true;
		}
	}

	public static void initTzData() {
		DomGlobal.console.debug("initTzData called");
		if (!commonInitialized) {
			init();
		}
		if (!isTzTnitialized()) {
			gwtZoneRuleProviders.values().forEach(GwtZoneRuleProvider::initialize);
		}
	}

	public static void registerGwtZoneRuleProvider(GwtZoneRuleProvider gwtZoneRuleProvider) {
		if (!gwtZoneRuleProviders.containsKey(gwtZoneRuleProvider.getProviderId())) {
			DomGlobal.console.debug("Register GWT zone rule provider: {}", gwtZoneRuleProvider.getProviderId());
			gwtZoneRuleProviders.put(gwtZoneRuleProvider.getProviderId(), gwtZoneRuleProvider);
			ZoneRulesProvider.refresh();
		}
	}

	public static boolean isTzTnitialized() {
		return !gwtZoneRuleProviders.isEmpty() && gwtZoneRuleProviders.values().stream().allMatch(GwtZoneRuleProvider::isInitialized);
	}

	public static float getTimestamp() {
		return SupportJs.getTimestamp();
	}

	public static int getMinutesOffset() {
		return -(new JsDate().getTimezoneOffset());
	}

	@Nonnull
	public static String getTimezone() {
		return SupportJs.getTimezone();
	}

	public static void sleep(int milliseconds) {
		SupportJs.sleep(milliseconds);
	}

	/**
	 * @param style  - "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	public static String displayTimeZone(boolean daylight, String timeZone, String style, String locale) {
		return SupportJs.displayTimeZone(daylight, timeZone, style, locale);
	}

	/**
	 * @param style  - "2-digit", "numeric", "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	public static String[] displayMonths(String style, boolean standalone, String locale) {
		return SupportJs.displayMonths(style, standalone, locale);
	}

	/**
	 * @param style  - "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	public static String[] displayWeekdays(String style, boolean standalone, String locale) {
		return SupportJs.displayWeekdays(style, standalone, locale);
	}

	/**
	 * @param style  - "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	public static String[] displayEras(String style, String locale) {
		return SupportJs.displayEras(style, locale);
	}

	/**
	 * @param style  - "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	public static String[] displayAmpm(String style, String locale) {
		return SupportJs.displayAmpm(style, locale);
	}

	@Nonnull
	public static DecimalProperty displayNumber(String locale) {
		return SupportJs.displayNumber(locale);
	}

	@Nonnull
	public static Locale[] supportedLocalesOfDateTimeFormat(Locale[] locales) {
		String[] a = Stream.of(locales).map(l -> LocaleWrapper.getInstance(l).toLanguageTag()).filter(l -> !"und".equalsIgnoreCase(l)).toArray(String[]::new);
		String[] supportedLocales = SupportJs.supportedLocalesOfDateTimeFormat(a);
		return Stream.of(supportedLocales).map(Support::jsRootToJava).map(l -> LocaleWrapper.getInstance(l)).toArray(Locale[]::new);
	}

	@Nonnull
	public static Locale[] supportedLocalesOfNumberFormat(Locale[] locales) {
		String[] a = Stream.of(locales).map(l -> LocaleWrapper.getInstance(l).toLanguageTag()).filter(l -> !"und".equalsIgnoreCase(l)).toArray(String[]::new);
		String[] supportedLocales = SupportJs.supportedLocalesOfNumberFormat(a);
		return Stream.of(supportedLocales).map(Support::jsRootToJava).map(l -> LocaleWrapper.getInstance(l)).toArray(Locale[]::new);
	}

	public static String jsRootToJava(String tag) {
		return "root".equalsIgnoreCase(tag) ? "" : tag;
	}

}
