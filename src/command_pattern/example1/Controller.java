package command_pattern.example1;

public class Controller {
    private AbstractCommand openTVCommand,closeTVCommand,changeChannelCommand;
    public Controller(AbstractCommand openTVCommand, AbstractCommand closeTVCommand, AbstractCommand changeChannelCommand) {
        this.openTVCommand = openTVCommand;
        this.closeTVCommand = closeTVCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    public void open(){
        openTVCommand.execute();
    }
    public void close(){
        closeTVCommand.execute();
    }
    public void change(){
        changeChannelCommand.execute();
    }
}
