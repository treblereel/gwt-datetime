package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DayPeriodWidth {

    @XmlAttribute
    private String type;

    private List<DayPeriod> dayPeriod;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DayPeriod> getDayPeriod() {
        return dayPeriod;
    }

    public void setDayPeriod(List<DayPeriod> dayPeriod) {
        this.dayPeriod = dayPeriod;
    }
}
