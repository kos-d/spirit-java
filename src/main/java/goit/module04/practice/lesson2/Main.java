package goit.module04.practice.lesson2;

public class Main {

    public static void voice(Animal ... animals) {
        for (Animal animal : animals) {
            System.out.println(animal.voice());
            // Template Method
            System.out.println(animal.templateMethod());
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
        
        //=========================================
        // pattern
        //information expert
        
        Animal dog = new Dog();
        dog.voice();
        
        //non correct 
        int currentX = dog.getX();
        dog.setX(currentX + 2);
        
         //correct 
        dog.move(2, 0);
        
        //=========================================
        
        
//        Animal a1 = new Animal() {
//            @Override
//            public String voice() {
//                return "custom voice";
//            }
//        };
        
    }
}
