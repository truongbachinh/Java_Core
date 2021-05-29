package MaTran;

import java.util.Scanner;

public class MaTranChuyenVi {

    static void nhap() {
        int[][] matrix;
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập row, column");
        row = sc.nextInt();
        column = sc.nextInt();
        matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        display(matrix);
        System.out.println("Sau khi chuyển vị:");
        int[][] a = chuyenViMaTran(matrix);
        display(a);

    }

    public static int[][] chuyenViMaTran(int[][] matrix) {
        int[][] matrixChuyenVi = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    matrixChuyenVi[i][j] = matrix[j][i];
            }
        }
        return matrixChuyenVi;
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nhap();
    }
}
