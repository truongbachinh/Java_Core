package arr_exerceise;

import java.util.ArrayList;
import java.util.Arrays;

public class ChenMangXToA {
    public static void main(String[] args) {
        int[] a = new int[6];
        int[] x = new int[4];

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 10;
        a[4] = 13;
        a[5] = 17;


        x[0] = 5;
        x[1] = 6;
        x[2] = 12;
        x[3] = 18;
        chenMang(x, a);

    }

    public static void chenMang(int[] x, int[] a) {


        int[] arrNew = new int[10];
        int i = 0;
        int j = 0;
        int count = 0;
        while (!(i == a.length && j == x.length)) {
            if ((i < a.length && j < x.length && a[i] < x[j]) || j >= x.length) {
                arrNew[count++] = a[i++];
            } else if ((i < a.length && j < x.length && a[i] >= x[j] ) || i >= a.length) {
                arrNew[count++] = x[j++];
            }
        }
        System.out.println(Arrays.toString(arrNew));


//    if(a[0] < x[0])
//       {
//
//       }
//       else {
//
//       }
//
//        int start = (a.length - x.length);
//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < x.length; j++) {
//                    a[start] = x[j];
//                    start++;
//                }
//                break;
//            }
//            int temp = a[0];
//
//
//            for (int i = 0; i < a.length; i++) {
//                for (int j = i + 1; j < a.length; j++) {
//                    if (a[i] > a[j]) {
//                        temp = a[j];
//                        a[j] = a[i];
//                        a[i] =  temp;
//                    }
//                }
//
//            }

    }
    public static void displayArray(int[] x, int[] a) {
        System.out.println("mảng X: ");
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Mảng A sau khi chèn: ");
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}

