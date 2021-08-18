package module08.conspectus.video.lesson01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    
    // Вставка - O(1) O(n)
    // Поиск - O(1) O(n)
    // Удаление - O(1) O(n)
    
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        
        // добавление элемента, add element
        
        capitals.put("Germany", "Berlin");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("Spain", "Madrid");
        
        System.out.println(capitals);
        
        // получение по ключу / search from key
        
        String germany = capitals.get("Germany");
        
        System.out.println("Germany capital is " + germany);
        
        // удаление элемента / delete element key
        String remove = capitals.remove("Germany");
        
        System.out.println("Remove " + remove);
        System.out.println(capitals);
        
        //capitals.clear();
        //System.out.println(capitals);
        
        System.out.println("Size " + capitals.size());
        
        
        // вывод ключей
        Set<String> keySet = capitals.keySet();
        System.out.println(keySet);
        
        Collection<String> values = capitals.values();
        System.out.println(values);
        
        Set<Map.Entry<String, String>> entries = capitals.entrySet();
        
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Entries");
            System.out.println("Key " + entry.getKey());
            System.out.println("Value " + entry.getValue());
        }
    }
}