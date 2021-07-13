package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class MonthContext {

    @XmlAttribute
    private String type;

    private MonthWidth monthWidth;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MonthWidth getMonthWidth() {
        return monthWidth;
    }

    public void setMonthWidth(MonthWidth monthWidth) {
        this.monthWidth = monthWidth;
    }
}
