package state_pattern.example1;

/**
 * Screen：环境类，拥有多种状态，且在不同状态下对象的行为有所不同，因此将状态独立为一个类，维护一个抽象的状态类实例。
 * State：抽象状态类，定义一个接口来封装与环境类特定状态相关的行为，声明了各种不同状态对应的方法。
 * NormalState、LargerState、LargestState：具体状态类，抽象状态类的子类，每一个子类实现一个与环境类的一个状态相关的行为，不同状态类的行为不同。
 *
 * 不同的具体状态类可以提供完全不同的方法实现，在实际使用时，在一个状态类中可能包含多个业务方法，
 * 如果在具体状态类中某些业务方法的实现完全相同，可以将这些方法移至抽象状态类，实现代码的复用
 */
public class Client {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
