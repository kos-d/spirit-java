package books.promdev.part_02_libraries.chapt10.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>(3) {
            {
                this.put("Chees", 3);
                this.put("Cake", 5);
                this.put("Milk",1);
                this.put("Bred", 1);
            }
        };
        System.out.println(hm);
        
        if (!hm.containsKey("Cake")) {
            hm.put("Cake", 4);
        }
        System.out.println(hm + " after change element");
        Integer a = hm.get("Bred");
        System.out.println(a + " find for key 'Bred'");
        Set<Map.Entry<String, Integer>> setv = hm.entrySet();
        System.out.println(setv);
        Iterator<Map.Entry<String, Integer>> i = setv.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> me = i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        Set<Integer> val = new HashSet<Integer>(hm.values());
        System.out.println(val);
    }
}