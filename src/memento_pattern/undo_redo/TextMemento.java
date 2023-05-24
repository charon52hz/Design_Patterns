package memento_pattern.undo_redo;

import java.util.Stack;

public class TextMemento {
    private String s;

    public TextMemento(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

}
