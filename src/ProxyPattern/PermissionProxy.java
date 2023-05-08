package ProxyPattern;

public class PermissionProxy implements AbstractPermission{
    private RealPermission realPermission = new RealPermission();
    private int level = 0;

    public void setLevel(int level){
        this.level = level;
    }
    @Override
    public void userFunction() {
        if (level==0){
            System.out.println("对不起，您没有该权限，请先登录！");
        }else if (level==1){
            realPermission.userFunction();
        }
    }
}
