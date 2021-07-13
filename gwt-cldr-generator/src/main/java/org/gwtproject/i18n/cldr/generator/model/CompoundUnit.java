package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CompoundUnit {

    @XmlAttribute
    private String type;

    private String unitPrefixPattern;

    private List<UnitPattern> compoundUnitPattern;
    private List<UnitPattern> compoundUnitPattern1;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnitPrefixPattern() {
        return unitPrefixPattern;
    }

    public void setUnitPrefixPattern(String unitPrefixPattern) {
        this.unitPrefixPattern = unitPrefixPattern;
    }

    public List<UnitPattern> getCompoundUnitPattern1() {
        return compoundUnitPattern1;
    }

    public void setCompoundUnitPattern1(List<UnitPattern> compoundUnitPattern1) {
        this.compoundUnitPattern1 = compoundUnitPattern1;
    }

    public List<UnitPattern> getCompoundUnitPattern() {
        return compoundUnitPattern;
    }

    public void setCompoundUnitPattern(List<UnitPattern> compoundUnitPattern) {
        this.compoundUnitPattern = compoundUnitPattern;
    }
}
