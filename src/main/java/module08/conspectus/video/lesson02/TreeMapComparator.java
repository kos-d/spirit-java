package module08.conspectus.video.lesson02;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {
    
    public static void main(String[] args) {
        
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 < 02) {
                return -1;
            } else if (o1 > o2) {
                return 1;
            }
            return 0;
            }
        });
        treeMap.put(3, "val3");
        treeMap.put(2, "val2");
        treeMap.put(1, "val1");
        treeMap.put(5, "val5");
        treeMap.put(4, "val4");
        treeMap.put(7, "val7");
        treeMap.put(6, "val6");
        
        System.out.println(treeMap);
    }
}