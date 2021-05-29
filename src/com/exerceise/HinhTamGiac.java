package com.exerceise;

public class HinhTamGiac {
    public static void inHinhTamGiac(int chieuCao) {
        for (int i = 1; i <= chieuCao; i++) {
            for (int j = i; j < chieuCao; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void inHinhTamGiacSo(int chieuCao) {

        for (int i = 1; i <= chieuCao; i++) {
            int number = 1;
            for (int j = i; j < chieuCao; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (number < i && k < i) {
                    System.out.print(number++);
                }
                else{
                    System.out.print(number--);
                }
            }
            System.out.println();
        }

    }


}
