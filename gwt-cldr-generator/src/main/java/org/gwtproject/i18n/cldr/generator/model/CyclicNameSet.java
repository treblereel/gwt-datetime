package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CyclicNameSet {


    @XmlAttribute
    private String type;

    private List<CyclicNameContext> cyclicNameContext;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CyclicNameContext> getCyclicNameContext() {
        return cyclicNameContext;
    }

    public void setCyclicNameContext(List<CyclicNameContext> cyclicNameContext) {
        this.cyclicNameContext = cyclicNameContext;
    }
}
