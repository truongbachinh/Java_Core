package exerceise;

public class test_24_05 {
    public static void main(String args[]) {
        int[] a = new int[10];
        a[0] = 50;
        a[1] = 20;
        a[2] = 8;
        a[3] = 6;
        a[4] = 5;
        a[5] = 3;
        int[] x = {30, 11, 10, 1};

        int n = 6;
        int m = 4;
        int i = 0;
        int j = 0;
        int cuoi = 0;


        for (;i < x.length;) {
            while (j <= n - 1) {
                if (a[j] >= x[i]) j++;
                else break;
            }
            while ((cuoi <= m - 1) && (x[cuoi] > a[j])) {
                cuoi++;
            }
            int size = cuoi - i;
            int t = n - 1;
            while ((size > 0) && (t >= j)) {
                a[t + size] = a[t];
                t--;
            }

            for (t = j; t < j + size; t++) {
                a[t] = x[i];
                i++;
            }
            j = j + size + 1;
            n = n + size;
            i = cuoi;
            if (j > n - 1) break;
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
