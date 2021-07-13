package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class ContextTransformUsage {

    @XmlAttribute
    private String type;

    private List<ContextTransform> contextTransform;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ContextTransform> getContextTransform() {
        return contextTransform;
    }

    public void setContextTransform(List<ContextTransform> contextTransform) {
        this.contextTransform = contextTransform;
    }

    @Override
    public String toString() {
        return "ContextTransformUsage{" +
                "type='" + type + '\'' +
                ", contextTransform=" + contextTransform +
                '}';
    }
}
