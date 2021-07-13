package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DateTimeFormatLength {

    @XmlAttribute
    private String type;

    private DateTimeFormat dateTimeFormat;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DateTimeFormat getDateTimeFormat() {
        return dateTimeFormat;
    }

    public void setDateTimeFormat(DateTimeFormat dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }
}
