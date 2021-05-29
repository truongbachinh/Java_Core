package arr_exerceise;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MangNgauNhien {
    public static void inMangNgauNhien(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        Random rd = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
        }

        for (int i : arr
        ) {
            System.out.println(i);
        }

        checkPhanTuTrungNhau(arr);


    }

    private static void sapXepMangNgauNhien(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
        System.out.println("Mảng sau khi được xắp sếp tăng dần là: " + Arrays.toString(arr));

    }

    private static void checkPhanTuTrungNhau(int[] arr) {
        sapXepMangNgauNhien(arr);
        int temp;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp == arr[j]) {
                    newArr[i] = 1;
                    temp = arr[j];
                }
            }


        }

        int unqueCount = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 1) {
                unqueCount++;
            }
        }

        System.out.println("SỐ phần tử trùng nhau " + unqueCount);
        int[] uniqueArray = new int[newArr.length - unqueCount];
        int countStart = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 0) {
                uniqueArray[countStart] =arr[i];
                countStart++;
            }

        }

        System.out.println("Mảng sau khi đã loại bỏ các kí tự trùng nhau");
        System.out.println(Arrays.toString(uniqueArray));


    }
}
