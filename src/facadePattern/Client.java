package facadePattern;

/**
 * 外观模式要求一个子系统的外部与其内部的通信通过一个统一的外观对象进行，
 * 使得客户端只需要与外观对象打交道，不需要与子系统内部的很多对象打交道。
 *
 * HomeFacade：外观角色，在此角色中可以知道相关子系统的功能和职责，
 * 在客户端中调用它的方法，将客户端发来的请求委派到相应的子系统进行处理。
 * Light、Projector、Screen：子系统角色，实现子系统的功能，被外观角色调用。
 * 子系统不知道外观的存在，对它来说，外观角色仅是另一个客户端而已。
 *
 * 外观模式的目的是降低系统的复杂程度。引入外观模式，降低了客户端和子系统的耦合，减少客户端处理对象的数量。
 * 缺点：增加新的子系统可能需要修改外观类，违背开闭原则。
 */
public class Client {
    public static void main(String[] args) {
        HomeFacade facade = new HomeFacade();
        facade.work();
        System.out.println("*************结束工作***********");
        facade.sleep();
    }
}
