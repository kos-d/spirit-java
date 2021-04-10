package module06.practice.lesson2;

import java.io.Serializable;

public class Dog extends Animal implements Serializable, Cloneable{
    
    @Override
    public String voice() {
        return "gav";
    }
}