package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Numbers {

    private DraftValue defaultNumberingSystem;
    private DraftValue minimumGroupingDigits;
    private DecimalFormats decimalFormats;
    private Symbols symbols;
    private ScientificFormats scientificFormats;
    private PercentFormats percentFormats;
    private CurrencyFormats currencyFormats;

    @XmlElementWrapper(name = "currencies")
    @XmlElement(name = "currency")
    private List<Currency> currencies;
    private MiscPatterns miscPatterns;
    private MinimalPairs minimalPairs;

    @XmlElementWrapper(name = "otherNumberingSystems")
    @XmlElement(name = "native")
    private List<DraftValue> otherNumberingSystems;

    public DraftValue getDefaultNumberingSystem() {
        return defaultNumberingSystem;
    }

    public void setDefaultNumberingSystem(DraftValue defaultNumberingSystem) {
        this.defaultNumberingSystem = defaultNumberingSystem;
    }

    public DraftValue getMinimumGroupingDigits() {
        return minimumGroupingDigits;
    }

    public void setMinimumGroupingDigits(DraftValue minimumGroupingDigits) {
        this.minimumGroupingDigits = minimumGroupingDigits;
    }

    public Symbols getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public List<DraftValue> getOtherNumberingSystems() {
        return otherNumberingSystems;
    }

    public void setOtherNumberingSystems(List<DraftValue> otherNumberingSystems) {
        this.otherNumberingSystems = otherNumberingSystems;
    }

    public DecimalFormats getDecimalFormats() {
        return decimalFormats;
    }

    public void setDecimalFormats(DecimalFormats decimalFormats) {
        this.decimalFormats = decimalFormats;
    }

    public ScientificFormats getScientificFormats() {
        return scientificFormats;
    }

    public void setScientificFormats(ScientificFormats scientificFormats) {
        this.scientificFormats = scientificFormats;
    }

    public PercentFormats getPercentFormats() {
        return percentFormats;
    }

    public void setPercentFormats(PercentFormats percentFormats) {
        this.percentFormats = percentFormats;
    }

    public CurrencyFormats getCurrencyFormats() {
        return currencyFormats;
    }

    public void setCurrencyFormats(CurrencyFormats currencyFormats) {
        this.currencyFormats = currencyFormats;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public MiscPatterns getMiscPatterns() {
        return miscPatterns;
    }

    public void setMiscPatterns(MiscPatterns miscPatterns) {
        this.miscPatterns = miscPatterns;
    }

    public MinimalPairs getMinimalPairs() {
        return minimalPairs;
    }

    public void setMinimalPairs(MinimalPairs minimalPairs) {
        this.minimalPairs = minimalPairs;
    }


    public static class DraftValue {
        @XmlAttribute
        private String draft;
        @XmlValue
        private String value;

        public String getDraft() {
            return draft;
        }

        public void setDraft(String draft) {
            this.draft = draft;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "DraftValue{" +
                    "draft='" + draft + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class Symbols {
        private String decimal;
        @XmlAttribute
        private String numberSystem;
        private String group;
        private String percentSign;
        private String approximatelySign;
        private String exponential;
        private String superscriptingExponent;
        private String perMille;
        private String infinity;
        private String nan;
        private String currencyGroup;
        private String currencyDecimal;

        private DraftValue plusSign;
        private DraftValue minusSign;
        private DraftValue timeSeparator;
        private DraftValue list;

        public String getDecimal() {
            return decimal;
        }

        public void setDecimal(String decimal) {
            this.decimal = decimal;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getPercentSign() {
            return percentSign;
        }

        public void setPercentSign(String percentSign) {
            this.percentSign = percentSign;
        }

        public String getApproximatelySign() {
            return approximatelySign;
        }

        public void setApproximatelySign(String approximatelySign) {
            this.approximatelySign = approximatelySign;
        }

        public String getExponential() {
            return exponential;
        }

        public void setExponential(String exponential) {
            this.exponential = exponential;
        }

        public String getSuperscriptingExponent() {
            return superscriptingExponent;
        }

        public void setSuperscriptingExponent(String superscriptingExponent) {
            this.superscriptingExponent = superscriptingExponent;
        }

        public String getPerMille() {
            return perMille;
        }

        public void setPerMille(String perMille) {
            this.perMille = perMille;
        }

        public String getInfinity() {
            return infinity;
        }

        public void setInfinity(String infinity) {
            this.infinity = infinity;
        }

        public DraftValue getPlusSign() {
            return plusSign;
        }

        public void setPlusSign(DraftValue plusSign) {
            this.plusSign = plusSign;
        }

        public DraftValue getMinusSign() {
            return minusSign;
        }

        public void setMinusSign(DraftValue minusSign) {
            this.minusSign = minusSign;
        }

        public DraftValue getTimeSeparator() {
            return timeSeparator;
        }

        public void setTimeSeparator(DraftValue timeSeparator) {
            this.timeSeparator = timeSeparator;
        }

        @Override
        public String toString() {
            return "Symbols{" +
                    "decimal='" + decimal + '\'' +
                    ", group='" + group + '\'' +
                    ", percentSign='" + percentSign + '\'' +
                    ", approximatelySign='" + approximatelySign + '\'' +
                    ", exponential='" + exponential + '\'' +
                    ", superscriptingExponent='" + superscriptingExponent + '\'' +
                    ", perMille='" + perMille + '\'' +
                    ", infinity='" + infinity + '\'' +
                    ", plusSign=" + plusSign +
                    ", minusSign=" + minusSign +
                    ", timeSeparator=" + timeSeparator +
                    '}';
        }

        public String getNumberSystem() {
            return numberSystem;
        }

        public void setNumberSystem(String numberSystem) {
            this.numberSystem = numberSystem;
        }

        public DraftValue getList() {
            return list;
        }

        public void setList(DraftValue list) {
            this.list = list;
        }

        public String getNan() {
            return nan;
        }

        public void setNan(String nan) {
            this.nan = nan;
        }

        public String getCurrencyGroup() {
            return currencyGroup;
        }

        public void setCurrencyGroup(String currencyGroup) {
            this.currencyGroup = currencyGroup;
        }

        public String getCurrencyDecimal() {
            return currencyDecimal;
        }

        public void setCurrencyDecimal(String currencyDecimal) {
            this.currencyDecimal = currencyDecimal;
        }
    }
}
