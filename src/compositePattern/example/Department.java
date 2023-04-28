package compositePattern.example;

public class Department extends OrganizationComponent{

    public Department(String name){
        super(name);
    }

    public String getName(){
        return super.getName();
    }

    @Override
    public void add(OrganizationComponent c) {
        System.out.println("Department没有add方法");
    }

    @Override
    public void remove(OrganizationComponent c) {
        System.out.println("Department没有remove方法");
    }

    @Override
    public void print() {
        System.out.println("系："+getName());
    }

    @Override
    public OrganizationComponent getChild(int i) {
        System.out.println("Department没有getChild方法");
        return null;
    }
}
