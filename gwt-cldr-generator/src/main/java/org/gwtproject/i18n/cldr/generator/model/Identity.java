package org.gwtproject.i18n.cldr.generator.model;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class Identity {

    private Version version;
    private Language language;


    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "version=" + version +
                ", language=" + language +
                '}';
    }
}
