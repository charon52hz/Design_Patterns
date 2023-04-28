package compositePattern.File_FolderDelete;

public class File extends Component {
    @Override
    public void add(Component c) {
        System.out.println("文件无此功能");
    }

    public File(String name) {
        super(name);
    }
    public void delete() {
        System.out.println("删除文件：" + name);
    }
}
