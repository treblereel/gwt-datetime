package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class MonthPatterns {

    private List<MonthPatternContext> monthPatternContext;

    public List<MonthPatternContext> getMonthPatternContext() {
        return monthPatternContext;
    }

    public void setMonthPatternContext(List<MonthPatternContext> monthPatternContext) {
        this.monthPatternContext = monthPatternContext;
    }
}
