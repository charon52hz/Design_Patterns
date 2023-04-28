package compositePattern;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Component：抽象构件类，为文件、文件夹类声明接口，以及公有方法delete()
 * LeafFile：文件类，属于叶子节点，实现了抽象构件类的删除方法
 * CompositeFolder：文件夹类，属于容器节点，包含文件夹或文件，实现了delete方法，递归调用叶子节点的delete方法
 */
public class FolderCompositeExample {
    public static void main(String[] args) throws IOException {
        File rootFolder = new File("D:\\Projects\\java\\JavaBase\\rootFolder");
        if (!rootFolder.exists()) {
            rootFolder.mkdir();
        }
        CompositeFolder root = new CompositeFolder(rootFolder);
        CompositeFolder child1 = new CompositeFolder(new File(rootFolder, "child1"));
        CompositeFolder child2 = new CompositeFolder(new File(rootFolder, "child2"));
        root.add(child1);
        root.add(child2);
        LeafFile file1 = new LeafFile(new File(child1.folder, "file1.txt"));
        LeafFile file2 = new LeafFile(new File(child1.folder, "file2.txt"));
        LeafFile file3 = new LeafFile(new File(child2.folder, "file3.txt"));

        child1.add(file1);
        child1.add(file2);
        child2.add(file3);
        root.delete();
    }
}
interface Component {
    void delete();
}
class LeafFile implements Component {
    File file;

    public LeafFile(File file) throws IOException {
        this.file = file;
        if (!file.exists()) {
            file.createNewFile();
        }
    }
    @Override
    public void delete() {
        if (file.delete()) {
            System.out.println("file deleted " + file.getName());
        }
    }

}
class CompositeFolder implements Component {
    File folder;
    List<Component> components = new ArrayList<>();
    public CompositeFolder(File folder) {
        this.folder = folder;
        if (!folder.exists()) {
            folder.mkdir();
        }
    }
    public void add(Component component) {
        components.add(component);
    }
    public void remove(Component component) {
        components.remove(component);
    }
    @Override
    public void delete() {
        for (Component component : components) {
            component.delete();
        }
        if (folder.delete()) {
            System.out.println("folder deleted " + folder.getName());
        }
    }
}