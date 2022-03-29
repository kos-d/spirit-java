package goit.module04.conspectus.video.lesson06;

public class Person {
    private int age;
    private String name;
    private String email;
    
    public Person(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Age: " + age + ", name: " + name + ", email: " + email;
    }
}