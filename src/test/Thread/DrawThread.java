package Thread;

/**
 * Created by wang on 2018/1/19.
 */
public class DrawThread extends Thread{
    private AccountAlt account;
    private double amount;
    public DrawThread(AccountAlt account,double amount){
        this.account=account;
        this.amount=amount;
    }
    @Override
    public void run() {
        for(int i=0;i<21;i++){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            account.draw(amount);
        }
    }
}
