package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlCData;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class MoreInformation {
    @XmlValue
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
