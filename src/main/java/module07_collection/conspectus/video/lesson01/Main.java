package module07_collection.conspectus.video.lesson01;

public class Main {
    public static void main(String[] args) {
        Volvo car = new Volvo();
        car.drive();
        car.transmissionType();
        
        Car car1 = new Mersedes();
        car1.drive();
        
        Animal dog = new Dog();
        dog.sleep();
        dog.animalSound();
    }
}