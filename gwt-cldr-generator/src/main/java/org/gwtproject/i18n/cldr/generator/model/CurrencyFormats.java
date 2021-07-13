package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CurrencyFormats {

    @XmlAttribute
    private String numberSystem;
    private List<CurrencyFormatLength> currencyFormatLength;
    private List<UnitPattern> unitPattern;

    public String getNumberSystem() {
        return numberSystem;
    }

    public void setNumberSystem(String numberSystem) {
        this.numberSystem = numberSystem;
    }

    public List<CurrencyFormatLength> getCurrencyFormatLength() {
        return currencyFormatLength;
    }

    public void setCurrencyFormatLength(List<CurrencyFormatLength> currencyFormatLength) {
        this.currencyFormatLength = currencyFormatLength;
    }

    public List<UnitPattern> getUnitPattern() {
        return unitPattern;
    }

    public void setUnitPattern(List<UnitPattern> unitPattern) {
        this.unitPattern = unitPattern;
    }

    public static class UnitPattern {

        @XmlAttribute
        private String count;
        @XmlValue
        private String value;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
