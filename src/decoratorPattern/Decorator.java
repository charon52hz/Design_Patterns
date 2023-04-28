package decoratorPattern;

public class Decorator implements Transform{
    private Transform transform;
    public Decorator(Transform transform){
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
