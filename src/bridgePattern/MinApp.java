package bridgePattern;

public class MinApp extends JavaApplication{

    public void function() {
        System.out.println("输出最小值");
    }

    public void setPlatform(Platform platform) {
        platform.beRun();
    }
}
