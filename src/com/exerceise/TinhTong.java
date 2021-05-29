package com.exerceise;

public class TinhTong {

    public void tinhTong(int number) {
//        int numberLe = 1;
//        int numberChan = 0;
//        int tongNumberChan = 0;
//        int tongNumberLe = 0;
//
//
//        if (number % 2 == 0) {
//
//            System.out.println("Tính tổng số chẵn");
//            for (int i = 0; i < number; i = i + 2) {
//                System.out.println(numberChan = numberChan + 2);
//                tongNumberChan += numberChan;
//
//            }
//            System.out.println("Tổng chẵn bằng: " +  tongNumberChan);
//
//        } else {
//            System.out.println("Tính tổng số lẻ");
//            System.out.println(1);
//            for (int i = 1; i < number; i = i + 2) {
//                System.out.println(numberLe = numberLe + 2);
//                tongNumberLe += numberLe;
//            }
//            System.out.println("Tổng Lẽ bằng: " +  (tongNumberLe + 1));
//
//
//        }

        int i;
        int sum = 0;
        if (number % 2 == 0) {
            i = 2;
            System.out.println("Tính tổng số chẵn");
        } else {
            i = 1;
            System.out.println("Tính tổng số lẻ");
        }
        for (; i <= number; i = i + 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Tổng = " +  sum);

    }
}
