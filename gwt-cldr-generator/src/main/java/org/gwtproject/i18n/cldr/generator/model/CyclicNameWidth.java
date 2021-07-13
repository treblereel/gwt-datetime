package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CyclicNameWidth {

    @XmlAttribute
    private String type;

    private List<CyclicName> cyclicName;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CyclicName> getCyclicName() {
        return cyclicName;
    }

    public void setCyclicName(List<CyclicName> cyclicName) {
        this.cyclicName = cyclicName;
    }
}
