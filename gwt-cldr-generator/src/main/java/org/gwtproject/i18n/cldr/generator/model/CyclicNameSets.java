package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CyclicNameSets {

    private List<CyclicNameSet> cyclicNameSet;

    public List<CyclicNameSet> getCyclicNameSet() {
        return cyclicNameSet;
    }

    public void setCyclicNameSet(List<CyclicNameSet> cyclicNameSet) {
        this.cyclicNameSet = cyclicNameSet;
    }
}
