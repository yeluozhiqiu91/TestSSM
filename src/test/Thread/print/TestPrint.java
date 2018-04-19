package Thread.print;

/**
 * Created by wang on 2018/1/19.
 */
public class TestPrint {
    public static void main(String[] args) {
        Data data=new Data();
        new Thread(new PrintNumberThread(data)).start();
        new Thread(new PrintWordThread(data)).start();
    }
}
