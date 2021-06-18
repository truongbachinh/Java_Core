package exerceise;

import java.util.Arrays;

public class Test_2021_03_06 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 5, 6, 0, 0, 0, 0}, //
                {4, 7, 8, 9, 0, 0, 0, 0},
                {10, 11, 12, 13, 0, 0, 0, 0},
                {15, 16, 17, 18, 0, 0, 0, 0},
                {12, 13, 14, 15, 0, 0, 0, 0},
        };
        int[] aI = new int[A[0].length];
        int[] aJ = new int[A[0].length];
        int[] aStart = A[0];
        int[] aEnd = A[A.length - 1];
        int n = 4;
        int end = 0;
        int cnt = 0;
        while (end < A.length) {
            outbreak:
            for (int i = cnt; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    aI[j] = A[i][j];
                    aJ[j] = A[i + 1][j];
                    if (j == n - 1) {
                        break outbreak;
                    }
                }
            }
            if (cnt < A.length - 1) {
                int[] AChen = Chenmang(aI, aJ);
                outbreak:
                for (int i = cnt; i < A.length; i++) {
                    for (int j = 0; j < A[0].length; j++) {
                        A[i][j] = AChen[j];
                        if (j == A[0].length - 1) {
                            break outbreak;
                        }
                    }

                }
            }
            if (cnt == A.length - 1) {
                A[A.length - 1] = Chenmang( A[cnt],aEnd);
            }
            cnt++;
            end++;
        }
      //  System.out.println(Arrays.deepToString(A));
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }


    }

    public static int[] Chenmang(int[] a, int[] x) {
        int i = 0;
        int j = 0;
        int n = 4;
        int m = 4;
        int cuoi = 0;
        while (i < x.length) {
            while (j <= n - 1) {
                if (a[j] <= x[i]) j++;
                else break;
            }
            while ((cuoi <= m - 1) && (x[cuoi] < a[j])) cuoi++;
            int size = cuoi - i;
            int t = n - 1;
            while ((size > 0) && (t >= j)) {
                a[t + size] = a[t];
                t--;
            }
            for (t = j; t < j + size; t++) {
                a[t] = x[i];
                i++;
            }
            j = j + size + 1;
            n = n + size;
            i = cuoi;
            if (j > n - 1) break;
        }
        for (int k = n; k < a.length; k++) {
            a[n] = x[i];
            i++;
            n++;
        }

        return a;
    }
}
