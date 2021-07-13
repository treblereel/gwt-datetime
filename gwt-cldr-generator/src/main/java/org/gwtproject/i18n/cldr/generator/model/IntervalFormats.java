package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class IntervalFormats {

    private String intervalFormatFallback;

    private List<IntervalFormatItem> intervalFormatItem;

    public String getIntervalFormatFallback() {
        return intervalFormatFallback;
    }

    public void setIntervalFormatFallback(String intervalFormatFallback) {
        this.intervalFormatFallback = intervalFormatFallback;
    }

    public List<IntervalFormatItem> getIntervalFormatItem() {
        return intervalFormatItem;
    }

    public void setIntervalFormatItem(List<IntervalFormatItem> intervalFormatItem) {
        this.intervalFormatItem = intervalFormatItem;
    }
}
