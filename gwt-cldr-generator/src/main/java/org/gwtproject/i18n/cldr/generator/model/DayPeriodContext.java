package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DayPeriodContext {

    @XmlAttribute
    private String type;

    private List<DayPeriodWidth> dayPeriodWidth;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DayPeriodWidth> getDayPeriodWidth() {
        return dayPeriodWidth;
    }

    public void setDayPeriodWidth(List<DayPeriodWidth> dayPeriodWidth) {
        this.dayPeriodWidth = dayPeriodWidth;
    }
}
