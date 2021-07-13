package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Zone {

    @XmlAttribute
    private String type;

    private String exemplarCity;

    @XmlElement(name = "long")
    private Value _long;

    @XmlElement(name = "short")
    private Value _short;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExemplarCity() {
        return exemplarCity;
    }

    public void setExemplarCity(String exemplarCity) {
        this.exemplarCity = exemplarCity;
    }

    public Value get_long() {
        return _long;
    }

    public void set_long(Value _long) {
        this._long = _long;
    }

    public Value get_short() {
        return _short;
    }

    public void set_short(Value _short) {
        this._short = _short;
    }

    public static class Value {

        private Node standard;
        private Node generic;
        private Node daylight;

        public Node getStandard() {
            return standard;
        }

        public Node getGeneric() {
            return generic;
        }

        public void setGeneric(Node generic) {
            this.generic = generic;
        }

        public Node getDaylight() {
            return daylight;
        }

        public void setDaylight(Node daylight) {
            this.daylight = daylight;
        }

        public void setStandard(Node standard) {
            this.standard = standard;
        }

        @Override
        public String toString() {
            return "Value{" +
                    "standard=" + standard +
                    ", generic=" + generic +
                    ", daylight=" + daylight +
                    '}';
        }
    }

    public static class Node {

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
            return "Node{" +
                    "draft='" + draft + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
