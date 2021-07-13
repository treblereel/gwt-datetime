package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class QuarterWidth {

    @XmlAttribute
    private String type;

    private List<Quarter> quarter;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Quarter> getQuarter() {
        return quarter;
    }

    public void setQuarter(List<Quarter> quarter) {
        this.quarter = quarter;
    }
}
