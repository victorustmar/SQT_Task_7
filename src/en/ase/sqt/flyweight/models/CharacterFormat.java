package en.ase.sqt.flyweight.models;

import en.ase.sqt.flyweight.abstracts.CharacterPrintable;

public class CharacterFormat implements CharacterPrintable {
    private final String fontName;
    private final String fontWeight;
    private final String color;

    public CharacterFormat(String fontName, String fontWeight, String color) {
        this.fontName   = fontName;
        this.fontWeight = fontWeight;
        this.color      = color;
    }

    @Override
    public void print(char symbol, int position, int fontSize) {
        System.out.println(
                "Character: " + symbol +
                        ", position=" + position +
                        ", size=" + fontSize +
                        ", font=" + fontName +
                        ", weight=" + fontWeight +
                        ", color=" + color
        );
    }
}
