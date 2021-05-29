package arr_exerceise.ThuatToanSapXep;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        // T
        int[] number = {5, 2, 3, 4, 6, 2};
        // temp =2;
        // j = 1 - 1 = 0
        //for i = 1 j =0  number = {5,5,3,4,6,2}
        // kết thúc for j = đổi chỗ của number [j+ 1] bằng
        // kết quả sau vòng lặp i  = 1;
        // number = {2,5,3,4,6,2};
        //  => nếu muốn chèn 1 số vào mảng tăng dần dùng cách này thuyết phục.
        for (int i = 1; i < number.length; i++) {
            int temp = number[i];
            int j = i - 1;

            for (; j >= 0 && number[j] > temp; j--) {
                number[j + 1] = number[j];
            }

            number[j + 1] = temp;
        }
        System.out.println(Arrays.toString(number));

        int[] A = {5, 8, 3, 4, 6, 2, 0};
        int B = 2;
        chenPhanTuVaoMang(A, B);
    }

    public static void chenPhanTuVaoMang(int[] A, int B) {
        int i = 0;
        while (i < A.length) {
            if (A[i] == 0 || A[i] < 0) {
                A[i] = B;
            }
            i++;
        }
        for (int j = 1; j < A.length; j++) {
            int temp = A[j];
            int k = j - 1;
            for (; k >= 0 && A[k] > temp; k--) {
                A[k+1] = A[k];
            }
            A[k+1] = temp;
        }
        System.out.println(Arrays.toString(A));
    }
}
