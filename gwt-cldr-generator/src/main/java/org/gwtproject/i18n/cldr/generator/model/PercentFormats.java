package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class PercentFormats {

    @XmlAttribute
    private String numberSystem;

    private List<PercentFormatLength> percentFormatLength;

    public String getNumberSystem() {
        return numberSystem;
    }

    public void setNumberSystem(String numberSystem) {
        this.numberSystem = numberSystem;
    }

    public List<PercentFormatLength> getPercentFormatLength() {
        return percentFormatLength;
    }

    public void setPercentFormatLength(List<PercentFormatLength> percentFormatLength) {
        this.percentFormatLength = percentFormatLength;
    }
}
