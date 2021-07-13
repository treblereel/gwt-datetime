package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class UnitPattern {

    @XmlAttribute
    private String count;

    @XmlAttribute(name = "case")
    private String _case;

    @XmlAttribute
    private String gender;

    @XmlValue
    private String value;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String get_case() {
        return _case;
    }

    public void set_case(String _case) {
        this._case = _case;
    }

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
