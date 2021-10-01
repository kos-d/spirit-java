package books.promdev.part_01_core.chapt01.serializable_test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectExample {

    public static void main(String[] args) {
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person p=(Person)ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        } catch(IOException | ClassNotFoundException ex){             
            System.out.println(ex.getMessage());
        } 
    } 
}