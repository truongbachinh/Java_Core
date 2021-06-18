package exerceise.BaiThamKhao;

import java.util.Arrays;

public class CacDayConTang {
    public static void main(String[] args) {
//        int[] A = {1, 5, 9, 4, 1, 3, 5, 1, 4, 5};
//        int end = 0;
//        int[] ends = new int[A.length]; // mảng con
//        int dem = 1;
//        int max = 1;
//        int cnt = 1;//
//        ends[cnt - 1] = 0;//kết thúc
//        int i;
//        for (i = 1; i <= A.length - 1; i++) {
//            if (A[i - 1] < A[i]) {
//                dem++;
//            } else {
//                if (max < dem) {
//                    max = dem;// độ dài
//                    cnt = 1;//
//                    ends[cnt - 1] = i - 1;//kết thúc
//                } else if (max == dem) {
//                    cnt++;
//                    ends[cnt - 1] = i - 1;//kết thúc
//                }
//                dem = 1;
//            }
//        }
//        System.out.println("end 1");
//        System.out.println(Arrays.toString(ends));
//        if (max < dem) {
//            max = dem;// độ dài
//            cnt = 1;//
//            ends[cnt - 1] = A.length - 1;//kết thúc
//        } else if (max == dem) {
//            cnt++;
//            ends[cnt - 1] = A.length - 1;//kết thúc
//        }
//        System.out.println("end 2");
//        System.out.println(Arrays.toString(ends));
//
//        System.out.println("Dãy con tăng dần dài nhất là:");
//        for (i = 0; i < cnt; i++) {
//            for (int j = ends[i] - max + 1; j <= ends[i]; j++) {
//                System.out.print(A[j] + " ");
//            }
//            System.out.println("");
//        }


        int[] A = {1, 5, 9, 4, 1, 3, 5, 1, 4, 5};

        int[] coutPosMax = new int[A.length];
        int count = 1;
        int max = count;
        int end = 0;
        int cnt = 1;
        int i;
        for (i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                count++;
            } else {
                if (max < count) {
                    // tìm ra được độ dài lớn nhất đầu tiên
                    max = count;

                    cnt = 1;
                    coutPosMax[cnt - 1] = i - 1; //
                    // => coutPostmax tại vị trí cnt -1 =  vị trí kết thúc của dãy con tăng
                }
                // nếu có nhiều hơn 1 mẩng con
                else if (max == count) {
                    // độ dài của các mảng con tăng dần bằng nhau
                    cnt++;
                    coutPosMax[cnt - 1] = i - 1;// vị trí kết thúc của mảng con thứ n*
                    //
                }
                count = 1;
            }
            if (max < count) {
                max = count;
                cnt = 1;
                coutPosMax[cnt - 1] = A.length - 1;
            } else if (max == count) {
                cnt = 1;
                coutPosMax[cnt-1] = A.length-1;
            }
        }
    }
}

