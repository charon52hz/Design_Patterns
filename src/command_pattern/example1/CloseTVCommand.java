package command_pattern.example1;

public class CloseTVCommand extends AbstractCommand{
    private Television tv;
    public CloseTVCommand(){
        tv = new Television();
    }
    @Override
    public void execute() {
        tv.close();
    }
}
