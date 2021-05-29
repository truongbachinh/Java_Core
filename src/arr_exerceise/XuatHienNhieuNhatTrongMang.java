package arr_exerceise;

import java.util.Arrays;

public class XuatHienNhieuNhatTrongMang {
    public static void inSoLanXuatHien(int[] arr) {
        int temp, count;
        int length = arr.length;
        int[] arrDem = new int[arr.length];

        // arrDem để check xem số đấy đã đếm hay chưa đếm rồi thì bằng 'count' chưa thì bằng -1;
        // đã đếm trước đó và phát hiện trùng thì = 0
        for (int i = 0; i < length; i++) {
            arrDem[i] = -1;
        }

        for (int i = 0; i < length; i++) {
            temp = arr[i];
            count = 1;
            for (int j = i + 1; j < length; j++) {
                if (arrDem[i] != 0 && temp == arr[j]) {
                    count++;
                    arrDem[j] = 0;
                }
            }

            if (arrDem[i] != 0) {
                arrDem[i] = count;

            }

        }
        System.out.println(Arrays.toString(arrDem));
        int max = 0;
        for (int i = 0; i < length; i++) {
            if (max < arrDem[i]) {
                max = arrDem[i];

            }
        }
        for (int i = 0; i < length; i++) {
            if (arrDem[i] == max) {
                System.out.printf("Số xuất hiện nhiều nhất là " + arr[i]);
            }
        }
        System.out.println(" với lần xuất hiện nhiều nhất là  " + max);

    }
}
