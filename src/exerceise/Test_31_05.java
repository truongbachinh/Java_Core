package exerceise;

import java.util.*;

public class Test_31_05 {
    public static void main(String[] args) {

        int[][] C = {{1, 2, 3, 4},
                    {3, 6, 7, 9},
                    {4, 7, 9, 10}};
        // expect Mảng a thỏa mãn tất cả các hàng và các cột đều tăng dần

        int[][] A = {{1, 2, 3, 4},
                {3, 6, 1, 9}, // xóa dong 1 cột 0 cột 2
                {4, 1, 9, 10},
                {2, 8, 11, 1},
                {5, 15, 19, 20}};

        /// expect out xóa dòng 1 cột 2


        boolean checkRow = true;
        boolean checkCol = true;
        Set<Integer> rowD = new TreeSet<>();
        Set<Integer> colD = new TreeSet<>();
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A[0].length - 1; j++) {
                if (A[i][j] > A[i][j + 1]) {
                    checkRow = false;
                    rowD.add(i);
                    break;
                }
                if (A[i][j] > A[i + 1][j]) {
                    checkRow = false;
                    colD.add(j);
                    break;
                }
            }

        }

        if (checkCol == false || checkRow == false) {
            System.out.println("mảng ko tăng dần theo chiều dòng");
            System.out.println("Cần xóa các dòng và các cột là: ");

            System.out.println("dòng: " + rowD + " cột: " + colD);


        } else {
            System.out.println("Mảng A thoả mãn: tất cả các hàng, tất cả các cột đều là các dãy tăng dần.");
        }


    }
    // em xin phép được nộp lại


}
