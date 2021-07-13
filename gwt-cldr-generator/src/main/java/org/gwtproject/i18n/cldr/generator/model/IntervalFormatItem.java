package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class IntervalFormatItem {

    @XmlAttribute
    private String id;

    private List<GreatestDifference> greatestDifference;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<GreatestDifference> getGreatestDifference() {
        return greatestDifference;
    }

    public void setGreatestDifference(List<GreatestDifference> greatestDifference) {
        this.greatestDifference = greatestDifference;
    }
}
