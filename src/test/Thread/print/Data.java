package Thread.print;

/**
 * Created by wang on 2018/1/19.
 */
public class Data {
    private static int count=1;
    private static String[] arr={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    public synchronized void printNum(int i){
        try{
            if(count%3==0){
                wait();
            }else{
                int temp=count/3;
                System.out.print(String.valueOf(i+1-temp));
                count++;
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public synchronized void printWord(int i){
        try{
            if(count%3!=0){
                wait();
            }else{
                System.out.print(arr[count/3-1]);
                count++;
                notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
