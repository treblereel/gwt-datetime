package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Variant {

    @XmlAttribute
    private String type;
    @XmlAttribute
    private String draft;
    @XmlValue
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "type='" + type + '\'' +
                ", draft='" + draft + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
