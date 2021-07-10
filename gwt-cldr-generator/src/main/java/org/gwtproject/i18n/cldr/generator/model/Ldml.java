package org.gwtproject.i18n.cldr.generator.model;

import org.treblereel.gwt.xml.mapper.api.annotation.XMLMapper;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
@XMLMapper
public class Ldml {

    private Identity identity;

    private LocaleDisplayNames localeDisplayNames;

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public LocaleDisplayNames getLocaleDisplayNames() {
        return localeDisplayNames;
    }

    public void setLocaleDisplayNames(LocaleDisplayNames localeDisplayNames) {
        this.localeDisplayNames = localeDisplayNames;
    }

    @Override
    public String toString() {
        return "Ldml{" +
                "identity=" + identity +
                ", localeDisplayNames=" + localeDisplayNames +
                '}';
    }
}
