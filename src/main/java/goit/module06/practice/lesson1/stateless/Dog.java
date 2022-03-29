package goit.module06.practice.lesson1.stateless;

import java.io.Serializable;

public class Dog extends Animal implements Serializable, Cloneable{
    
    @Override
    public String voice() {
        return "gav";
    }
}