package Thread;

/**
 * Created by wang on 2018/1/19.
 */
public class Account {
    private String accountNo;
    private double banlance;
    private boolean flag=false;//false代表账户没钱

    public Account(String accountNo, double banlance) {
        this.accountNo = accountNo;
        this.banlance = banlance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 不允许随便存钱，就不提供setter方法
     * @return
     */
    public double getBanlance() {
        return banlance;
    }


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    //取钱
    public synchronized void draw(double amount){
        try{
            if(!flag){//如果账户没钱，就等着存款者存钱
                wait();
            }else{
                this.banlance=this.getBanlance()-amount;
                System.out.println("取款者"+Thread.currentThread().getName()+"取走"+amount+"元，账户余额："+this.getBanlance());
                flag=false;
                notifyAll();//唤醒存款线程进行存款
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public  synchronized void deposit(double amount){
        try {
            if(flag){//如果有钱，等着取款者来取
                wait();
            }else{
                this.banlance=this.getBanlance()+amount;
                System.out.println("存款者"+Thread.currentThread().getName()+"存入"+amount+"元，账户余额："+this.getBanlance());
                flag=true;
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
