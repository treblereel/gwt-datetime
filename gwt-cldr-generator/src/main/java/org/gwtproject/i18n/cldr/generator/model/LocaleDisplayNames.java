package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class LocaleDisplayNames {

    private LocaleDisplayPattern localeDisplayPattern;

    @XmlElementWrapper
    private List<Language> languages;

    public LocaleDisplayPattern getLocaleDisplayPattern() {
        return localeDisplayPattern;
    }

    public void setLocaleDisplayPattern(LocaleDisplayPattern localeDisplayPattern) {
        this.localeDisplayPattern = localeDisplayPattern;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "LocaleDisplayNames{" +
                "localeDisplayPattern=" + localeDisplayPattern +
                ", languages=" + languages +
                '}';
    }
}
