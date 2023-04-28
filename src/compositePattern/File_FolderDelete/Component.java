package compositePattern.File_FolderDelete;

public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void delete();
}
