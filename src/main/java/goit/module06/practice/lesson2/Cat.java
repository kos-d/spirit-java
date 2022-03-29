package goit.module06.practice.lesson2;

import java.io.Serializable;

public final class Cat extends Animal implements Serializable {
    
    private String color;
    // stateless class when all field final
    // or no field
    private final String breed = "test";     // порода
    
    public Cat() {}
    
    public Cat(String color) {
        this.color = color;
    }

   
    public String getColor() {
        return color;
    }
    // immutable 
   // delete setter 1 variant
//    public void setColor(String color) {
//        this.color = color;
//    }
    
    // 2 variant
    public void setColor(String color) {
        Cat cat = new Cat(color);
        //this.color = color;
    }
    
    
    @Override
    public String voice() {
        return "mur";
    }
}