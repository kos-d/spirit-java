package module08.conspectus.materials.theme04;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        
        treeMap.put("Hello", 10);
        treeMap.put("World", 20);
        Integer get = treeMap.get("Hello");
        
        System.out.println(get);
        
        Set<String> keySet = treeMap.keySet();
        System.out.println(keySet);
        
        Collection<Integer> values = treeMap.values();
        System.out.println(values);
        
    }
}