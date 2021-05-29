package com.exerceise;

public class SoNguyenTo {
    public static void inSoNguyenTo(int number) {
        int start = 2;


        System.out.println("Các số nguyên tố là:");
        while (  number !=0) {
            if (checkSoNguyenTo(start) == true) {
                System.out.printf(start + " ");

            }
            start++;
        }



    }

    private static boolean checkSoNguyenTo(int numbercheck) {
        for (int i = 2; i < numbercheck; i++) {
            if (numbercheck % i == 0) {
                return false;
            }
        }
        return true;
    }
}
