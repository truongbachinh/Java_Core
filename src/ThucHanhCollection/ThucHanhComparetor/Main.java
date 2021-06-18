package ThucHanhCollection.ThucHanhComparetor;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(4,"chinh",20));
//        studentList.add(new Student(2,"chinh",22));
//        studentList.add(new Student(1,"chinh",19));
//        Collections.sort(studentList, new comparatorByAge());
        Queue<Student> students = new PriorityQueue<>();
        students.add(new Student(5, "chinh", 11));
        students.add(new Student(2, "chinh", 22));
        students.add(new Student(1, "chinh", 12));
        students.add(new Student(3, "chinh", 19));

        System.out.println(students);
// System.out.println(students.peek());
  //   Collections.sort(students);
//        for (Student st: students
//             ) {
//            System.out.println(st);
//        }
    }
}
