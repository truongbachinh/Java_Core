package ThucHanhMultiThreading.BankingCore;

public class Account {
    // số dư tài khoản ban đầu luôn luôn bằng 0;
    private int balance = 0;

    public Account(int balance) {
        this.balance  = balance;
    }
    public synchronized void withdraw(int amount)
    {
        this.balance -= amount;
    }
    public synchronized void deposit(int amount)
    {
        this.balance += amount;
    }
    public synchronized  int getBalance()
    {
        return this.balance;
    }
}
