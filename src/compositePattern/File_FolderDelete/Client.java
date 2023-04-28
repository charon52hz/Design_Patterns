package compositePattern.File_FolderDelete;

import java.io.File;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
//        Component file1 = new File("file1.txt");
//        Component file2 = new File("file2.txt");
//
//        Component folder = new Folder("folder");
//        folder.add(file1);
//        folder.add(file2);
//        folder.delete();

        java.io.File folder = new File("D:\\Projects\\java\\JavaBase\\folder");
        folder.mkdirs();
        java.io.File file1 = new File("D:\\Projects\\java\\JavaBase\\folder\\file1.txt");
        java.io.File file2 = new File("D:\\Projects\\java\\JavaBase\\folder\\file2.txt");
        file1.createNewFile();
        file2.createNewFile();






    }
}
