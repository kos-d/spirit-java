package goit.module04.conspectus.materials.theme05;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle.getName());
        
        Animal dog = new Dog();
        dog.printName();
    }
}