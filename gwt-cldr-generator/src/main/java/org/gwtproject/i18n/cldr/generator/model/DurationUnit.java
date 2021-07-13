package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DurationUnit {

    @XmlAttribute
    private String type;

    private List<String> durationUnitPattern;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getDurationUnitPattern() {
        return durationUnitPattern;
    }

    public void setDurationUnitPattern(List<String> durationUnitPattern) {
        this.durationUnitPattern = durationUnitPattern;
    }
}
