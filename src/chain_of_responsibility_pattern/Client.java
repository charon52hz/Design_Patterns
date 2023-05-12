package chain_of_responsibility_pattern;

/**
 * 职责链模式可以将请求的处理者组织成一条链，并让请求沿着链传递，由链上的处理者对请求进行相应的处理，
 * 客户端无须关心请求的处理细节以及请求的传递，只需将请求发送到链上即可，实现请求发送者和请求处理者解耦。
 *
 * Leader:抽象处理者，它定义了一个处理请求的接口，由于不同的具体处理者处理请求的方式不同，因此在其中定义了抽象请求处理方法。
 * 因为每一个处理者的下家还是一个处理者，因此在抽象处理者中定义了一个抽象处理者类型的对象，作为其对下家的引用。通过该引用，处理者可以连成一条链。
 *
 * Director、Manager、GeneralManager：具体的处理者，，可以处理用户请求，在具体处理者类中实现了抽象处理者中定义的抽象请求处理方法，
 * 在处理请求之前需要进行判断，看是否有相应的处理权限，如果可以处理请求就处理它，否则将请求转发给后继者；在具体处理者中可以访问链中下一个对象，以便请求的转发。
 *
 * 职责链模式通过建立一条链来组织请求的处理者，请求将沿着链进行传递，请求发送者无须知道请求在何时、何处以及如何被处理，实现了请求发送者与处理者的解耦。
 *
 * 优点：降低了系统的耦合度。
 * 在系统中增加一个新的具体请求处理者时无须修改原有系统的代码，只需要在客户端重新建链即可，从这一点来看是符合“开闭原则”的。
 * 缺点：由于一个请求没有明确的接收者，那么就不能保证它一定会被处理，该请求可能一直到链的末端都得不到处理
 * 对于比较长的职责链，请求的处理可能涉及到多个处理对象，系统性能将受到一定影响
 */
public class Client {
    public static void main(String[] args) {
        Leader ZhangSan,LiSi,WangWu;
        ZhangSan = new Director("张三");
        LiSi = new Manager("李四");
        WangWu = new GeneralManager("王五");
        ZhangSan.setSuccessor(LiSi);
        LiSi.setSuccessor(WangWu);

        LeaveRequest leaveRequest1 = new LeaveRequest("小明同学", 5);
        LeaveRequest leaveRequest2 = new LeaveRequest("小红同学", 15);
        LeaveRequest leaveRequest3 = new LeaveRequest("小强同学", 50);
        ZhangSan.HandleRequest(leaveRequest1);
        ZhangSan.HandleRequest(leaveRequest2);
        ZhangSan.HandleRequest(leaveRequest3);
    }
}
