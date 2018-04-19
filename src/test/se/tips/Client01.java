package se.tips;

/**
 * Created by wang on 2018/1/30.
 * 字母L作为长整型标志时务必大写，免得将1l看成了11,还有字母O也要添加注释
 */
public class Client01 {
    public static void main(String[] args) {
        long i=1L;
        System.out.println("i的两倍是："+(i+i));
    }
}
