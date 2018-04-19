package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by wang on 2018/2/23.
 */
public class InputDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("d:\\"+"person.txt"));
        Person person=(Person)objectInputStream.readObject();
        System.out.println(person.getName()+","+person.getAge());
    }
}
