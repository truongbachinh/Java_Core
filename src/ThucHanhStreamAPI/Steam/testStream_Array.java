package ThucHanhStreamAPI.Steam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testStream_Array {
    public static void main(String[] args) {
      /*  int[] arr = {1, 8, 2, 3, 98, 11, 35, 91};
        IntStream intStream = Arrays.stream(arr);*/
        List<Student> st = new ArrayList<>();
        st.add(new Student(1, "Chinh1", "Thanh Hóa"));
        st.add(new Student(2, "Chinh2", "Thanh Hóa"));
        st.add(new Student(3, "Chinh3", "Thanh Hóa"));
        st.add(new Student(4, "Chinh3", "Nghệ An"));
        st.add(new Student(5, "Chinh3", "Hà Nội"));

        Stream<Student> stream = st.stream();

        // cách thông thường
        List<Student> stTH = new ArrayList<>();
        for (Student std : st
        ) {
            if (std.getAddress() == "Thanh Hóa") {
                stTH.add(std);
            }
        }

        for (Student pstTH : stTH
        ) {
            System.out.println(pstTH);
        }

        // cách dùng stream api sử dụng filter để lọc
        List<Student> stStreamAPI = st.stream().filter(s -> s.getAddress() == "Nghệ An").collect(Collectors.toList());
        for (Student pstNA : stStreamAPI
        ) {
            System.out.println(pstNA);
        }
        //

    }


//    private static String getAd(Student s)
//    {
//       return s.getAddress();
//    }
}
