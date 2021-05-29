package MaTran;

import java.util.Scanner;

public class TichHaiMaTran {


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


        int[][] matrix2;
        int row2;
        int column2;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập row2, column2");
        row2 = sc2.nextInt();
        column2 = sc2.nextInt();
        matrix2 = new int[row2][column2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrix2[i][j] = sc2.nextInt();
            }
        }
        System.out.println("Matrix 1");
        display(matrix);
        System.out.println("Matrix 2");
        display(matrix2);
        int[][] a = nhanHaiMaTran(matrix, matrix2);
        System.out.println("Sau khi Nhân 2 ma tran:");
        display(a);


    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // TÍch được tính bằng các phần tử trong hàng của matrix 1  nhân với các phần tử trọng cột của matrix 2
    public static int[][] nhanHaiMaTran(int[][] matrix1, int[][] matrix2) {
        // new arr có độ dài bằng row của matrix 1 và col của matrix 2;

//        Matrix 1
//        1 2 3 4
//        5 6 7 8
//        8 9 10 11
//        Matrix 2
//        12 13 14
//        15 16 17
//        new  Matrix  1 * 12,2 ,
        int colA = matrix1[0].length;
        int[][] newArr = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                for (int l = 0; l < colA; l++) {
                    newArr[i][j] += matrix1[i][l] * matrix2[l][j];
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        nhap();
    }
}
