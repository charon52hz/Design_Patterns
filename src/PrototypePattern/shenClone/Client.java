package PrototypePattern.shenClone;

import java.io.IOException;

/*
模式分析：
Serializable类：声明一个接口，实现这个接口的类能实现序列化。
Customer类：实现一个克隆自己的操作。
Address类：非基本数据类型，作为Customer类的一个属性。
Client类：让一个原型对象克隆自己，从而创建一个属性一样的新的对象。

对于数据类型是基本数据类型的成员变量，浅克隆会直接进行值传递，也就是将该属性值复制一份给新的对象。
对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅克隆会进行
引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成
员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。

对于类中的属性是引用数据类型的成员变量的情况，如果通过浅克隆只是把该引用变量的地址给了新对象，源
对象和新克隆的对象的该成员变量指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另
一个对象的该成员变量值。要想克隆的新对象的引用数据类型的成员变量也是一个新对象，需要使用深克隆。
深克隆可以通过 1.重写clone()函数 2.通过对象序列化的方式实现。推荐使用第二种方式。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Address address = new Address("China","WuHan");
        Customer customer = new Customer("张三",address);

        Customer customer_clone = (Customer) customer.deepClone();

        System.out.println(customer.toString() + "  customer " +customer.hashCode()+"address "+customer.getAddress().hashCode());
        System.out.println(customer_clone.toString() + "  customer_clone " +customer_clone.hashCode()+"address_clone "+customer_clone.getAddress().hashCode());
    }
}
