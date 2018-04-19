package Thread;

/**
 * Created by wang on 2018/1/19.
 */
public class DepositThread extends Thread{
    private AccountAlt account;
    private double amount;
    public DepositThread(AccountAlt account,double amount){
        this.account=account;
        this.amount=amount;
    }
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            account.deposit(amount);
        }
    }
}
