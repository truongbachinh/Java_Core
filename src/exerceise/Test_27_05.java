package exerceise;

import java.util.Arrays;

public class Test_27_05 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4, 5},
                {8, 7, 6, 5, 6},
                {7, 2, 4, 2, 7},
                {6, 9, 3, 2, 8},
                {2, 3, 1, 8, 9},
        };
        int row = A.length;
        int col = A[0].length;
        int DelR = 2;
        int DelC = 2;

        // xoa dong
        for (int i = DelR; i < row - 1; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] = A[i + 1][j];
            }
        }
        row--;

        // xoa cot
        for (int i = 0; i < row; i++) {
            for (int j = DelC; j < col - 1; j++) {
                A[i][j] = A[i][j + 1];
            }
        }
        col--;

        int[][] newA = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               newA[i][j] =A[i][j];
            }
            System.out.println();
        }


        //
        caculate(newA, row);
        //
       // System.out.println(caculateF(newA,row,col));

    }

    public static void caculate(int[][] a, int n) {
        int N = n, dau = 1;
        for (int col = 0; col <= N - 2; col++) {
            for (int row = col + 1; row < N; row++) {
                double heso = (-1) * a[row][col] / a[col][col];
                for (int col2 = col; col2 < N; col2++)
                    a[row][col2] += a[col][col2] * heso;
            }
        }

        double dt = 1;
        for (int i = 0; i < N; i++) {
            dt *= a[i][i];
           System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("Gia tri cua DT=" + dt * dau);
    }

    public static double caculateF(int[][] A, int row, int col) {
        double s, sum = 0;
        if (row == 1) {
            return A[0][0];
        }
        if (row == 2) {
            return (A[0][0] * A[1][1] - A[0][1] * A[1][0]);
        }
        for (int i = 0; i < row; i++) {
            int[][] fA = new int[row][col];
            for (int j = 0; j < row; j++) {
                for (int k = 1; k < col; k++) {
                    if (j < i) {
                        fA[j][k - 1] = A[j][k];
                    } else if (j > i) {
                        fA[j - 1][k - 1] = A[j][k];
                    }
                }

            }
            if (i % 2 == 0) {
                s = 1;
            } else {
                s = -1;
            }
            sum += A[i][0] * caculateF(fA, (row - 1), (col - 1));
        }
        return sum;
    }


}
