package goit.module08.conspectus.video.lesson01;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> linkedMap = new LinkedHashMap<>();
        
        linkedMap.put("test1", "value1");
        linkedMap.put("test2", "value2");
        linkedMap.put("test3", "value3");
        
        System.out.println(linkedMap);
    }
}