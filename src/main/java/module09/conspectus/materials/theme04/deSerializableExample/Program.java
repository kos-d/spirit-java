package module09.conspectus.materials.theme04.deSerializableExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import module09.conspectus.materials.theme04.serializableExample.Person;

public class Program {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person p = (Person) ois.readObject();
//            System.out.println("test");
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}