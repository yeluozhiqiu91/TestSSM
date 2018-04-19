package se.stringdemo;

import com.sun.glass.ui.Application;

/**
 * Created by wang on 2018/1/31.
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        String str1=new StringBuilder("se").append("ee").toString();
        System.out.println(str1.intern()==str1);
        String str2=new StringBuilder("ja").append("va").toString();//其实运行这条代码之前，常量池中就存在"java"字符串,其实"int","long"这些在常量池都存在
        System.out.println(str2.intern()==str2);
    }
}
