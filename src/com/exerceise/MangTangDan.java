package com.exerceise;

public class MangTangDan {
    public static void inMangTangDan(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length ; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
        System.out.printf("Mảng sắp xếp tăng dần: ");
        for (int x : arr) {
            System.out.printf(x + " ");
        }
    }
}
