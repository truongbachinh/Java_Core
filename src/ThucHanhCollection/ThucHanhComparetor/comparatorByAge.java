package ThucHanhCollection.ThucHanhComparetor;

import java.util.Comparator;

public class comparatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() -o2.getAge();
    }
}
