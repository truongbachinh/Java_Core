package com.exerceise;

public class TongchuoiSo {
    public static void tinhTongChuoiSo(int number) {
        int numberTach;
        int tong = 0;
        while (number!=0)
        {
            numberTach = number % 10;
            System.out.println("số đã tách = " + numberTach);
            tong += numberTach;
            number = number / 10;
            System.out.println("số Number sau khi tách = " + number);
        }
        System.out.println("Tong cac số = " + tong);

    }
}
