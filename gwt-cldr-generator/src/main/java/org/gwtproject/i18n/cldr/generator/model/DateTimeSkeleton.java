package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DateTimeSkeleton {

    @XmlValue
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
