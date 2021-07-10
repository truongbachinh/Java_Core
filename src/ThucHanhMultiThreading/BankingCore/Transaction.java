package ThucHanhMultiThreading.BankingCore;

public class Transaction implements Runnable{
    private Bank bank;
    private int fromAccount;
    public Transaction(Bank bank, int fromAccount)
    {
        this.bank = bank;
        this.fromAccount = fromAccount;
    }
    @Override
    public void run()
    {
        while (true)
        {
            int toAccount = (int) (Math.random() * Bank.max_bank_account);

            if (toAccount == fromAccount) continue;
            int amount = (int) (Math.random()* Bank.max_amount);
            if(amount == 0)
                continue;
            bank.transfer(fromAccount,toAccount,amount);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }


        }

    }
}
