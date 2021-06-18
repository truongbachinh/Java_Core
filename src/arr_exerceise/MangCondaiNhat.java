package arr_exerceise;

public class MangCondaiNhat {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 1, 2, 3, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 15, 16, 17, 19};

        int count = 1;
        int max = count;
        int end = 0;
        int i;
        for (i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    end = i - 1;
                }
                count = 1;
            }
        }
       
        if (max < count) {
            max = count;
            end = A.length - 1;
        }

        for (i = A.length - max; i <= end; i++) {
            System.out.println(A[i]);
        }

        // in ra mảng tăng dần ngắn nhất
        int countMin = 1;
        int maxMin = A.length;
        int endsMin = 0;
        int j;
        for (j = 1; j < A.length; j++) {
            if (A[j - 1] < A[j]) {
                countMin++;
            } else {
                if (countMin < maxMin) {
                    maxMin = countMin;
                    endsMin = i - 1;
                }
                countMin = 1;
            }
        }
        if (maxMin < countMin) {
            maxMin = countMin;
            endsMin = A.length - 1;
        }
        System.out.println("min");
        for (j = A.length - maxMin; j <= endsMin; j++) {
            System.out.println(A[j]);

        }

    }
}

