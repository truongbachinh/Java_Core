package ThucHanhStreamAPI.Steam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class averageStream_Using_MapToIn {
    public static void main(String[] args) {
        List<Staff> st = new ArrayList<>();
        st.add(new Staff(1, "Chinh1", 200.000));
        st.add(new Staff(2, "Chinh2", 150.000));
        st.add(new Staff(3, "Chinh3", 100.000));
        st.add(new Staff(4, "Chinh3", 50.000));
        st.add(new Staff(5, "Chinh3", 100.200));


        double staffStream = st.stream().mapToDouble(s->s.getSalary()).sum();
        System.out.println("Average salary:" +staffStream);

    }
}
