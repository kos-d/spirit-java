package offtop.uml_test;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", 30);
        Person person2 = new Person("Eva", 25);
        Person person3 = new Person("Eva", 25);
        
        String toString = person1.toString();
        String toString1 = person2.toString();
        
        System.out.println(toString);
        System.out.println(toString1);
        
        boolean equals = person1.equals(null);
        System.out.println("equals: " + equals);
        
        boolean name = person1 == null;
        System.out.println("name: " + name);
        
        boolean equals1 = person1.equals(person2);
        System.out.println("equals1: " + equals1);
        
        boolean equals2 = person2.equals(person3);
        System.out.println("equals2: " + equals2);
    }
}