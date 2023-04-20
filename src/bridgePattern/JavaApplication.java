package bridgePattern;

public abstract class JavaApplication {
    protected Platform platform;

    public void setPlatform(Platform platform){
        this.platform=platform;
    };

    public abstract void function();
}
