package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Days {

    private List<DayContext> dayContext;

    public List<DayContext> getDayContext() {
        return dayContext;
    }

    public void setDayContext(List<DayContext> dayContext) {
        this.dayContext = dayContext;
    }
}
