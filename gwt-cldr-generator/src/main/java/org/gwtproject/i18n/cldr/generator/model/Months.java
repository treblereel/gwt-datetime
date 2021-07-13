package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Months {

    private List<MonthContext> monthContext;

    public List<MonthContext> getMonthContext() {
        return monthContext;
    }

    public void setMonthContext(List<MonthContext> monthContext) {
        this.monthContext = monthContext;
    }
}
