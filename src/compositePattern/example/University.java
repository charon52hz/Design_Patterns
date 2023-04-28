package compositePattern.example;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{
    private List<OrganizationComponent> list = new ArrayList<OrganizationComponent>();

    @Override
    public String getName() {
        return super.getName();
    }

    public University(String name) {
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
        System.out.println("学校："+getName());
        for (OrganizationComponent c:list){
            c.print();
        }
    }

    @Override
    public OrganizationComponent getChild(int i) {
        return list.get(i);
    }
}
