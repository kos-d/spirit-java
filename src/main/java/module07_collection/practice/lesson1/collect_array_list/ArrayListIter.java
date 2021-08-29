package module07_collection.practice.lesson1.collect_array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIter {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        
        System.out.println("" + list.toString());
    }
 
}