package en.ase.sqt.flyweight.models;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private final List<TextCharacter> characters = new ArrayList<>();

    public void addCharacter(TextCharacter tc) {
        characters.add(tc);
    }

    public void printAll() {
        characters.forEach(TextCharacter::print);
    }
}