package module08.practice.lesson2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Collect {
    public static void main(String[] args) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(1, 1);      //add element
        map.replace(1, 2);
        
        System.out.println(map.toString());
        
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> element = iterator.next();
            Integer key = element.getKey();
            Integer value = element.getValue();
        }
    }
}