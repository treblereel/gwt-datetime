package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class RelativeTime {

    @XmlAttribute
    private String type;

    private List<RelativeTimePattern> relativeTimePattern;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<RelativeTimePattern> getRelativeTimePattern() {
        return relativeTimePattern;
    }

    public void setRelativeTimePattern(List<RelativeTimePattern> relativeTimePattern) {
        this.relativeTimePattern = relativeTimePattern;
    }
}
