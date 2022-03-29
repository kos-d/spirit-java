package goit.module05.conspectus.materials.theme03;

public class Garden {
    {
        class Plant {
            private String name;
            
            public Plant(String name) {
                this. name = name;
            }
            public void plant() {
                System.out.println("Plant " + name);
            }
        }
        new Plant("apple");
        new Plant("watermelon");
    }
}