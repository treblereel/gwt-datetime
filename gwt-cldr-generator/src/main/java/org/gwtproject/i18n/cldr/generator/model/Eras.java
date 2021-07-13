package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class Eras {

    private Holder eraNames;
    private Holder eraAbbr;
    private Holder eraNarrow;

    public Holder getEraNames() {
        return eraNames;
    }

    public void setEraNames(Holder eraNames) {
        this.eraNames = eraNames;
    }

    public Holder getEraAbbr() {
        return eraAbbr;
    }

    public void setEraAbbr(Holder eraAbbr) {
        this.eraAbbr = eraAbbr;
    }

    public Holder getEraNarrow() {
        return eraNarrow;
    }

    public void setEraNarrow(Holder eraNarrow) {
        this.eraNarrow = eraNarrow;
    }

    public static class Holder {
        @XmlElement(name = "era")
        private List<Era> eras;

        public List<Era> getEras() {
            return eras;
        }

        public void setEras(List<Era> eras) {
            this.eras = eras;
        }
    }
}
