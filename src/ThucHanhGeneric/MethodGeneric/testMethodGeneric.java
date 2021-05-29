package ThucHanhGeneric.MethodGeneric;

import java.util.ArrayList;

public class testMethodGeneric {
    public static void main(String[] args) {
        ArrayList<String> st = new ArrayList<>();
        st.add("A");
        st.add("A");
        st.add("A");
        st.add("A");
        Integer[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] string = {"A", "B", "C", "D"};


        MethodGeneric M = new MethodGeneric();

        M.showArr(Arr);
        M.showArr(string);
    }
}
