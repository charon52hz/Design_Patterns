package command_pattern.commandCollection;

import java.util.Stack;

public class AddCommand extends AbstractCommand{
    private Adder adder;
    private Stack<Integer> undoStack = new Stack<>();
    private Stack<Integer> redoStack = new Stack<>();

    public AddCommand(){
        adder = new Adder();
    }
    public int undo() {
        int i = 0;
        if (undoStack.isEmpty()) {
            i = -1;
        }else{
            Integer pop = undoStack.pop();
            redoStack.push(pop);
            if(!undoStack.isEmpty()){//判断弹出数据后是否为空，如果为空，说明已撤回到最原始状态
                i=undoStack.peek();
            }
        }
        return i;
    }

    public int redo() {
        int i = 0;
        if (redoStack.isEmpty()) {
            i = -1;
        }else{//撤回时只要可以可以撤回，则返回栈一定有数据
            Integer pop = redoStack.pop();
            undoStack.push(pop);
            i = pop;
        }
        return i;
    }

    public int execute(int value) {
        int v = 0;
        if (undoStack.isEmpty()) {// 说明还没有数据
            v = adder.add(value);
            undoStack.push(v);
        } else {// 需要更新两个栈中的内容，并计算结果,其中返回栈应该更新，重复栈应该清空
            v = adder.add(value);
            undoStack.push(v);
            if (!redoStack.isEmpty()) {
                for (int i = 0; i < redoStack.size(); i++) {
                    redoStack.pop();
                }
            }
        }
        return v;
    }
}
