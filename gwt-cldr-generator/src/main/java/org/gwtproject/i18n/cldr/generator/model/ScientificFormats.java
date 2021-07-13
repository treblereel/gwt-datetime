package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class ScientificFormats {

    @XmlAttribute
    private String numberSystem;

    private List<ScientificFormatLength> scientificFormatLength;

    public String getNumberSystem() {
        return numberSystem;
    }

    public void setNumberSystem(String numberSystem) {
        this.numberSystem = numberSystem;
    }

    public List<ScientificFormatLength> getScientificFormatLength() {
        return scientificFormatLength;
    }

    public void setScientificFormatLength(List<ScientificFormatLength> scientificFormatLength) {
        this.scientificFormatLength = scientificFormatLength;
    }
}
