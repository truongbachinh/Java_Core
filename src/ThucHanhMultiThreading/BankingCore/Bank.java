package ThucHanhMultiThreading.BankingCore;

public class Bank {
    public static final int max_bank_account = 10;
    public static final int max_amount = 10; // sôt iền tối đa mỗi lần chuyển
    public static final int initial_balance = 100; // tài khoản defaul khởi tạo
    private Account[] accounts = new Account[max_bank_account];// khở tạo số lượng tối đa các tài khoản ngân hàng

    public Bank() {
        for (int i = 0; i < max_bank_account; i++) {
            accounts[i] = new Account(initial_balance); // khởi tạo 10 tài khoản với số tiền trong mỗi tài khoản là 100
        }
    }

    public synchronized void transfer(int from, int to, int amount) {
//        if(amount <= accounts[from].getBalance())
//        {
//            accounts[from].withdraw(max_amount);
//            accounts[to].deposit(max_amount);
//            String msg = "%s transfer %d from %s to %s. Total balance: %d \n";
//            String threadName =  Thread.currentThread().getName();
//            System.out.printf(msg,threadName,amount,from,to,getTotalBalance());
//        }
//        thread chưa đồng bộ
        try {
            if (accounts[from].getBalance() < amount) {
                wait();
            }
            accounts[from].withdraw(max_amount);
            accounts[to].deposit(max_amount);
            String msg = "%s transfer %d from %s to %s. Total balance: %d \n";
            String threadName = Thread.currentThread().getName();
            System.out.printf(msg, threadName, amount, from, to, getTotalBalance());
        } catch (InterruptedException e) {
            e.getMessage();
        }

    }

    public synchronized int getTotalBalance() {
        int total = 0;
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].getBalance();
        }
        return total; // trả về tổng amount của ngân hàng số tiền vẫn luôn là 1000
    }
}
