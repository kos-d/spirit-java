package module04.conspectus.video.lesson03;

public class Dog extends Animal {
    
    public void bark() {
        System.out.println("gav-gav");
    }
    
    public void eat() {
        super.eat();
        System.out.println("Eat as a dog");
    }
}