package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class GenderMinimalPairs {

    @XmlAttribute
    private String gender;

    @XmlValue
    private String value;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
