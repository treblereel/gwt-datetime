package org.jresearch.threetenbp.gwt.client;

import static jsinterop.annotations.JsPackage.GLOBAL;

import javax.annotation.Nonnull;

import org.gwtproject.typedarrays.shared.Uint8Array;

import elemental2.core.ArrayBuffer;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = GLOBAL, name = "support")
public class SupportJs {

	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native float getTimestamp();

	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String getTimezone();

	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native void sleep(int milliseconds);

	/**
	 * @param style  - "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String displayTimeZone(boolean daylight, String timeZone, String style, String locale);

	/**
	 * @param style  - "2-digit", "numeric", "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String[] displayMonths(String style, boolean standalone, String locale);

	/**
	 * @param style  - "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String[] displayWeekdays(String style, boolean standalone, String locale);

	/**
	 * @param style  - "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String[] displayEras(String style, String locale);

	/**
	 * @param style  - "narrow", "short", "long"
	 * @param locale - language tag
	 */
	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String[] displayAmpm(String style, String locale);

	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native DecimalProperty displayNumber(String locale);

	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String[] supportedLocalesOfDateTimeFormat(String[] locales);

	@Nonnull
	@JsMethod(namespace = JsPackage.GLOBAL)
	public static native String[] supportedLocalesOfNumberFormat(String[] locales);

	@Nonnull
	@JsMethod(namespace = "Base64Binary")
	public static native ArrayBuffer decodeArrayBuffer(String base64);

	@Nonnull
	@JsMethod(namespace = "Base64Binary")
	public static native Uint8Array decode(String base64);

}
