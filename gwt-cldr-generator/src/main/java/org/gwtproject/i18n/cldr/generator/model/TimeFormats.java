package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class TimeFormats {
    private List<TimeFormatLength> timeFormatLength;

    public List<TimeFormatLength> getTimeFormatLength() {
        return timeFormatLength;
    }

    public void setTimeFormatLength(List<TimeFormatLength> timeFormatLength) {
        this.timeFormatLength = timeFormatLength;
    }
}
