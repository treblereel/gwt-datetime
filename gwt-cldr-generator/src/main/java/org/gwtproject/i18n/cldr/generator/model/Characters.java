package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Characters {

    private List<ExemplarCharacters> exemplarCharacters;
    private List<Ellipsis> ellipsis;
    private List<ParseLenients> parseLenients;
    private MoreInformation moreInformation;


    public List<ExemplarCharacters> getExemplarCharacters() {
        return exemplarCharacters;
    }

    public void setExemplarCharacters(List<ExemplarCharacters> exemplarCharacters) {
        this.exemplarCharacters = exemplarCharacters;
    }

    public List<Ellipsis> getEllipsis() {
        return ellipsis;
    }

    public void setEllipsis(List<Ellipsis> ellipsis) {
        this.ellipsis = ellipsis;
    }

    public MoreInformation getMoreInformation() {
        return moreInformation;
    }

    public void setMoreInformation(MoreInformation moreInformation) {
        this.moreInformation = moreInformation;
    }

    public List<ParseLenients> getParseLenients() {
        return parseLenients;
    }

    public void setParseLenients(List<ParseLenients> parseLenients) {
        this.parseLenients = parseLenients;
    }
}
