package ProxyPattern;

/**
 * 在一些情况下，客户端不能直接引用一个对象，此时可以通过一个称为“代理”的第三者来实现间接引用。
 * 代理对象起到中介的作用，并可以通过代理对象去掉客户不能看到的内容或添加客户需要的额外服务。
 *
 * AbstractPermission：抽象主题角色，声明真实主题和代理主题的接口，这样使得任何使用真实主题的地方都可以使用代理主题
 * RealPermission：真实主题角色，实现了真实的业务操作
 * PermissionProxy：代理角色，包含了对真实主题的引用，从而可以在任何时候操作真实主题对象。；在代理主题角色中提供一个
 * 与真实主题角色相同的接口，以便在任何时候都可以替代真实主题。
 * 通常，在代理主题角色中，客户端在调用所引用的真实主题操作之前或之后还需要执行其他操作，而不仅仅是单纯调用真实主题对象中的操作。
 */
public class Client {
    public static void main(String[] args) {
        PermissionProxy proxy = new PermissionProxy();
        proxy.userFunction();   //游客
        System.out.println("*********登录***********");
        proxy.setLevel(1);      //登录后
        proxy.userFunction();

    }
}
