package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class MinimalPairs {

    private List<PluralMinimalPairs> pluralMinimalPairs;
    private List<CaseMinimalPairs> caseMinimalPairs;
    private List<GenderMinimalPairs> genderMinimalPairs;
    private List<OrdinalMinimalPairs> ordinalMinimalPairs;

    public List<PluralMinimalPairs> getPluralMinimalPairs() {
        return pluralMinimalPairs;
    }

    public void setPluralMinimalPairs(List<PluralMinimalPairs> pluralMinimalPairs) {
        this.pluralMinimalPairs = pluralMinimalPairs;
    }

    public List<CaseMinimalPairs> getCaseMinimalPairs() {
        return caseMinimalPairs;
    }

    public void setCaseMinimalPairs(List<CaseMinimalPairs> caseMinimalPairs) {
        this.caseMinimalPairs = caseMinimalPairs;
    }

    public List<GenderMinimalPairs> getGenderMinimalPairs() {
        return genderMinimalPairs;
    }

    public void setGenderMinimalPairs(List<GenderMinimalPairs> genderMinimalPairs) {
        this.genderMinimalPairs = genderMinimalPairs;
    }

    public List<OrdinalMinimalPairs> getOrdinalMinimalPairs() {
        return ordinalMinimalPairs;
    }

    public void setOrdinalMinimalPairs(List<OrdinalMinimalPairs> ordinalMinimalPairs) {
        this.ordinalMinimalPairs = ordinalMinimalPairs;
    }
}
