package Thread.print;

/**
 * Created by wang on 2018/1/19.
 */
public class PrintWordThread implements Runnable{
    private Data data;
    public PrintWordThread(Data data){
        this.data=data;
    }

    @Override
    public void run() {
        for(int i=0;i<78;i++){
            data.printWord(i);
        }
    }
}
