/**
 * Created by wang on 2018/1/17.
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:"+classLoader);              //current loader:sun.misc.Launcher$AppClassLoader@b4aac2
        System.out.println("parent loader:"+classLoader.getParent());   //parent loader:sun.misc.Launcher$ExtClassLoader@99a589
        System.out.println("grandparent loader:"+classLoader.getParent().getParent()); //根装载器这个是c++写的，看不到，所以是null
    }
}
