package jvm;

/**
 * Created by wang on 2018/2/1.
 */
public class AnalyseTest {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            try{
                System.out.println(Thread.currentThread().getName()+System.currentTimeMillis());
                Thread.currentThread().sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
