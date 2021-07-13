package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class MiscPatterns {

    @XmlAttribute
    private String numberSystem;

    private List<Pattern> pattern;

    public String getNumberSystem() {
        return numberSystem;
    }

    public void setNumberSystem(String numberSystem) {
        this.numberSystem = numberSystem;
    }

    public List<Pattern> getPattern() {
        return pattern;
    }

    public void setPattern(List<Pattern> pattern) {
        this.pattern = pattern;
    }
}
