package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class UnitLength {

    @XmlAttribute
    private String type;

    private List<CompoundUnit> compoundUnit;
    private List<Unit> unit;
    private List<CoordinateUnit> coordinateUnit;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CompoundUnit> getCompoundUnit() {
        return compoundUnit;
    }

    public void setCompoundUnit(List<CompoundUnit> compoundUnit) {
        this.compoundUnit = compoundUnit;
    }

    public List<Unit> getUnit() {
        return unit;
    }

    public void setUnit(List<Unit> unit) {
        this.unit = unit;
    }

    public List<CoordinateUnit> getCoordinateUnit() {
        return coordinateUnit;
    }

    public void setCoordinateUnit(List<CoordinateUnit> coordinateUnit) {
        this.coordinateUnit = coordinateUnit;
    }
}
