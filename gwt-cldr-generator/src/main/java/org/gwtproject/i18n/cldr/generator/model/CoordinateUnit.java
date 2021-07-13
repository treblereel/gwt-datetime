package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CoordinateUnit {

    private String displayName;

    private List<UnitPattern> coordinateUnitPattern;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List<UnitPattern> getCoordinateUnitPattern() {
        return coordinateUnitPattern;
    }

    public void setCoordinateUnitPattern(List<UnitPattern> coordinateUnitPattern) {
        this.coordinateUnitPattern = coordinateUnitPattern;
    }
}
