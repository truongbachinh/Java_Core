package exerceise.BaiThamKhao;

public class TimDayMax {
        public static void main(String[] args) {
            int[] A = {1, 5, 9, 10, 4, 1, 3, 5, 7, 9, 10, 7, 1, 3, 5, 7, 9, 10, 11};
            int dem = 1;
            int max = dem;
            int end = 0;int i;
            for (i = 1; i <= A.length - 1; i++) {
                if (A[i-1] < A[i]) {
                    dem++;
                } else {
                    if (max < dem) {
                        max = dem;
                        end = i - 1;
                    }
                    dem = 1;
                }
            }
            if (max < dem) {
                max = dem;
                end = A.length - 1;
            }

            System.out.println("Dãy con tăng dần dài nhất là:");
            for (  i = end - max + 1; i <= end; i++) {
                System.out.print(A[i] + " ");
            }
        }

}
