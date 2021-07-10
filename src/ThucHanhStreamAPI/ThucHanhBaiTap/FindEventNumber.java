package ThucHanhStreamAPI.ThucHanhBaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEventNumber {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        integers.add(5);


     List<Integer> s =  integers.stream().filter(num -> (num%2 == 0)).skip(1).distinct().collect(Collectors.toList());
        System.out.println(s);
        System.out.println(integers);
    }
}
