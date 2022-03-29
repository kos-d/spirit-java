package goit.module05.practice.lesson2.factorymethod;

public class Main1 {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        
        Dog dog1 = new Dog();
        
        //Animal cat2 = new Cat();
        test(cat1);
        test(dog1);
        
        
        Animal animal = Animal.of();
        
        //System.out.println(animal.voice());
    }
    
    public static void test(Animal animal) {
        //todo
        System.out.println(animal.voice());
    }
}