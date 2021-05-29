package arr_exerceise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 2, 3, 4, 5};

        // selected sort
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    temp = arr[i];
//                }
//            }
//
//        }
        // sắp xếp nổi bọt
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    arr[i] = arr[j];
//                }
//            }
//
//        }

        //Phân biệt kiểu Primitive vs Reference

      /*  int[] list1 = {1,-1,2,-3};
        int[] list2 = new int[list1.length];
        list2 = list1;
        list1[0] = 100;
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));*/

        // kiểm tra số nguyên tố

//        int a = 6;
//        int test = 2;
//        for (int i = 0; i < a; i++) {
//            if (a % test != 0) {
//                test++;
//            }
//        }
//        if (test == a) {
//            System.out.println("A là số nguyên tố");
//        }
//        else {
//            System.out.println("A ko phải");
//        }

        // Kiểm tra mảng đó có tăng dần hay ko
//
//        int[] a = {1, 2, 3, 3, 5};
//        int[] b = {1, 2, 3, 4, 5};// tăng dần
//        int[] c = {1, 2, 3, 1, 5};
//        boolean check = true;
//        for (int i = 0; i < a.length; i++) {
//            breakout:
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] >= a[j]) {
//                    check = false;
//                    System.out.println("Day không tăng");
//                    break breakout;
//                }
//            }
//        }
//        if(check == true)
//        {
//            System.out.println("Day tăng");
//        }

        // in ra số lớn nhất nhỏ nhất

//        int x = 10, y = 100, z = 200;
//        int max = x;
//        int mix = x;
//        if (x < y) {
//            max = y;
//        }
//        if (y < z) {
//            max = z;
//        }
//
//        if (x > y) {
//            mix = y;
//        }
//        if (y > z) {
//            mix = z;
//        }
//
//        System.out.println(max);
//        System.out.println(mix);

    /*    int[] A = {7, 5, 9, 10};
        int max = A[0];
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if(A[i] > max)
            {
                max = A[i];
            }
            if(A[i] < min)
            {
                min = A[i];
            }


        }
        System.out.println(max);
        System.out.println(min);*/

        // in ra xâu dài nhất

//        String[] A = {"Java", "Java Core", "Java Core", "JavaCore!", "Java"};
//        int max = 0;
//        int min = A[0].length();
//        boolean check = true;
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i].length() > max) {
//                max = A[i].length();
//
//            }
//            if (min > A[i].length()) {
//                min = A[i].length();
//
//            }
//        }
//        for (int i = 0; i < A.length; i++) {
//
//            if (A[i].length() == max) {
//                System.out.printf("Từ ngắn nhất: " + A[i] + " length = " + max);
//                System.out.println();
//            }
//
//            if (A[i].length() == min) {
//                System.out.printf("Từ ngắn nhất: " + A[i] + " length = " + min);
//                System.out.println();
//
//            }
//        }

        // in ra dãy con tăng dần dài  nhất
//        int[] A = {1, 5, 9, 10, 4, 1, 3, 5, 7, 9, 10, 7, 3, 5, 7, 9, 10, 11};
//        int[] B = {4, 3, 2, 1, 1, 6, 5, 4, 3, 2, 1, 1, 6, 5, 4, 3, 2, 1};
//
//        int[] aLength = new int[A.length];
//        for (int i = 0; i < A.length; i++) {
//            aLength[i] = 1;
//        }
//        int[] C = {1, 2, 3, 4, 1, 1, 2, 3, 4, 5, 6, 1, 1, 2, 3, 4, 5, 6};

//        for (int i = 0; i < A.length - 1; i++) {
//            if (A[i] < A[i + 1]) {
//                aLength[i + 1] = aLength[i] + 1;
//            }
//        }

//        for (int i = A.length - 1; i > 0; i--) {
//            if (A[i] > A[i - 1]) {
//                aLength[i - 1] = aLength[i] + 1;
//            }
//        }
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(aLength));
//        int max = aLength[0];
//        for (int i = 1; i < A.length; i++) {
//            if (aLength[i] > max) {
//                max = aLength[i];
//            }
//            if (aLength[i] == max) {
//                for (int j = i; j < i + max; j++) {
//                    System.out.print(A[j] + " ");
//                }
//                System.out.println("");
//            }
//        }
//        System.exit(0);

//
//        int x = 2;
//        boolean xNg = true;
//
//        int count = 2;
//        while (count++ <= x) {
//            if (x > 2 && x % count == 0) {
//                xNg = false;
//            }
//        }
//
//
//
//        System.out.println(xNg);


//        int[] A = {1, 2, 3, 4, 5};
//        boolean arrTangDan = true;
//        int x = 0;
//        for (int i = 0; i < A.length - 1; i++) {
//            if(A[i] > A[i+1])
//            {
//                arrTangDan = false;
//                System.out.println("Không tăng");
//                break;
//            }
//        }
//        if((arrTangDan))
//        {
//            System.out.println("Tăng");
//        }


        //using while
  /*      int[] A = {1, 2, 3, 4, 5};
        boolean arrTangDan = true;
        int x = 0;
        while (x < A.length - 1) {
            if (A[x] > A[x + 1]) {
                arrTangDan = false;
                System.out.println("Không tăng");
                break;
            }
            x++;
        }
        if ((arrTangDan)) {
            System.out.println("Tăng");
        }*/
        // mảng tăng dần có dấu
