package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class TypographicNames {

    private List<AxisName> axisName;
    private List<StyleName> styleName;
    private List<FeatureName> featureName;

    public List<AxisName> getAxisName() {
        return axisName;
    }

    public void setAxisName(List<AxisName> axisName) {
        this.axisName = axisName;
    }

    public List<StyleName> getStyleName() {
        return styleName;
    }

    public void setStyleName(List<StyleName> styleName) {
        this.styleName = styleName;
    }

    public List<FeatureName> getFeatureName() {
        return featureName;
    }

    public void setFeatureName(List<FeatureName> featureName) {
        this.featureName = featureName;
    }

    public static class AxisName {

        @XmlAttribute
        private String type;

        @XmlValue
        private String value;


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class StyleName {
        @XmlAttribute
        private String type;

        @XmlAttribute
        private String subtype;

        @XmlAttribute
        private String alt;

        @XmlValue
        private String value;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }
    }

    public static class FeatureName {
        @XmlAttribute
        private String type;

        @XmlValue
        private String value;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
