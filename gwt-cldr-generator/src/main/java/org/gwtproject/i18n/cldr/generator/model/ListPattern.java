package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class ListPattern {

    @XmlAttribute
    private String type;

    private List<ListPatternPart> listPatternPart;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ListPatternPart> getListPatternPart() {
        return listPatternPart;
    }

    public void setListPatternPart(List<ListPatternPart> listPatternPart) {
        this.listPatternPart = listPatternPart;
    }

    public static class ListPatternPart {

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
