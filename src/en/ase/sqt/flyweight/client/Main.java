package en.ase.sqt.flyweight.client;

import en.ase.sqt.flyweight.models.TextEditor;
import en.ase.sqt.flyweight.models.TextCharacter;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        String text = "Textnavemdarfacemache";
        for (int i = 0; i < text.length(); i++) {
            editor.addCharacter(new TextCharacter(text.charAt(i), i, 30, "Calibri", "Italic", "Brown"));
        }

        editor.printAll();

    }
}