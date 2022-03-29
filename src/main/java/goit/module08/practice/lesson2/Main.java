package goit.module08.practice.lesson2;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

public class Main implements Serializable { // interface marker
    
    private String name;
    private Integer age;
    /*
    <dependencies>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.6</version>
        </dependency>
    </dependencies>
    */
    
    //example wild card
    public void test1(List<? extends Animal> list) {
        for (Animal animal : list) {
            //todo
        }
    }
        
    public static void main(String[] args) {
        
        Class<? extends Main> aClass1 = new Main().getClass();
        
        //Class<? extends Main> aClass2 = Main.class; //static
        
        
        Field[] declaredFields = aClass1.getDeclaredFields();
        
        for (Field field : declaredFields) {
            System.out.println(field.getName());
            
        }
    }
}