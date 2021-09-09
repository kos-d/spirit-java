package books.promdev.chapt01.serializable_test;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private double height;
    private boolean married;
    
    public Person(String n, int a, double h, boolean m) {        
        this.name = n;
        this.age = a;
        this.height = h;
        this.married = m;
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