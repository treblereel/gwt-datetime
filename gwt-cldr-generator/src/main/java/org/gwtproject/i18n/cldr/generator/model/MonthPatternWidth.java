package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class MonthPatternWidth {

    @XmlAttribute
    private String type;

    private Pattern monthPattern;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pattern getMonthPattern() {
        return monthPattern;
    }

    public void setMonthPattern(Pattern monthPattern) {
        this.monthPattern = monthPattern;
    }
}
