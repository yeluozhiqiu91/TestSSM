package jvm;

/**
 * Created by wang on 2018/1/27.
 */
class Tester{
    static {
        System.out.println("Tester 初始化");
    }
}
public class TestLoad {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println("加载类，但未初始化：");
        classLoader.loadClass("jvm.Tester");

        Class.forName("jvm.Tester");
    }
}
