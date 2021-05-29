package com.exerceise;

public class SoThuanNghicSauChuSo {
    public static void inSoThuanNghich(int number) {
        int count = 0;
        int start = 100000;
        int end = 1000000;
        for (; start < end; start++) {
            if (checkSoThanNghic(start) == true) {
                System.out.println(start + " ");
                count++;

            }
            if (count == number) {
                break;
            }
        }
    }

    public static boolean checkSoThanNghic(int number) {
        int temp = 0;
        int so = number;
        while (so > 0) {
            temp = temp * 10 + so % 10;
            so /= 10;
        }
        if (temp == number) {
            return true;
        }
        return false;
    }
}
