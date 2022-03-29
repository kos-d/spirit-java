package goit.module09_io.conspectus.materials.theme04.serializableExample;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private transient double height;
    private transient boolean married;
    
    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getHeight() {
        return height;
    }
    
    public boolean getMarried() {
        return married;
    }
}