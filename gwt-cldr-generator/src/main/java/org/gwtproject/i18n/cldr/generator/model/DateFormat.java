package org.gwtproject.i18n.cldr.generator.model;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class DateFormat {

    private Pattern pattern;
    private DateTimeSkeleton datetimeSkeleton;

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public DateTimeSkeleton getDatetimeSkeleton() {
        return datetimeSkeleton;
    }

    public void setDatetimeSkeleton(DateTimeSkeleton datetimeSkeleton) {
        this.datetimeSkeleton = datetimeSkeleton;
    }
}
