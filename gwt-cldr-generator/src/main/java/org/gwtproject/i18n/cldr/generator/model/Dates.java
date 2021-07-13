package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Dates {

    @XmlElementWrapper(name = "calendars")
    @XmlElement(name = "calendar")
    private List<Calendar> calendars;

    @XmlElementWrapper(name = "fields")
    @XmlElement(name = "field")
    private List<Field> fields;

    private TimeZoneNames timeZoneNames;

    public List<Calendar> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public TimeZoneNames getTimeZoneNames() {
        return timeZoneNames;
    }

    public void setTimeZoneNames(TimeZoneNames timeZoneNames) {
        this.timeZoneNames = timeZoneNames;
    }
}
