package module08.conspectus.materials.theme04;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new LinkedHashMap<>();
        salaries.put("Java", 5500);
        
        Integer get = salaries.get("Java");
        
        System.out.println(get);
    }
}