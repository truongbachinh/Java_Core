package exerceise;

import java.util.*;

public class Test_2021_02_06 {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4, 5, 5}, //
                {1, 2, 3, 4, 5, 5},
                {4, 2, 1, 3, 5, 5},
                {1, 2, 3, 4, 5, 5},
                {1, 2, 3, 4, 5, 5},
                {4, 2, 1, 3, 5, 5},
                {1, 2, 3, 4, 5, 5},
                {1, 2, 3, 4, 5, 5}

        };
        int[] arrRDuplicate = new int[A[0].length];
        int[] arrCDuplicate = new int[A[0].length];
        boolean checkRow = false;
        boolean flagR = false;
        int end = 0;
        int cnt = 0;
        while (end < A[0].length) {
            Set<Integer> rowD = new TreeSet<>();
            outbreak:
            for (int i = cnt; i < A.length - 1; i++) {
                for (int j = 0; j <= A[0].length - 1; j++) {
                    arrRDuplicate[j] = A[i][j];
                 //   arrCDuplicate[j] = A[j][j+1];
                    if (j == A[0].length - 1) {
                        rowD.add(i);
                        break outbreak;
                    }
                }
            } // lấy giá trị dòng đầu tiên ra so sánh với các dòng tiếp theo
            for (int i = cnt; i < A.length - 1; i++) {
                for (int j = 0; j < A[0].length - 1; j++) {
                    if (arrRDuplicate[j] == A[i + 1][j]) {
                        checkRow = true;
                    } else {
                        // nếu dòng này không trùng thì bỏ qua dòng này và lưu vị trí dòng này
                        flagR = true;
                        cnt = i + 1;
                        break;
                    }
                }
                // nếu tất cả các phần tử của dòng trùng thì thêm dòng đấy vào set
                if (checkRow && flagR == false) {
                    rowD.add(i + 1);
                }
                //trả lại giá trị  ban đầu
                flagR = false;
                // nếu mảng set lớn hơn 0 và vòng i kết thúc thì in ra
                if (i == A.length - 2 && rowD.size() > 1) {
                    int first = (int) rowD.toArray()[0];
                    System.out.print("Dòng " + first + " trùng với các dòng: ");
                    rowD.remove(first);
                    System.out.println(rowD);
                    rowD.removeAll(rowD);
                }
            }
            // lặp tiếp
            end++;

            int[ ] a = {1,2,3,4,5,6};
            int []b = a;
        }
    }
}
