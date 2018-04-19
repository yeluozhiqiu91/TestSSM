package jvm;

/**
 * Created by wang on 2018/2/1.
 */
public class TestAllocation {
    private static final int _1M=1024*1024;
    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[2*_1M];
        allocation2=new byte[2*_1M];
        allocation2=new byte[2*_1M];
        allocation2=new byte[4*_1M];
    }
}
