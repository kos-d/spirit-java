package goit.module05.conspectus.materials.theme01;

public class Person {
    public Person(String name) {
        System.out.println("Name is " + name);
    }
    
    public Person(String firstName, String lastName) {
        System.out.println("First name is " + firstName + ", last name is " + lastName);
    }
    
    public static void main(String[] args) {
        new Person("Elon");
        new Person("Elon", "Musk");
    }
}