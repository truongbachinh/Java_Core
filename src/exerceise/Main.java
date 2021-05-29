package exerceise;

import java.util.Arrays;

import static java.lang.String.valueOf;

public class Main implements Comparable<Main> {
    int[] A;

    public Main(int[] A) {
        this.A = A;
    }

    public Main(int N) {
        A = new int[N];
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    @Override
    public String toString() {
        return Arrays.toString(A);
    }

    @Override
    public int compareTo(Main o) {
        int count;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < A.length; i++) {
            sum1 += this.A[i];
            sum2 += o.A[i];
        }

        if (sum1 < sum2) {
            count = -1;
        } else if (sum1 > sum2) {
            count = 1;
        } else {
            count = 0;
        }

        return count;

    }

    public static void main(String[] args) {
        Main[] arrObj = new Main[5];


        for (int i = 0; i < arrObj.length; i++) {
            int x = (int) (Math.random() * 10);
            arrObj[i] = new Main(new int[]{x, 10 * x, 20 * x});
        }
        for (int i = 0; i < arrObj.length; i++) {
            System.out.println(arrObj[i]);
        }
        System.out.println();

        Main[] tempMax = new Main[arrObj.length];
        int[] l = new int[arrObj.length];
        tempMax[0] = arrObj[0];
        int positionMax = 0;
        System.out.println("Các dãy max là: ");
        for (int i = 1; i < arrObj.length; i++) {
            if (tempMax[0].compareTo(arrObj[i]) == -1) {
                tempMax[0] = arrObj[i];
                positionMax = i;
            }

        }
        System.out.println(tempMax[0] + " vị trí là: " + (positionMax + 1));
        for (int j = positionMax + 1; j < arrObj.length; j++) {
            if (tempMax[0].compareTo(arrObj[j]) == 0) {
                System.out.println(tempMax[0] + " vị trí là: " + (j + 1));
            }
        }


        Main[] temp = new Main[arrObj.length];
        int position;
        for (int i = 0; i < arrObj.length; i++) {
            temp[i] = arrObj[i];
            position = i;
            for (int j = i + 1; j < arrObj.length; j++) {
                if (arrObj[j].compareTo(temp[i]) == -1) {
                    temp[i] = arrObj[j];
                    position = j;
                }

            }
            arrObj[position] = arrObj[i];
            arrObj[i] = temp[i];
        }
        System.out.println();
        System.out.println("after sort: ");
        for (int i = 0; i < arrObj.length; i++) {
            System.out.println(arrObj[i]);
        }

        //













        /*
        Hãy lập trình:
        3.1. Tìm và in ra các mảng có tổng lớn nhất cùng vị trí
              xuất hiện của nó trong arrObj
        3.2. Sắp xếp arrObj theo tổng giá trị tăng dần.
              (từ làm--ko dùng đến Collection
        */

        // 3.1


    }
}
