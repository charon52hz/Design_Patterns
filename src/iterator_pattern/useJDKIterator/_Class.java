package iterator_pattern.useJDKIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class _Class {
    private ArrayList<Student> students;

    public _Class() {
        students = new ArrayList<Student>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void printStudentByAge(){
        Collections.sort(students,Collections.reverseOrder());
        System.out.println("按学生年龄从大到小排序");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
