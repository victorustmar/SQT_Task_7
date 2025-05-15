package en.ase.sqt.flyweight.models;

import java.util.HashMap;
import java.util.Map;

public class CharacterFormatFactory {
    private static final Map<String, CharacterFormat> formats = new HashMap<>();


    public static CharacterFormat getFormat(
            String fontName, String fontWeight, String color) {
        String key = fontName + fontWeight + color;
        CharacterFormat characterFormat = formats.get(key);
        if(characterFormat == null) {
            characterFormat = new CharacterFormat(fontName, fontWeight, color);
            formats.put(key, characterFormat);
        }
        return characterFormat;
    }
}
