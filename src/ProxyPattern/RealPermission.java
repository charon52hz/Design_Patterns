package ProxyPattern;

public class RealPermission implements AbstractPermission{
    @Override
    public void userFunction() {
        System.out.println("用户操作（修改信息，发帖，回帖等...）");
    }
}
