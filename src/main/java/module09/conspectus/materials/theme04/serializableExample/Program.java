package module09.conspectus.materials.theme04.serializableExample;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class Program {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
//            System.out.println("Person Output Stream");
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}