package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Units {

    private List<UnitLength> unitLength;
    private List<DurationUnit> durationUnit;

    public List<UnitLength> getUnitLength() {
        return unitLength;
    }

    public void setUnitLength(List<UnitLength> unitLength) {
        this.unitLength = unitLength;
    }

    public List<DurationUnit> getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(List<DurationUnit> durationUnit) {
        this.durationUnit = durationUnit;
    }
}
