package bidirectionalAdapter;

public class Client {
    public static void main(String[] args) {

        Dog dog = new ConcreteDog();
        Cat cat = new ConcreteCat();

        BiAdapter Adpater1 = new BiAdapter(cat);
        BiAdapter Adpater2 = new BiAdapter(dog);

        Adpater1.cry();
        Adpater2.work();

    }
}
