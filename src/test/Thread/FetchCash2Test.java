package Thread;

/**
 * Created by wang on 2018/1/19.
 */
public class FetchCash2Test {
    public static void main(String[] args) {
        AccountAlt account=new AccountAlt("62284823423423299",0);
        new DrawThread(account,800).start();
        new DepositThread(account,800).start();
        new DepositThread(account,800).start();
        new DepositThread(account,800).start();
    }
}
