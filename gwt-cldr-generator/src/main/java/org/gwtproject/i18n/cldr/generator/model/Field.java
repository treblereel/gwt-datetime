package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Field {

    @XmlAttribute
    private String type;

    private String displayName;
    private String relativePeriod;

    private List<Relative> relative;
    private List<RelativeTime> relativeTime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "Field{" +
                "type='" + type + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }

    public List<Relative> getRelative() {
        return relative;
    }

    public void setRelative(List<Relative> relative) {
        this.relative = relative;
    }

    public List<RelativeTime> getRelativeTime() {
        return relativeTime;
    }

    public void setRelativeTime(List<RelativeTime> relativeTime) {
        this.relativeTime = relativeTime;
    }

    public String getRelativePeriod() {
        return relativePeriod;
    }

    public void setRelativePeriod(String relativePeriod) {
        this.relativePeriod = relativePeriod;
    }
}
