package goit.module08.conspectus.materials.theme04;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<>();
        
        salaries.put("Java", 5000);
        
        Integer get = salaries.get("Java");
        
        System.out.println(get);
        System.out.println(salaries);
    }
}