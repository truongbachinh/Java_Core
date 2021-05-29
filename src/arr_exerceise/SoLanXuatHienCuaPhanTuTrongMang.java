package arr_exerceise;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class SoLanXuatHienCuaPhanTuTrongMang {
    public static void checkSoLanXuatHien(int[] arr) {
        int temp;
        int maxCount;
        int maximun;
        int[] max = new int[arr.length];
        boolean[] did = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            did[i] = false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            temp = arr[i];
            if (did[i] == false) {
                did[i] = true;
                for (int j = i + 1; j < arr.length; j++) {
                    if (temp == arr[j]) {
                        count++;
                        did[j] = true;
                    }
                }

                if (count > 1) {
                    System.out.println("Số " + temp + " xuất hiện " + count + " lần");
                    max[i] = count;
                }
                for (int k = 0; k < max.length; k++) {
                    maximun = max[0];
                    if (maximun < max[k]) {
                        maximun = max[k];
                        System.out.println("SỐ " + temp + " xuất hiện nhiều nhất với " + maximun + " lần");
                      System.exit(0);
                    }
                }
            }
        }
        for (int i = 0; i < max.length - 1; i++) {
            maxCount = max[i];
            for (int j = i + 1; j < max.length; j++) {
                if (maxCount < max[j]) {
                    max[i] = max[j];
                    max[j] = maxCount;
                    maxCount = max[i];
                }
            }

        }
        System.out.println("mảng xuất hiện sắp xếp giảm dần" + Arrays.toString(max));

    }
}
