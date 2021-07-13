package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DateTimeFormats {

    private List<DateTimeFormatLength> dateTimeFormatLength;

    @XmlElementWrapper(name = "availableFormats")
    @XmlElement(name = "dateFormatItem")
    private List<DateFormatItem> availableFormats;

    @XmlElementWrapper(name = "appendItems")
    @XmlElement(name = "appendItem")
    private List<AppendItem> appendItems;

    private IntervalFormats intervalFormats;

    public List<DateTimeFormatLength> getDateTimeFormatLength() {
        return dateTimeFormatLength;
    }

    public void setDateTimeFormatLength(List<DateTimeFormatLength> dateTimeFormatLength) {
        this.dateTimeFormatLength = dateTimeFormatLength;
    }

    public List<DateFormatItem> getAvailableFormats() {
        return availableFormats;
    }

    public void setAvailableFormats(List<DateFormatItem> availableFormats) {
        this.availableFormats = availableFormats;
    }

    public List<AppendItem> getAppendItems() {
        return appendItems;
    }

    public void setAppendItems(List<AppendItem> appendItems) {
        this.appendItems = appendItems;
    }

    public IntervalFormats getIntervalFormats() {
        return intervalFormats;
    }

    public void setIntervalFormats(IntervalFormats intervalFormats) {
        this.intervalFormats = intervalFormats;
    }
}
