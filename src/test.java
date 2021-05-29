import java.sql.SQLTransactionRollbackException;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String st = "Hãy lập trình  xác định khoảng cách xa nhất giữa 2 lần xuất hiện phần tử có giá trị bằng x trong mảng A";
        int[] length;
        String[] sp;
        sp = st.split(" ");
        System.out.println(Arrays.asList(sp));
        length = new int[sp.length];
        int count = 0;
        int max = 0;
        for (int i = 0; i < sp.length; i++) {
            int check = sp[i].length();
            length[i] = check;
            if (check > max)
                max = check;
        }

        for (int i = 0; i < sp.length; i++) {
            if (length[i] == max) {
                System.out.print(sp[i]);
                System.out.println(" với vị trí bắt đầu tính từ 0 là : " + count);
            }
            count += length[i] + 1;
        }


    }
}
