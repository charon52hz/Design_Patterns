package compositePattern.example;

/**
 * OrganizationComponent：抽象构件类，为学校、院、系声明接口，包含子类共有的声明和实现
 * University：在组合结构中表示容器节点，包含子节点（叶子节点或者容器节点，在此实例中为容器节点和子容器节点）
 * 提供了一个集合，用于存储容器或叶子节点对象，实现了抽象构件类的方法，在业务方法print中，递归调用子节点的业务方法
 * College：同University，不同的是其子节点包含自身（容器）节点和叶子节点
 * Department：叶子节点，没有子节点，实现了抽象构件类的方法，对于那些访问子节点的方法，抛出异常或其他方法处理
 *
 * 组合模式的关键是定义了一个抽象构件类，既可以代表叶子又可以代表容器。客户端针对该类进行编程，无需知道它代表的是谁
 * 进行统一处理。
 * 如果不使用组合模式，客户端代码将过多地依赖于容器对象复杂的内部实现结构，容器对象内部实现结构的变化将
 * 引起客户代码的频繁变化，带来了代码维护复杂、可扩展性差等弊端。
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("CCNU");

        OrganizationComponent college1 = new College("计算机学院");
        OrganizationComponent college2 = new College("人工智能教育学部");

        OrganizationComponent department1 = new Department("软件工程");
        OrganizationComponent department2 = new Department("计算机科学与技术");
        OrganizationComponent department3 = new Department("人工智能");

        college1.add(department1);
        college1.add(department2);
        college2.add(department3);

        university.add(college1);
        university.add(college2);

        university.print();
    }
}
