package serialize;

import java.io.*;

/**
 * Created by wang on 2018/2/23.
 */
public class OutputDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("d:\\"+"person.txt"));
        Person person=new Person("张wang",26);
        objectOutputStream.writeObject(person);
    }
}
