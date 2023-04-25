package bidirectionalAdapter;

public class BiAdapter implements Dog,Cat{

    private Dog dog;
    private Cat cat;

    public BiAdapter(Dog dog){
        this.dog = dog;
    }

    public BiAdapter(Cat cat){
        this.cat = cat;
    }

    @Override
    public void cry() {
        System.out.print("狗");
        cat.work();
    }

    @Override
    public void work() {
        System.out.print("猫");
        dog.cry();
    }
}
