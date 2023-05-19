package iterator_pattern.example1;

import java.util.List;

public abstract class AbstractObjectList {
    protected List<Object> objects;

    public AbstractObjectList(List objects){
        this.objects = objects;
    }
    public void addObject(Object obj){
        this.objects.add(obj);
    }
    public void removeObject(Object obj){
        this.objects.remove(obj);
    }
    public List getObjects(){
        return this.objects;
    }
    public abstract AbstractIterator createIterator();
}
