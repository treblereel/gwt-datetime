package org.gwtproject.i18n.cldr.generator.model;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class LocaleDisplayPattern {

    private String localePattern;
    private String localeSeparator;
    private String localeKeyTypePattern;

    public String getLocalePattern() {
        return localePattern;
    }

    public void setLocalePattern(String localePattern) {
        this.localePattern = localePattern;
    }

    public String getLocaleSeparator() {
        return localeSeparator;
    }

    public void setLocaleSeparator(String localeSeparator) {
        this.localeSeparator = localeSeparator;
    }

    public String getLocaleKeyTypePattern() {
        return localeKeyTypePattern;
    }

    public void setLocaleKeyTypePattern(String localeKeyTypePattern) {
        this.localeKeyTypePattern = localeKeyTypePattern;
    }
}
