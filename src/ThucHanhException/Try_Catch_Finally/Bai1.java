package ThucHanhException.Try_Catch_Finally;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

class devideZeroException extends Exception {
    public devideZeroException(String msg) {
        super(msg);
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        float d = 0;
        try {
            d = (a / b);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
