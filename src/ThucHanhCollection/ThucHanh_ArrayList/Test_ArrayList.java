package ThucHanhCollection.ThucHanh_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test_ArrayList {
    public static void main(String[] args) {
      /*  ArrayList<Integer> m = new ArrayList<>();

        ArrayList<Integer> m1 = new ArrayList<>(2);
        m1.add(1);
        m1.add(2);
        m1.add(3);
        m1.add(3);
        System.out.println(m1);
        System.out.println("Nhập: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            m.add(sc.nextInt());
        }

        System.out.println("Nhập số cần tìm: ");
        int x = sc.nextInt();
        System.out.println(m.contains(x));

        Collections.sort(m);
        System.out.println("Array sort: " + m);
        try {

            Collections.copy(m1, m);
            System.out.println("Array copy: " + m1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayList<String> newM = (ArrayList<String>) m.clone();
        System.out.println("Cloned array list: " + newM);*/
        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("Chinh", 20));
        st.add(new Student("Anh", 22));
        st.add(new Student("Linh", 19));
        Collections.sort(st);

        System.out.println(st);

    }
}

