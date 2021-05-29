package ThucHanhCollection.ThucHanhSet;

import java.util.Collections;
import java.util.HashSet;

public class Test_Set {
    public static void main(String[] args) {
        HashSet<Student> st = new HashSet<>();

        st.add(new Student("Chinh", 22));
        st.add(new Student("Linh", 20));
        st.add(new Student("Chung", 21));

        System.out.println("check 1: " + st.contains(new Student("Chinh", 22)));


        System.out.println("check 2: " + st.contains(new Student("Chinh", 222)));


        HashSet<String> newM = (HashSet<String>) st.clone();
        System.out.println("Cloned HashSet: " + newM);

    }
}
