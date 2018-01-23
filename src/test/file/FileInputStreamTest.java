package file;

import java.io.*;

/**
 * Created by wang on 2018/1/23.
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"back.jpg");
        FileInputStream fileInputStream=new FileInputStream(file);
        File file2=new File("d:"+File.separator+"back3.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream(file2);
        long starttime=System.currentTimeMillis();
        /*int b=0;
        while ((b=fileInputStream.read())!=-1){
            fileOutputStream.write(b);
        }*/
        //上面是一个字节一个字节读和写，下面是每512个字节读写一次，明显下面要快，上面要3964ms,而下面只要11ms
        byte[] bytes=new byte[512];
        while (fileInputStream.read(bytes)!=-1){
            fileOutputStream.write(bytes);
        }
        long endtime=System.currentTimeMillis();
        System.out.println("总共用时："+(endtime-starttime)+"ms");
    }
}
