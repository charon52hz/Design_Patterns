package observer_pattern;

/**
 * _Subject：抽象目标类，被观察的对象。定义了一个观察者集合，可以接受任意数量的观察者来观察，同时定义了通知方法。
 * _Observer:抽象观察者类，对观察目标的改变做出响应，声明了更新数据的方法。
 * Dice：具体目标类，包含经常发生变化的数据，当发生变化时，向各个观察者发送通知、
 * PersonBuyBig、PersonBuySmall：具体观察者类，实现了抽象观察者类声明的方法，对目标类的改变做出实际响应。
 *
 * 观察者模式包含观察目标和观察者两类对象，一个目标可以有任意数目的与之相依赖的观察者，一旦观察目标的状态发生改变，所有的观察者都将得到通知。
 * 作为对这个通知的响应，每个观察者都将监视观察目标的状态以使其状态与目标状态同步，这种交互也称为发布-订阅。
 * 观察目标是通知的发布者，它发出通知时并不需要知道谁是它的观察者，可以有任意数目的观察者订阅它并接收通知。
 */
public class Client {
    public static void main(String[] args) {
        _Observer bperson = new PersonBuyBig();
        _Observer sperson = new PersonBuySmall();

        Dice dice = new Dice();
        dice.buy(bperson);
        dice.buy(sperson);
        dice.setNum((int) (Math.floor(Math.random() * 6) + 1));
        dice.sendMessage();
    }
}
