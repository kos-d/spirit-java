package books.promdev.part_01_core.chapt01.serializable_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteReadObjectExample {
    public static void main(String[] args) {
        
        String fileName = "people.dat";
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 30, 175, false));
        people.add(new Person("Sam", 33, 178, true));
        
        // Serializable
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(people);
            System.out.println("File has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Deserializable
        ArrayList<Person> newPeople = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            newPeople = ((ArrayList<Person>)ois.readObject());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } 
        
        for (Person p : newPeople) {
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
    }
}