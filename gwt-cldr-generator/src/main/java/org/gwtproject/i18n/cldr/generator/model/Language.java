package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlCData;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Language {
    @XmlAttribute
    private String type;
    @XmlCData(value = false)
    private String value;

    @Override
    public String toString() {
        return "Language{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
