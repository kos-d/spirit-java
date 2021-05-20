package module08.practice.lesson1.collect.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();        
        map.put("vasya", 15);
        map.put("oleg", 12);
        
        Set<String> set = new HashSet<>();
        
        set.add("Hello");
        System.out.println("" + set.toString());
        int size = set.size();
        System.out.println("size " + size);
        
        boolean contains = set.contains("Hello");
        System.out.println("contains " + contains);
        
        
    }
}