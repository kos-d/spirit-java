package goit.module03.practice.lesson2.methods_object;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Person[] persons = new Person[4];
        
        Person p1 = new Person();
        
        Person p3 = new Person("Igor", "Sidorov", 22);
        persons[2] = p3;
        
        Person p4 = new Person();
        persons[3] = p4;
        
        p1.setName("Ivan");
        p1.setSurname("Ivanov");
        p1.setAge(18);
        persons[0] = p1;
        
        Person p2 = new Person();
        p2.setName("Kolya");
        p2.setSurname("Petrov");
        p2.setAge(20);
        persons[1] = p2;
        
        System.out.println(Arrays.toString(persons));
        
//        Person p1 = new Person();
//        p1.name = "Ivan";
//        p1.surname = "Ivanov";
//        p1.age = 18;
//        persons[0] = p1;
//        
//        Person p2 = new Person();
//        p2.name = "Kolya";
//        p2.surname = "Petrov";
//        p2.age = 20;
//        persons[1] = p2;
//        
//        System.out.println(p2);
//        
//        System.out.println(Arrays.toString(persons));
        
        
        
//        Person p1 = new Person();
//        persons[0].name = "ivan";
//        persons[0].surname = "ivanov";
//        persons[0].age = 18;
//        
//        Person p2 = new Person();
//        persons[1].name = "kolya";
//        persons[1].surname = "petrov";
//        persons[1].age = 20;
        
        
//        Person p1 = new Person();
//        p1.name = "ivan";
//        p1.surname = "ivanov";
//        p1.age = 18;
        
        
//        String name = "ivan";
//        String surname = "ivanov";
//        int age = 18;
    }
}