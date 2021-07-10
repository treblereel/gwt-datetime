package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Version {

    @XmlAttribute
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Version{" +
                "number='" + number + '\'' +
                '}';
    }
}
