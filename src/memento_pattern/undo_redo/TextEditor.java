package memento_pattern.undo_redo;

import java.util.ArrayList;

public class TextEditor {
    private String s;

    public TextMemento createMemento(){
        return new TextMemento(this.getS());
    }
    public void restoreMemento(TextMemento memento){
        this.s = memento.getS();
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

}
