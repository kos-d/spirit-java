package goit.module08.practice.lesson1.collect.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp_2_Methods {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        
        map.put("vasya", 15);
        map.put("oleg", 12);
        
        map.put("vasya1", 14);
        /*
        if (map.containsKey("vasya")) {
        }
        if (map.get("vasya") != null) {
        }
        */
        
        boolean containsKey = map.containsKey("vasya");
        System.out.println("containsKey " + containsKey);
        
        boolean containsValue = map.containsValue(15);
        System.out.println("containsValue " + containsValue);
        
        Integer orDefault = map.getOrDefault("vasya1", 1_000_000);
        System.out.println("orDefault " + orDefault);
        
        Integer orDefault1 = map.getOrDefault("vasya2", 1_000_000);
        System.out.println("orDefault1 " + orDefault1);
        
        Integer get = map.get("vasya1");
        System.out.println("get " + get);
        
        boolean empty = map.isEmpty();
        System.out.println("empty " + empty);
        
        Integer put = map.put("igor", 20);
        System.out.println(map.toString());
        
        Map<String, Integer> map1 = new HashMap<>();
        
        map1.put("ira", 21);
        map1.put("nadya", 22);
        map1.put("lida", 23);
        
        System.out.println(map1.toString());
        
        map.putAll(map1);
        System.out.println(map.toString());
        
        Integer remove = map.remove("ira");
        System.out.println(map.toString());
        
        int size = map.size();
        System.out.println("size " + size);
        
        Collection<Integer> values = map.values();
        System.out.println("values " + values);
        
        Set<String> keySet = map.keySet();
        //Collection<String> keySet = map.keySet();
        System.out.println("keySet " + keySet);
        
        for (String name : map.keySet()) {
            System.out.println(map.get(name));
        }
        
        for (String value : map.keySet()) {
            System.out.println(value + " -> " + map.get(value));
        }
    }
}