package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class OrdinalMinimalPairs {

    @XmlAttribute
    private String ordinal;

    @XmlValue
    private String value;

    public String getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
