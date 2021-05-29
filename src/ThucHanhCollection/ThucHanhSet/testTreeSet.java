package ThucHanhCollection.ThucHanhSet;

import java.util.Set;
import java.util.TreeSet;

public class testTreeSet {
    public static void main(String[] args) {
        Set<Student> st = new TreeSet<>();
        st.add(new Student("Chinh", 22));
        st.add(new Student("Linh", 20));
        st.add(new Student("Chung", 21));
        System.out.println(st.contains(new Student("Chinh", 22) ));
    }
}
