package memento_pattern.undo_redo;

import java.util.Stack;

public class Caretaker {
    private Stack<TextMemento> undo = new Stack<TextMemento>();
    private Stack<TextMemento> redo = new Stack<TextMemento>();

    public void addMemento(TextMemento memento){
        undo.push(memento);
    }

    public TextMemento undoStack(){
        if (undo.isEmpty()){
            System.out.println("最初状态，无法撤销");
            return null;
        }else {
            TextMemento s = undo.pop();
            redo.push(s);
            if(!undo.isEmpty()){//判断弹出数据后是否为空，如果为空，说明已撤回到最原始状态
                undo.peek();
            }
            return s;
        }
    }
    public TextMemento redoStack(){
        if (redo.isEmpty()){
            System.out.println("最新状态，无法恢复");
            return null;
        }else {
            TextMemento s = redo.pop();
            undo.push(s);
            if(!redo.isEmpty()){//判断弹出数据后是否为空，如果为空，说明已撤回到最原始状态
                redo.peek();
            }
            return s;
        }
    }
}
