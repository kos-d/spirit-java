package module09_io.conspectus.materials.theme04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import module09_io.conspectus.materials.theme04.serializableExample.Person;

public class Program {
    public static void main(String[] args) {
        
        String filename = "people.dat";
        
        ArrayList<Person> people = new ArrayList<>();
        
        people.add(new Person("Tom", 30, 175, false));
        people.add(new Person("Sam", 33, 178, true));
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(people);;
            System.out.println("File has been writen");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        ArrayList<Person> newPeople = new ArrayList<Person>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            newPeople = (ArrayList<Person>) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        for (Person p : newPeople) {
//            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
            System.out.printf("Name: %s \t Age: %d \t Height: %.2f \n ", p.getName(), p.getAge(), p.getHeight());
        }
    }
}