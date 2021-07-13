package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class PercentFormatLength {

    @XmlAttribute
    private String type;

    @XmlElementWrapper(name = "percentFormat")
    private List<Pattern> pattern;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Pattern> getPattern() {
        return pattern;
    }

    public void setPattern(List<Pattern> pattern) {
        this.pattern = pattern;
    }
}
