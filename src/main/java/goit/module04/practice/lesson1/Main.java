package goit.module04.practice.lesson1;

public class Main {

//    public static String voice(Animal animal) {
//        //System.out.println(animal);
//        return animal.voice();
//    }
    public static void voice(Animal ... animals) {
        for (Animal animal : animals) {
            System.out.println(animal.voice());
        }
    }

    public static void main(String[] args) {

        Animal[] animals = new Animal[2];

        animals[0] = new Cat();
        animals[0].setName("Cubik");
        animals[0].move(2, 3);
        System.out.println(animals[0]);
        animals[0].move(1, 4);
        System.out.println(animals[0]);
        //voice(animals[0]);
        

        animals[1] = new Dog();
        animals[1].setName("Rubik");
        animals[1].move(5, 6);
        System.out.println(animals[1]);
        animals[1].move(7, 9);
        System.out.println(animals[1]);
        //voice(animals[1]);
        voice(animals);

        
//        Animal animal1 = new Cat();
//        animal1.setName("Cubik");
//        animal1.move(2, 3);        
//        System.out.println(animal1);
//        animal1.move(1, 4);
//        System.out.println(animal1);
//        
//        String voiceCat = voice(animal1);
//        System.out.println(voiceCat);
//        
//        
//        Animal animal2 = new Dog();
//        animal2.setName("Rubik");
//        animal2.move(5, 6);
//        System.out.println(animal2);
//        animal2.move(7, 9);
//        System.out.println(animal2);
//        
//        String voiceDog = voice(animal2);
//        System.out.println(voiceDog);
//===========================================================        
//        Cat cat = new Cat();
//        cat.setName("Cubik");
//        cat.move(2, 3);        
//        System.out.println(cat);
//        cat.move(1, 4);
//        System.out.println(cat);
//        System.out.println(cat.voice());
//        Dog dog = new Dog();
//        dog.setName("Rubik");
//        dog.move(5, 6);
//        System.out.println(dog);
//        dog.move(7, 9);
//        System.out.println(dog);
//        System.out.println(dog.voice());
    }
}
