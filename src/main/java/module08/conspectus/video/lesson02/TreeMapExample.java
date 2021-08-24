package module08.conspectus.video.lesson02;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// binary tree
// red / black tree

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        treeMap.put(3, "val3");
        treeMap.put(2, "val2");
        treeMap.put(1, "val1");
        treeMap.put(5, "val5");
        treeMap.put(4, "val4");
        treeMap.put(7, "val7");
        treeMap.put(6, "val6");
        
        System.out.println(treeMap);
        
        SortedMap<Integer, String> headMap = treeMap.headMap(5, true);
        System.out.println("Head map " + headMap);
        
        SortedMap<Integer, String> tailMap = treeMap.tailMap(5, true);
        
        System.out.println("Tail map " + tailMap);
    }
}