package org.gwtproject.i18n.cldr.generator.model;

import org.treblereel.gwt.xml.mapper.api.annotation.XMLMapper;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/10/21
 */
@XMLMapper
public class Ldml {

    private Identity identity;

    private LocaleDisplayNames localeDisplayNames;

    private Layout layout;

    private Characters characters;

    private Delimiters delimiters;

    private Dates dates;

    private Numbers numbers;

    private DecimalFormats decimalFormats;

    private Units units;

    private Posix posix;

    private CharacterLabels characterLabels;

    private TypographicNames typographicNames;

    @XmlElementWrapper(name = "listPatterns")
    @XmlElement(name = "listPattern")
    private List<ListPattern> listPatterns;

    @XmlElementWrapper(name = "contextTransforms")
    @XmlElement(name ="contextTransformUsage")
    private List<ContextTransformUsage> contextTransforms;

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    public LocaleDisplayNames getLocaleDisplayNames() {
        return localeDisplayNames;
    }

    public void setLocaleDisplayNames(LocaleDisplayNames localeDisplayNames) {
        this.localeDisplayNames = localeDisplayNames;
    }

    public Characters getCharacters() {
        return characters;
    }

    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    public Delimiters getDelimiters() {
        return delimiters;
    }

    public void setDelimiters(Delimiters delimiters) {
        this.delimiters = delimiters;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public List<ContextTransformUsage> getContextTransforms() {
        return contextTransforms;
    }

    public void setContextTransforms(List<ContextTransformUsage> contextTransforms) {
        this.contextTransforms = contextTransforms;
    }

    public Numbers getNumbers() {
        return numbers;
    }

    public void setNumbers(Numbers numbers) {
        this.numbers = numbers;
    }

    public DecimalFormats getDecimalFormats() {
        return decimalFormats;
    }

    public void setDecimalFormats(DecimalFormats decimalFormats) {
        this.decimalFormats = decimalFormats;
    }

    public Units getUnits() {
        return units;
    }

    public void setUnits(Units units) {
        this.units = units;
    }

    public List<ListPattern> getListPatterns() {
        return listPatterns;
    }

    public void setListPatterns(List<ListPattern> listPatterns) {
        this.listPatterns = listPatterns;
    }

    public Posix getPosix() {
        return posix;
    }

    public void setPosix(Posix posix) {
        this.posix = posix;
    }

    public CharacterLabels getCharacterLabels() {
        return characterLabels;
    }

    public void setCharacterLabels(CharacterLabels characterLabels) {
        this.characterLabels = characterLabels;
    }

    public TypographicNames getTypographicNames() {
        return typographicNames;
    }

    public void setTypographicNames(TypographicNames typographicNames) {
        this.typographicNames = typographicNames;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }
}
