package goit.module03.practice.lesson2.methods_object;

public class Person {
    
    private String test;
    private String name;
    private String surname;
    private int age;
    
    public Person() {
        test = "default";
    }

    public Person(String name, String surname, int age) {
        this();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getTest() {
        return test;
    }
    public void setTest(String test) {
        this.test = test;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name=" + 
                name + ", surname=" + 
                surname + ", age=" + 
                age + '}';
    }
}