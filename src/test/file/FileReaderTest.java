package file;

import java.io.*;

/**
 * Created by wang on 2018/1/23.
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"test.txt");
        FileReader fileReader=new FileReader(file);
        File file2=new File("d:"+File.separator+"test2.txt");
        FileWriter fileWriter=new FileWriter(file2);
        long starttime=System.currentTimeMillis();
        /*int b=0;
        while ((b=fileReader.read())!=-1){
            fileWriter.write(b);
        }*/
        //下面一次读500个字符，相比上面一次读一个字符要快的多
        char[] c=new char[500];
        while (fileReader.read(c)!=-1){
            fileWriter.write(c);
        }
        long endtime=System.currentTimeMillis();
        System.out.println("总共用时："+(endtime-starttime)+"ms");
        fileReader.close();
        fileWriter.close();
    }
}
