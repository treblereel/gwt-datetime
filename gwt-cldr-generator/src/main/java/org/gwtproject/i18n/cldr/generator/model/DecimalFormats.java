package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class DecimalFormats {
    @XmlAttribute
    private String numberSystem;
    private List<DecimalFormatLength> decimalFormatLength;

    public String getNumberSystem() {
        return numberSystem;
    }

    public void setNumberSystem(String numberSystem) {
        this.numberSystem = numberSystem;
    }

    public List<DecimalFormatLength> getDecimalFormatLength() {
        return decimalFormatLength;
    }

    public void setDecimalFormatLength(List<DecimalFormatLength> decimalFormatLength) {
        this.decimalFormatLength = decimalFormatLength;
    }
}
