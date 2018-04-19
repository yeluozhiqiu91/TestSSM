package se.stringdemo;

/**
 * Created by wang on 2018/1/31.
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        String integerCacheHighPropValue =
                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
        System.out.println(integerCacheHighPropValue);
        System.out.println(Integer.toString(3));
    }
}
