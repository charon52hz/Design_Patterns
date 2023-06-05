package observer_pattern;

public class Dice extends _Subject {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void sendMessage() {
        System.out.println("掷出的骰子大小为："+num);
        for (_Observer person:observers){
            person.update(num);
        }
    }

    @Override
    public void buy(_Observer observer) {
        observers.add(observer);
    }
}
