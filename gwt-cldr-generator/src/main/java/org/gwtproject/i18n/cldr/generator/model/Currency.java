package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Currency {

    @XmlAttribute
    private String type;

    private String decimal;
    private String group;

    private Pattern pattern;

    private List<DisplayName> displayName;
    private List<Symbol> symbol;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<DisplayName> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(List<DisplayName> displayName) {
        this.displayName = displayName;
    }

    public List<Symbol> getSymbol() {
        return symbol;
    }

    public void setSymbol(List<Symbol> symbol) {
        this.symbol = symbol;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

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

    public static class DisplayName {
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

    public static class Symbol {
        @XmlAttribute
        private String draft;

        @XmlValue
        private String alt;

        public String getDraft() {
            return draft;
        }

        public void setDraft(String draft) {
            this.draft = draft;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }
    }
}
