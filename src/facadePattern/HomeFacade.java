package facadePattern;

public class HomeFacade {
    private Light light;
    private Screen screen;
    private Projector projector;

    public HomeFacade(){
        light = new Light();
        screen = new Screen();
        projector = new Projector();
    }

    public void work(){
        light.on();
        screen.down();
        projector.on();
    }

    public void sleep(){
        projector.off();
        screen.up();
        light.off();
    }

}
