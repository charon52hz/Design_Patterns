package memento_pattern.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.setMemento(originator.createMemento());
        originator.setState("State #3");
        System.out.println("current State:"+originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("pre State:"+originator.getState());
    }
}
