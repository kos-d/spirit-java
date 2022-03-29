package goit.module05.practice.lesson2.factorymethod;

import java.io.Serializable;

public class Dog extends Animal implements Serializable, Cloneable{
    
    @Override
    public String voice() {
        return "gav";
    }
}