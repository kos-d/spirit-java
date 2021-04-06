package module05.practice.lesson2.fabricmethod;

public class FactoryMain {
    public static void main(String[] args) {
        
        Animal animal = Animal.of();
        
//        if (Resources.ANIMAL.equalsIgnoreCase("CAT")) {
//            animal = new Cat();
//        } else animal = new Dog();
        
        System.out.println(animal.voice());
     
//        for (Animal animal : animals) {
//            System.out.println("animal " + animal.voice());
//        }
    }
    public static void test(Animal animal) {
        //todo
    }
}
/*
        Animal[] animals = new Animal[2];
        
        if (Resources.ANIMAL.equalsIgnoreCase("CAT")) {
            animals[0] = new Cat();
        } else animals[0] = new Dog();
        */