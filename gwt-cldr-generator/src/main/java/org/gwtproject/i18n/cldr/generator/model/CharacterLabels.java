package org.gwtproject.i18n.cldr.generator.model;

import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class CharacterLabels {

    private List<CharacterLabelPattern> characterLabelPattern;
    private List<CharacterLabel> characterLabel;

    public List<CharacterLabelPattern> getCharacterLabelPattern() {
        return characterLabelPattern;
    }

    public void setCharacterLabelPattern(List<CharacterLabelPattern> characterLabelPattern) {
        this.characterLabelPattern = characterLabelPattern;
    }

    public List<CharacterLabel> getCharacterLabel() {
        return characterLabel;
    }

    public void setCharacterLabel(List<CharacterLabel> characterLabel) {
        this.characterLabel = characterLabel;
    }
}
