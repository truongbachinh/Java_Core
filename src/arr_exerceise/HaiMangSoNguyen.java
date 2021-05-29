package arr_exerceise;

import java.util.Arrays;

public class HaiMangSoNguyen {
    public static void chenMang(int[] arr1, int[] arr2, int index) {

        int[] newArr1 = new int[arr1.length + arr2.length];
        int start = 0;
        int arr2Start = 0;
        int indexStart = index;
        for (int i = 0; i < arr1.length; i++) {
            newArr1[i] = arr1[i];
        }

        if (index >= arr1.length) {
            for (int i = arr1.length; i < newArr1.length; i++) {
                newArr1[i] = arr2[start];
                start++;
            }
        } else if (index <= 0) {
            for (int i = 0; i < arr1.length; i++) {
                newArr1[newArr1.length - 1 - i] = arr1[arr1.length - 1 - i];
                for (int j = 0; j < arr2.length; j++) {
                    newArr1[j] = arr2[j];
                }
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                newArr1[newArr1.length - 1 - i] = arr1[arr1.length - i - 1];

            }

            System.out.println("first ");
            for (int i = 0; i < newArr1.length; i++) {
                System.out.print(+newArr1[i] + " ");
            }
            System.exit(0);
            for (int j = 0; j < arr2.length; j++) {
                newArr1[index - j] = arr2[arr2.length - 1 - j];

            }
        }
        System.out.println("after ");
        for (int i = 0; i < newArr1.length; i++) {
            System.out.print(+newArr1[i] + " ");
        }

    }

    public static void chenMangEx(int[] arr1, int[] arr2, int index) {

        int m = arr1.length;
        if (index >= m) {
            for (int i = 0; i < arr2.length; i++) {
                arr1[i + m] = arr2[i];
            }
        } else if (index <= 0) {
            for (int i = arr1.length - 1; i >= arr2.length; i--) {
                arr1[i] = arr1[i - arr2.length];

            }
            for (int i = 0; i < arr2.length; i++) {
                arr1[i] = arr2[i];
            }
        } else {
            for (int i = arr1.length - 1; i >= arr2.length + index; i--) {
                arr1[i] = arr1[i - arr2.length];
            }

            for (int i = index; i < index + arr2.length; i++) {
                arr1[i] = arr2[i - index];
            }

        }
        displayArray(arr1, arr2);

    }

    public static void displayArray(int[] arr1, int[] arr2) {
        System.out.println("mảng 2: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Mảng sau khi chèn: ");
        for (int j : arr1) {
            System.out.print(j + " ");
        }

    }
}
