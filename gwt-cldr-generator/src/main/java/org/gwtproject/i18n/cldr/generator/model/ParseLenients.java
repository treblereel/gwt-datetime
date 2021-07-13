package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class ParseLenients {

    @XmlElement
    private String scope;
    @XmlElement
    private String level;
    private List<ParseLenient> parseLenient;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<ParseLenient> getParseLenient() {
        return parseLenient;
    }

    public void setParseLenient(List<ParseLenient> parseLenient) {
        this.parseLenient = parseLenient;
    }

    @Override
    public String toString() {
        return "ParseLenients{" +
                "scope='" + scope + '\'' +
                ", level='" + level + '\'' +
                ", parseLenient=" + parseLenient +
                '}';
    }
}
