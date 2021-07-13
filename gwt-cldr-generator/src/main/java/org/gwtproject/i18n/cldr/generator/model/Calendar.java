package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Calendar {

    @XmlAttribute
    private String type;

    @XmlElementWrapper(name = "dateFormats")
    @XmlElement(name = "dateFormatLength")
    private List<DateFormatLength> dateFormats;

    private Eras eras;

    private Months months;

    private MonthPatterns monthPatterns;

    private CyclicNameSets cyclicNameSets;

    private Days days;

    private Quarters quarters;

    private DayPeriods dayPeriods;

    private DateTimeFormats dateTimeFormats;

    private TimeFormats timeFormats;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DateFormatLength> getDateFormats() {
        return dateFormats;
    }

    public void setDateFormats(List<DateFormatLength> dateFormats) {
        this.dateFormats = dateFormats;
    }

    public Eras getEras() {
        return eras;
    }

    public void setEras(Eras eras) {
        this.eras = eras;
    }

    public Months getMonths() {
        return months;
    }

    public void setMonths(Months months) {
        this.months = months;
    }

    public DateTimeFormats getDateTimeFormats() {
        return dateTimeFormats;
    }

    public void setDateTimeFormats(DateTimeFormats dateTimeFormats) {
        this.dateTimeFormats = dateTimeFormats;
    }

    public Days getDays() {
        return days;
    }

    public void setDays(Days days) {
        this.days = days;
    }

    public Quarters getQuarters() {
        return quarters;
    }

    public void setQuarters(Quarters quarters) {
        this.quarters = quarters;
    }

    public DayPeriods getDayPeriods() {
        return dayPeriods;
    }

    public void setDayPeriods(DayPeriods dayPeriods) {
        this.dayPeriods = dayPeriods;
    }

    public TimeFormats getTimeFormats() {
        return timeFormats;
    }

    public void setTimeFormats(TimeFormats timeFormats) {
        this.timeFormats = timeFormats;
    }

    public MonthPatterns getMonthPatterns() {
        return monthPatterns;
    }

    public void setMonthPatterns(MonthPatterns monthPatterns) {
        this.monthPatterns = monthPatterns;
    }

    public CyclicNameSets getCyclicNameSets() {
        return cyclicNameSets;
    }

    public void setCyclicNameSets(CyclicNameSets cyclicNameSets) {
        this.cyclicNameSets = cyclicNameSets;
    }
}
