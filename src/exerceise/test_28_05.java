package exerceise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class test_28_05 {
    public static void main(String[] args) {
        String[] ST = {
                "Xác định aaaaaaaaaaa xem ma trận X có xuất aaaaaaaaaaa hiện",
                "Đếm số lần xuất hiện của X trong A"
                , "Đếm số lần  aaaaaaaaaaa xuất hiện của X trong A",
                "Đếm số lần  aaaaaaaaaaa xuất hiện của aaaaaaaaaaa trong A"};
        // print max bằng aaaaaaa tại dòng 1 và 3 và các vị trí thứ x x
        int max = findMax(ST[0]);
        for (int i = 1; i < ST.length; i++) {
            if (max < findMax(ST[i])) {
                max = findMax(ST[i]);
            }
        }
        System.out.println(max);
        int max2 = 0;
        int[] a = new int[ST.length];
        for (int i = 0; i < ST.length; i++) {
            viTriMax(ST[i], max);
        }
        System.out.println(Arrays.toString(a));
    }

    public static int findMax(String s) {
        String ss = s.replaceAll(",.", " ");
        String[] sp = ss.split(" ");
        int max = sp[0].length();
        for (int i = 1; i < sp.length; i++) {
            if (max < sp[i].length()) {
                max = sp[i].length();
            }
        }
        return max;
    }

    static int[] viTriMax(String s, int max) {

        int[] vitri = new int[s.length()];
        String[] sp = s.split("");
        int count = 0;
        int end = 0;
        for (int i = sp.length - 1; i >= 0; i--) {
            if ((sp[i].equals(" ") || sp[i].equals(",") || sp[i].equals("."))) {
                if (max == count) {
                    vitri[end] = max;
                    end++;

                }
                count = 0;
            } else {
                count++;
            }
        }
        System.out.println(Arrays.toString(vitri));
        return vitri;
    }
}
