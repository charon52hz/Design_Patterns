package facadePattern.example;

/**
 * Mainframe：外观角色，在此角色中可以知道相关子系统的功能和职责，
 * 在客户端中调用它的方法，将客户端发来的请求委派到相应的子系统进行处理。
 * Memory、CPU、HardDisk、OS：子系统角色，实现子系统的功能，被外观角色调用。
 * 子系统不知道外观的存在，对它来说，外观角色仅是另一个客户端而已。
 */
public class Client {
    public static void main(String[] args) {
        Mainframe mainframe = new Mainframe();
        mainframe.on();
    }
}
