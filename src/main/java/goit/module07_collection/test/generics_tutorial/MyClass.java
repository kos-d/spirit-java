package goit.module07_collection.test.generics_tutorial;

import java.util.HashMap;

public class MyClass<T, V> {

    T ob;
    V ob2;
    
    HashMap<T, V> map = new HashMap<>();
    
    MyClass(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }
    
    void showType() {
        System.out.println("type generic = " + ob.getClass().getName());
        System.out.println("type generic = " + ob2.getClass().getName());
    }
}