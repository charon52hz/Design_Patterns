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
        cat.work();
        
    }

    @Override
    public void work() {
        dog.cry();
        
    }
    
    
}
