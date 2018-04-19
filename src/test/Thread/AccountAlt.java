package Thread;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wang on 2018/1/19.
 */
public class AccountAlt {
    private final Lock lock=new ReentrantLock();
    private final Condition condition=lock.newCondition();
    private String accountNo;
    private double banlance;
    private boolean flag=false;//false代表账户没钱

    public AccountAlt(){

    }
    public AccountAlt(String accountNo, double banlance) {
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
    public  void draw(double amount){
        lock.lock();
        try{
            if(!flag){//如果账户没钱，就等着存款者存钱
                condition.await();
            }else{
                this.banlance=this.getBanlance()-amount;
                System.out.println("取款者"+Thread.currentThread().getName()+"取走"+amount+"元，账户余额："+this.getBanlance()+" 时间："+new Date());
                flag=false;
                condition.signalAll();//唤醒存款线程进行存款
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public  void deposit(double amount){
        lock.lock();
        try {
            if(flag){//如果有钱，等着取款者来取
                condition.await();
            }else{
                this.banlance=this.getBanlance()+amount;
                System.out.println("存款者"+Thread.currentThread().getName()+"存入"+amount+"元，账户余额："+this.getBanlance());
                flag=true;
                condition.signalAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
