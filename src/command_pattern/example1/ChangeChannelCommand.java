package command_pattern.example1;

public class ChangeChannelCommand extends AbstractCommand{
    private Television tv;
    public ChangeChannelCommand(){
        tv = new Television();
    }
    @Override
    public void execute() {
        tv.changeChannel();
    }
}
