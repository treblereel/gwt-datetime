package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class ScientificFormatLength {

    @XmlElementWrapper(name = "scientificFormat")
    private List<Pattern> pattern;

    public List<Pattern> getPattern() {
        return pattern;
    }

    public void setPattern(List<Pattern> pattern) {
        this.pattern = pattern;
    }
}
