package ThucHanhMultiThreading.BankingCore;

import java.util.ArrayList;

public class TestTransfering {
    public static void main(String[] args) {
        Bank bank = new Bank();
        for (int i = 0; i < Bank.max_bank_account; i++) {
            Thread thread = new Thread(new Transaction(bank,i));
            thread.start();
        }

        int[] A = new int[10];
        int[] B = new int[10];
        ArrayList<Integer> e = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            
        }
    }
}
