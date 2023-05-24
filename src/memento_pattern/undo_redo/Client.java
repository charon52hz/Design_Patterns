package memento_pattern.undo_redo;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();
        textEditor.setS("文字加斜体...");caretaker.addMemento(textEditor.createMemento());
        System.out.println(textEditor.getS());
        textEditor.setS("文字加下划线...");caretaker.addMemento(textEditor.createMemento());
        System.out.println(textEditor.getS());
        textEditor.setS("文字描红...");caretaker.addMemento(textEditor.createMemento());
        System.out.println(textEditor.getS());
        System.out.println("======发现斜体不好看，进行撤销操作======");
        textEditor.restoreMemento(caretaker.undoStack());
        textEditor.restoreMemento(caretaker.undoStack());
        textEditor.restoreMemento(caretaker.undoStack());
        System.out.println(textEditor.getS());
        System.out.println("======觉得不改也行，进行恢复操作======");
        textEditor.restoreMemento(caretaker.redoStack());
        textEditor.restoreMemento(caretaker.redoStack());
        textEditor.restoreMemento(caretaker.redoStack());
        System.out.println(textEditor.getS());
    }
}
