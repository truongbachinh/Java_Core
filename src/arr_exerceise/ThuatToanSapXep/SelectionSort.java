package arr_exerceise.ThuatToanSapXep;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        // for j chạy để tìm kiếm temp nhỏ nhất và position của nó xong r đổi chỗ cho nó vói phần tử a[i] đang so sánh
        int[] number = {7, 5, 3, 4, 2, 6};
        int position;
        int temp;
        for (int i = 0; i < number.length; i++) {
            temp = number[i];
            position = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < temp) {
                    temp = number[j];
                    position = j;
                }
            }
            number[position] = number[i];
            number[i] = temp;
        }
        System.out.println(Arrays.toString(number));


//        int[] a = {1, 2, 5, 8, 20, 50, 0, 0, 0, 0};
//        int[] x = {3, 4, 15, 60};
//        // lấy từng phần tử của x
//        int i = 0; int j = 0; int n = 6; int m = 4;
//        int cuoi = 0;
//        while (i < x.length) {
//            while (j <= n - 1) {
//                if (a[j] <= x[i]) j++;
//                else break;
//            }// j=0;
//            while ((cuoi <= m - 1) && (x[cuoi] < a[j])) cuoi++;
//            // đoạn cần chèn: i, cuoi-1; doan can dich: size=cuoi-i;
//            int size = cuoi - i;
//            // n-1 đến j == sang phải size vị trí;
//            int t = n - 1;
//            while ((size > 0) && (t >= j)) {
//                a[t + size] = a[t];
//                t--;
//            }
//            // chèn đoạn x[ i, cuoi-1];
//            for (t = j; t < j + size; t++) {
//                a[t] = x[i];
//                i++;
//            }
//            j = j + size + 1;
//            n = n + size;
//            i = cuoi;
//            if (j > n - 1) break;
//        }
//        /// chèn nốt vào bên phải;  ....
//        for (i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }

    }
}
