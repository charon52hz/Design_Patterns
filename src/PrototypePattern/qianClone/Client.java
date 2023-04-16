package PrototypePattern.qianClone;
/*
模式分析：
Object类：声明一个克隆自己的接口
Cloneable接口：实现这个接口，类支持克隆方法。
Customer类：实现一个克隆自己的操作。
Address类：非基本数据类型，作为Customer类的一个属性。
Client类：让一个原型对象克隆自己，从而创建一个属性一样的新的对象。

对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行
引用传递，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成
员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("China","WuHan");
        Customer customer = new Customer("张三",address);

        Customer customer_clone = (Customer) customer.clone();

        System.out.println(customer.toString() + "customer " +customer.hashCode()+"address "+customer.getAddress().hashCode());
        System.out.println(customer_clone.toString() + "customer_clone " +customer_clone.hashCode()+"address_clone "+customer_clone.getAddress().hashCode());
    }
}
