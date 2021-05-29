package arr_exerceise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class DeclareArray {
    public static int[] arr1 = new int[5];
    static Scanner sc = new Scanner(System.in);
    static int[] arr2 = {1, 2, 3, 4, 5, 6};

    static boolean[] bools = new boolean[2];


    public static void main(String[] args) {

        int e;
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("input row");
        row = sc.nextInt();
        System.out.println("input element in row");
        e = sc.nextInt();
        String[][] arr = new String[row][e];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < e; j++) {
                arr[i][j] = sc.next();
            }
        }
        System.out.println(Arrays.deepToString(arr) + "\n");
        String temp;
        char check;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < e; j++) {
                temp = (arr[i][j]);
                for(int  k = 0; k < temp.length(); k++)
                {
                    check = temp.charAt(k);
                    if(check == check)
                    {
                        count++;
                    }
                }

            }
        }
        System.out.println("các giá trị trùng nhau là = " + count);
//        System.out.println(Arrays.deepToString(arr));
//        String temp;
//        int count = 0;
//        for (String[] array : arr) {
//            System.out.println(Arrays.toString(array) + " ");
//
//            for (int i = 1; i < array.length; i++) {
//
//            }
//        }


//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("input arr");
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//        for ( int[] print: arr
//             ) {
//            System.out.println(Arrays.toString(print));
//        }
        //
//        System.out.println(bools[1]);
//        System.out.println(arr2[0]);
//        for(int i =0; i < arr1.length; i++)
//        {
//            arr1[i] = i++;
//        }
//        System.out.println(Arrays.toString(arr2));
//        for (int x : arr2
//             ) {
//            System.out.print(x);
//
//        }
    }


}
