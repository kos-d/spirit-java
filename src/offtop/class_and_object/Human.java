package offtop.class_and_object;

public class Human {

    String name;
    int age;
    String city;
    String education;
    String goal;

    public void speak() {
        System.out.println("Hello, my name is "+ name);
        System.out.println("I am "+ age + " years old");
        System.out.println("I live in the city of " + city);
        System.out.println("My education is a "+ education);
        System.out.println("My goal "+ goal);
    }
}
