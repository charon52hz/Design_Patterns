package command_pattern.commandCollection;

public class Calculator {
    private AbstractCommand command;
    public void setCommand(AbstractCommand command) {
        this.command =command;
    }
    public int compute(int value) {
        return command.execute(value);
    }

    public void undo() {
        int i = command.undo();
        if(i==-1){
            System.out.println("缓存中已不存在数据");
        }else{
            System.out.println("撤销成功，运算结果是："+i);
        }
    }
    public void redo() {
        int i = command.redo();
        if(i==-1){
            System.out.println("已恢复至最新数据");
        }
        else{
            System.out.println("恢复撤销成功，运算结果是："+i);
        }
    }
}

