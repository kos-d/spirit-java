package module06.practice.lesson1;

import module05.practice.lesson2.interfaces.*;

public class Main {
    //============================================
    //default constructor
    public Main() {}
    
    public Main(String name) {
        this.name = name;
    }

    public Main(String name, int age) {
        this(name);
        //this.name = name;
        this.age = age;
    }
    //============================================
    
    private static String[] array;
    
    // block static initialisation
    static {
        if (true) {
            array = new String[3];
            array[0] = "a";
            array[1] = "b";
            array[2] = "c";
        } else {
            array = new String[2];
            array[0] = "a";
            array[1] = "b";
        }
    }
    //--------------------------------------------
    // block non static initialisation
        // work befor constructor
    {   
        System.out.println("");
    }
    //============================================    
    
    private String name;
    private String surname;
    private int age;
    
    public Main(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    public static Main of() {
        Main main = new Main();
        main.setName("name");
        return main;
    }
    //============================================ 
    // pattern Builder
    // (внутренний класс не статический) (вложенный класс статический )
    private static class Init {
        
        private String name;
        private String surname;
        private int age;
        
        public static Init builder() {
            return new Init();
        }
        
        public Main build() {
            return new Main(name, surname, age);
        }
        
        public Init name(String name) {
            this.name = name;
            return this;
        }
        public Init surname(String surname) {
            this.surname = surname;
            return this;
        }
        public Init age(int age) {
            this.age = age;
            return this;
        }
    }
        //============================================ 
    public static void main(String[] args) {
        //============================================ 
        // pattern Builder
        Main main = Main.Init.builder()
                .age(5)
                .surname("s")
                .name("n")
                .build();
        //============================================ 
        
        /*
        Animal cat = new Cat();
        Cat cat1 = (Cat) cat;   //cast
        */
        
        Animal a1 = new Cat();
        //============================================
        //anonymous class
//        Animal a2 = new Animal() {
//            @Override
//            protected String voice() {
//                return "voice from main";
//            }
//        };
        //============================================
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
       
        Animal dog = new Dog();
        dog.voice();
    }
    
    public static void voice(Animal ... animals) {
        for (Animal animal : animals) {
            System.out.println(animal.voice());
            // Template Method
            //System.out.println(animal.templateMethod());
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
