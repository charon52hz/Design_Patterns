package compositePattern.File_FolderDelete;

import java.util.ArrayList;

public class Folder extends Component{
    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    public Folder(String name){
        super(name);
    }
    @Override
    public void delete() {
        for (Component c : children){
            c.delete();
        }
        System.out.println("删除目录"+name);
    }
}
