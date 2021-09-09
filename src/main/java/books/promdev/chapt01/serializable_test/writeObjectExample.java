package books.promdev.chapt01.serializable_test;


import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeObjectExample {

    public static void main(String[] args) {
//        Integer num;
//        String str;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) 
        {
            Person p = new Person("Tom", 35, 179, true);
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

