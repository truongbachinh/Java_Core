package exerceise;

import java.util.Arrays;

public class test_26_05 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 4, 2, 5, 6, 10, 10, 10},
                {1, 2, 4, 2, 5, 6, 2, 10, 10},
                {1, 2, 4, 2, 5, 6, 11, 10, 10},
                {1, 2, 4, 2, 5, 6, 10, 10, 10},
                {1, 2, 4, 2, 5, 6, 11, 10, 10}};
        //expect that print max =10 dòng  =

        int x = findMax(A);
        System.out.println("Max = " + x);
        print(A, x);


    }

    public static void print(int[][] A, int x) {

        int[] row = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A[0].length; j++) {
                if (x == A[i][j]) {
                    count++;
                }
            }
            row[i] = count;
        }
        int rowMax = 0;
        for (int i = 0; i < row.length; i++) {
            if (rowMax < row[i]) {
                rowMax = row[i];
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (rowMax == row[i]) {
                System.out.println("Dòng thứ: " + (i + 1));
            }
        }
    }

    public static int findMax(int[][] A) {
        int max = A[0][0];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        return max;
    }
}
