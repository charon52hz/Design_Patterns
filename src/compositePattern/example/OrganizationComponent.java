package compositePattern.example;

public abstract class OrganizationComponent {

    private String name;
    public OrganizationComponent(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void add(OrganizationComponent c);
    public abstract void remove(OrganizationComponent c);
    public abstract void print();
    public abstract OrganizationComponent getChild(int i);
}
