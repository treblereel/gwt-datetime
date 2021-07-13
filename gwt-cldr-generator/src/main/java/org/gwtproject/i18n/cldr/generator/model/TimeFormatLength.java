package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class TimeFormatLength {

    @XmlAttribute
    private String type;

    private TimeFormat timeFormat;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TimeFormat getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(TimeFormat timeFormat) {
        this.timeFormat = timeFormat;
    }
}
