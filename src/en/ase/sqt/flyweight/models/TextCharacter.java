package en.ase.sqt.flyweight.models;

public class TextCharacter {
    private final char symbol;
    private final int position;
    private final int fontSize;
    private final CharacterFormat format;

    public TextCharacter(char symbol, int position, int fontSize, String fontName, String fontWeight, String color) {
        this.symbol   = symbol;
        this.position = position;
        this.fontSize = fontSize;
        this.format   = CharacterFormatFactory.getFormat(fontName, fontWeight, color);
    }

    public void print() {
        format.print(symbol, position, fontSize);
    }
}
