package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class QuarterContext {

    @XmlAttribute
    private String type;

    private List<QuarterWidth> quarterWidth;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<QuarterWidth> getQuarterWidth() {
        return quarterWidth;
    }

    public void setQuarterWidth(List<QuarterWidth> quarterWidth) {
        this.quarterWidth = quarterWidth;
    }
}
