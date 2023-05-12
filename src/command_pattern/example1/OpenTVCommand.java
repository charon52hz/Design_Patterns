package command_pattern.example1;

public class OpenTVCommand extends AbstractCommand{
    private Television tv;

    public OpenTVCommand(){
        tv = new Television();
    }
    @Override
    public void execute() {
        tv.open();
    }
}
