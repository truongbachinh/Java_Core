package exerceise;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));

    }

  public   static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * f(n - 1));
        }
    }


    public static double caculate(int[][] A, int row, int col) {
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
            sum += A[i][0] * caculate(fA, row - 1, col - 1);
        }
        return sum;
    }
}
