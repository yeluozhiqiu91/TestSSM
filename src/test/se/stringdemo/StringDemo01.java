package se.stringdemo;

/**
 * Created by wang on 2018/1/30.
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String a=new String("");
        String b=new String("bbb");
        String c=new String(new char[]{'c','d','2'});
        String d=new String("bbb");
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.hashCode());
        System.out.println(c);
        System.out.println(a.isEmpty());
        System.out.println(c.charAt(0));
        System.out.println(c.codePointAt(1));//好像是ascii码值
        System.out.println(b.equals(d));
    }
}
