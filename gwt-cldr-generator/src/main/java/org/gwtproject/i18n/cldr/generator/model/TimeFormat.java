package org.gwtproject.i18n.cldr.generator.model;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class TimeFormat {

    private Pattern pattern;
    private Pattern datetimeSkeleton;

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Pattern getDatetimeSkeleton() {
        return datetimeSkeleton;
    }

    public void setDatetimeSkeleton(Pattern datetimeSkeleton) {
        this.datetimeSkeleton = datetimeSkeleton;
    }
}
