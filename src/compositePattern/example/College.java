package compositePattern.example;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    private List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();

    public String getName(){
        return super.getName();
    }

    public College(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent c) {
        list.add(c);
    }

    @Override
    public void remove(OrganizationComponent c) {
        list.remove(c);
    }

    @Override
    public void print() {
        System.out.println("院："+getName());
        for (OrganizationComponent c : list){
            c.print();
        }
    }

    @Override
    public OrganizationComponent getChild(int i) {
        return list.get(i);
    }
}
