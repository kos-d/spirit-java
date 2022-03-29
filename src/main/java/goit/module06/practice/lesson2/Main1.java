package goit.module06.practice.lesson2;

import java.io.Serializable;

public class Main1 implements Serializable, Cloneable { // WriteIO, ReadIO, 

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat();
        animal[1] = new Cat();
        animal[2] = new Dog();
        filterByColor(animal);
        filterByColor(new Cat());
        filterByColor(new Dog());
        
        Test1 test1 = new Test1();
        test1.test(new Main1());
        test1.test(new Cat());
    }
    
    public static void filterByColor(Animal ... a) {
        //todo
    }

//    @Override
//    public void write(Object obj) {
//        //todo
//    }
//
//    @Override
//    public Object read() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}