//        int[] B = {1, -5, -9, 10};
//        boolean am = false;
//        boolean tang = false;
//        int i = 0;
//        while (i < B.length - 1) {
//            if (B[i] > B[i + 1] && B[i + 1] < 0) {
//                am = true;
//            }
//            if (B[i] < B[i + 1] && B[i + 1] > 0)
//            {
//                tang = true;
//            }
//                i++;
//        }
//        if(am == true && tang == true)
//        {
//            System.out.println("dãy tăng âm");
//        }
//        else {
//            System.out.println("Dãy tăng dương");
//        }


        // Chèn phần tử vào mảng có phần
//        int[] A = {4, 6, -1, 7, 8, 12, 13, -3, 15, 16, -2, 17, 22, 24 - 1};
////                 [4, 8, 9, 0, 0, 0]
//        int x = 9;
//        int[] newA = new int[A.length + 1];
//        int i = 0;
//        while (i < A.length) {
//            if (x < A[0] && A[0] > 0) {
//                newA[i] = x;
//                for (int j = 0; j < A.length; j++) {
//                    newA[j + 1] = A[j];
//                }
//                break;
//            }
//            if (A[i] < x && A[i] > 0 && A[i] > 0) {
//                newA[i] = A[i];
//            } else if (A[i] > x && A[i] != A[i + 1] && A[i] > 0) {
//                newA[i] = x;
//                break;
//            }
//            else if(A[i] < 0 && A[i] < x)
//            {
//                newA[i] = A[i];
//                break;
//            }
//            for (int j = i; j < A.length; j++) {
//                newA[j + 1] = A[j];
//            }
//            i++;
//
//        }
//        System.out.println(Arrays.toString(newA));

//        int[] arr1 = {4, 6, -1, 7, 8, 12, 13, -3, 15, 16, -2, 17, 22, 24 - 1};
//        int key = 12;
//        int left = 0;
//        int right = arr1.length - 1;
//        int mid = (left + right) / 2;
//        while (left <= right) {
//            if (arr1[mid] < key) {
//                left = mid + 1;
//            } else if (arr[mid] == key) {
//                System.out.println("Found key in array" + arr[mid]);
//            } else {
//                right = mid - 1;
//            }
//            mid = (left + right) / 2;
//        }
//        if (left > right) {
//            System.out.println("Not found");
//        }


        // Đảo tên
      /*  String s = " Trương Bá Chính Linh";
        String newS = s.trim();
        String sp[];
        sp = newS.split(" ");
        String[] newSP = new String[sp.length];
        System.out.println(Arrays.toString(sp));
        newSP[0] = sp[sp.length - 1];
        int start = 1;
        StringBuffer st = new StringBuffer();
        st.append(sp[sp.length - 1] + " ");
        for (int i = 0; i < sp.length - 1; i++) {
//            newSP[start++] = sp[i];
            st.append(sp[i] + " ");
        }
        System.out.println(st);*/


//        int[] a = new int[10];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 5;
//        a[3] = 8;
//        a[4] = 20;
//        a[5] = 50;
//
//        int[] x = {3, 4, 9, 100};
//
//        // tham khảo thêm
//
//        int[] a = new int[10];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 5;
//        a[3] = 8;
//        a[4] = 20;
//        a[5] = 50;
//        //a ={ 1, 2, 5, 8, 20, 50 ,0 ,0, 0,  0}
//        int[] x = { 3, 4, 15, 60 };
//        // lấy từng phần tử của x
//        int i=0;  int j=0; int n=6;int m=4;
//        int cuoi=0;
//        while (i<x.length) {
//            while (j<=n-1 ) {
//                if (a[j]<=x[i]) j++;
//                else break;
//            }// j=0;
//            while ((cuoi<=m-1) && (x[cuoi]<a[j])) cuoi++;
//            // đoạn cần chèn: i, cuoi-1; doan can dich: size=cuoi-i;
//            int size=cuoi-i;
//            // n-1 đến j == sang phải size vị trí;
//            int t=n-1;
//            while ((size>0) && (t>=j)) {a[t+size]=a[t];t--;}
//            // chèn đoạn x[ i, cuoi-1];
//            for (t=j;t<j+size;t++) {a[t]=x[i];i++;}
//            j=j+size+1;
//            n=n+size;
//            i=cuoi;
//            if (j>n-1) break;
//        }
//        /// chèn nốt vào bên phải;  ....
//
//        for ( i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }


       /* int[] NUMBERS = {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62};

        int temp;
        for (int i = 0; i < NUMBERS.length; i++) {
            for (int j = 0; j < NUMBERS.length; j++) {
                if (NUMBERS[j] > NUMBERS[j+1]) {
                    temp = NUMBERS[j+1];
                    NUMBERS[j+1] = NUMBERS[j];
                    NUMBERS[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(NUMBERS));
        System.exit(0);*/



        /*   int[] newA = {2,1,4,3,8,10,5,7};*/
//
//        int[] A = {12,  1,4, 5, 10, 3};
//        int pos;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] % 2 == 0) {
//                continue;
//            }
//            pos = i;
//            int temp = A[i];
//            for (int j = i + 1; j < A.length; j++) {
//
//                if (A[j] < temp) {
//                    temp = A[j];
//                    pos = j;
//                }
//            }
//            A[pos] = A[i];
//            A[i] = temp;
//        }
//        System.out.println(Arrays.toString(A));


        int[] NUMBERS = {1, 5, 3, 4, 6, 2};
        int temp;
        for (int i = 0; i < NUMBERS.length - 1; i++) {
            for (int j = 0; j < NUMBERS.length - 1 - i; j++) {
                if (NUMBERS[j] > NUMBERS[j + 1]) {
                    temp = NUMBERS[j];
                    NUMBERS[j] = NUMBERS[j + 1];
                    NUMBERS[j + 1] = temp;
                }

            }


        }
        System.out.println(Arrays.toString(NUMBERS));

    }


}


