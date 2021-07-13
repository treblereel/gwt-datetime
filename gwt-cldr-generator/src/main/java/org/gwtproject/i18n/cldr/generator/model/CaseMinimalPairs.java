package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CaseMinimalPairs {

    @XmlAttribute(name = "case")
    private String _case;

    @XmlValue
    private String value;

    public String get_case() {
        return _case;
    }

    public void set_case(String _case) {
        this._case = _case;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
