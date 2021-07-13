package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
public class LocaleDisplayNames {

    private LocaleDisplayPattern localeDisplayPattern;

    @XmlElementWrapper(name = "languages")
    @XmlElement(name = "language")
    private List<Language> languages;

    @XmlElementWrapper(name = "scripts")
    @XmlElement(name = "script")
    private List<Script> scripts;

    @XmlElementWrapper(name = "territories")
    @XmlElement(name = "territory")
    private List<Territory> territories;

    @XmlElementWrapper(name = "subdivisions")
    @XmlElement(name = "subdivision")
    private List<Subdivision> subdivisions;

    @XmlElementWrapper(name = "variants")
    @XmlElement(name = "variant")
    private List<Variant> variants;

    @XmlElementWrapper(name = "keys")
    @XmlElement(name = "key")
    private List<Key> keys;

    @XmlElementWrapper(name = "codePatterns")
    @XmlElement(name = "key")
    private List<CodePattern> codePatterns;

    @XmlElementWrapper(name = "types")
    @XmlElement(name = "type")
    private List<Type> types;

    @XmlElementWrapper(name = "measurementSystemNames")
    @XmlElement(name = "measurementSystemName")
    private List<MeasurementSystemName> measurementSystemNames;

    public LocaleDisplayPattern getLocaleDisplayPattern() {
        return localeDisplayPattern;
    }

    public void setLocaleDisplayPattern(LocaleDisplayPattern localeDisplayPattern) {
        this.localeDisplayPattern = localeDisplayPattern;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<Script> getScripts() {
        return scripts;
    }

    public void setScripts(List<Script> scripts) {
        this.scripts = scripts;
    }

    public List<Territory> getTerritories() {
        return territories;
    }

    public void setTerritories(List<Territory> territories) {
        this.territories = territories;
    }

    public List<Subdivision> getSubdivisions() {
        return subdivisions;
    }

    public void setSubdivisions(List<Subdivision> subdivisions) {
        this.subdivisions = subdivisions;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public List<MeasurementSystemName> getMeasurementSystemNames() {
        return measurementSystemNames;
    }

    public void setMeasurementSystemNames(List<MeasurementSystemName> measurementSystemNames) {
        this.measurementSystemNames = measurementSystemNames;
    }

    public List<CodePattern> getCodePatterns() {
        return codePatterns;
    }

    public void setCodePatterns(List<CodePattern> codePatterns) {
        this.codePatterns = codePatterns;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}
