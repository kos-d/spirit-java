package goit.module08.conspectus.materials.theme03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bill");
        names.add("Smit");
        
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
    }
}