package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Unit {

    @XmlAttribute
    private String type;

    private String gender;

    private String displayName;

    private String perUnitPattern;

    private List<UnitPattern> unitPattern;



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<UnitPattern> getUnitPattern() {
        return unitPattern;
    }

    public void setUnitPattern(List<UnitPattern> unitPattern) {
        this.unitPattern = unitPattern;
    }

    public String getPerUnitPattern() {
        return perUnitPattern;
    }

    public void setPerUnitPattern(String perUnitPattern) {
        this.perUnitPattern = perUnitPattern;
    }
}
