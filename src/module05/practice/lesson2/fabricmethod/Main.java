package module05.practice.lesson2.fabricmethod;

public class Main {
   private String name;
    private String surname;
    private int age;
    
    //public Main() {}
    public Main(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

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
              
        Animal a1 = new Cat();

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
