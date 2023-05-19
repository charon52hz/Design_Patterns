package iterator_pattern.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstractIterator:抽象迭代器类：定义了访问和遍历元素的接口，声明了用于遍历数据元素的方法
 * ProductIterator：具体迭代器类，实现了抽象迭代器接口，完成对聚合对象的遍历，同时在具体迭代器中通过游标来记录在聚合对象中所处的当前位置
 * AbstractObjectList：抽象聚合类，用于存储和管理元素对象，声明一个个createIterator()方法用于创建一个迭代器对象，充当抽象迭代器工厂角色。
 * ProductList：具体聚合类，实现了在抽象聚合类中声明的createIterator()方法，该方法返回一个与该具体聚合类对应的具体迭代器ConcreteIterator实例
 *
 * 如果一个聚合类既负责管理数据（addObject()、removeObject()），又负责遍历数据（next()、previous()），违反了“单一职责原则”
 * 迭代器模式的意图：将聚合类中负责遍历数据的方法提取出来，封装到专门的类中，实现数据存储和数据遍历分离，无须暴露聚合类的内部属性即可对其进行操作，
 */
public class Client {
    public static void main(String[] args) {
        AbstractObjectList list;
        AbstractIterator iterator;
        List productList = new ArrayList();
        productList.add("香烟");
        productList.add("瓜子");
        productList.add("八宝粥");
        list = new ProductList(productList);
        iterator = list.createIterator();
        System.out.print("正向遍历--");
        while (!iterator.isLast()){
            System.out.print(iterator.getNextItem()+"  ");
            iterator.next();
        }
        System.out.print("\n逆向遍历--");
        while (!iterator.isFirst()){
            System.out.print(iterator.getPreviousItem()+"  ");
            iterator.previous();
        }

    }
}
