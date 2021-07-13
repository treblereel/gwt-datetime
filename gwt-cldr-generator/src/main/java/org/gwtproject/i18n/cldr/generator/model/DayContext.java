package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DayContext {

    @XmlAttribute
    private String type;

    private List<DayWidth> dayWidth;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DayWidth> getDayWidth() {
        return dayWidth;
    }

    public void setDayWidth(List<DayWidth> dayWidth) {
        this.dayWidth = dayWidth;
    }
}
