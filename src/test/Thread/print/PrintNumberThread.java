package Thread.print;

/**
 * Created by wang on 2018/1/19.
 */
public class PrintNumberThread implements Runnable{
    private Data data;
    public PrintNumberThread(Data data){
        this.data=data;
    }

    @Override
    public void run() {
        for(int i=0;i<78;i++){
            data.printNum(i);
        }
    }
}
