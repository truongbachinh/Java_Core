package com.exerceise;

import java.util.ArrayList;
import java.util.List;

public class SoThuanNghic {
    public static void inSoThuanNghic(int number) {
        int count = 0;
        int start = 100000;
        int end = 1000000;
        while (number > count) {
            for (; start < end; start++) {
                if (checkSoThuanNghic(start) == true) {
                    System.out.println(start + " ");
                    count++;
                }
                if(number <= count)
                {
                break;
                }
            }

        }
    }

    private static boolean checkSoThuanNghic(int number ) {
        int tmp = 0;
        int so = number;
        while (so > 0) {
            tmp = tmp * 10 + so % 10;
            so = so / 10;
        }

        if (tmp == number) {
            return true;
        }

        return false;

//        List<Integer> listNumbers = new ArrayList<>();
//        // phân tích số n thành các chữ số và lưu vào listNumbers
//        do {
//            listNumbers.add(number % 10);
//            number = number / 10;
//        } while (number > 0);
//        // kiểm tra tính thuận nghịch
//        int size = listNumbers.size();
//        for (int i = 0; i < (size / 2); i++) {
//            System.out.println("list" +listNumbers.get(i));
//            System.out.println("đối" + listNumbers.get(size - i - 1));
//            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
//                return false;
//            }
//        }
//        return true;
    }
}
