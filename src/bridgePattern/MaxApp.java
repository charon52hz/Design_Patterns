package bridgePattern;

public class MaxApp extends JavaApplication{

    public void function() {
        System.out.println("输出最大值");
    }

    public void setPlatform(Platform platform) {
        platform.beRun();
    }
}
