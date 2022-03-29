package goit.module05.practice.lesson1;

// Cat is a Animal
public class Cat extends Animal {
    
    @Override
    public String voice() {
        return "mur";
    }
    
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.voice();             // this voice
    }
}