package iterator_pattern.useJDKIterator;

public class Client {
    public static void main(String[] args) {
        _Class aClass = new _Class();
        aClass.addStudent(new Student("张三",18));
        aClass.addStudent(new Student("小明",17));
        aClass.addStudent(new Student("小红",20));
        aClass.addStudent(new Student("小强",19));
        aClass.printStudentByAge();
    }
}
