package module07_collection.practice.lesson1.collect_array_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethods {
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");     
        
        int size = list1.size();
        System.out.println("size = " + size);
        
        String get1 = list1.get(0);
        String get2 = list1.get(1);
        
        System.out.println("get1, get2: " + get1 + ", " + get2);
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("c");
        list2.add("d");
        
        int size1 = list2.size();
        System.out.println("size1 = " + size1);
        
        boolean addAll = list1.addAll(1, list2);
        
        System.out.println("" + list1.toString());
        
        list2.clear();
        System.out.println("size after clear = " + size);
        
        Object clone = list1.clone();
        
        System.out.println("clone = " + clone);
        
        boolean contains = list1.contains("a");
        System.out.println("contains \"a\" = " + contains);
        
        boolean contains1 = list1.contains("k");
        System.out.println("contains \"k\" = " + contains1);
        
        int indexOf = list1.indexOf("d");
        System.out.println("indexOf = " + indexOf);
        
        /*
        // bad variant
        if (list1.size() == 0) {
            
        }
        */
        // good variant
        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 not empty");
        }
        /*
        
        //System.out.println("iterator.next() = " + iterator.next());
        //Iterator
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next -> " + next);
        }
        
        for (int i = 0; i < list1.size(); i++) {
            String get = list1.get(i);
            System.out.println("get -> " + get);
        }
        
        for (String str : list1) {
            System.out.println("str -> " + str);
        }
        
        list1.forEach((s) -> {
            System.out.println("s -> " + s);
        });

*/
        // method List
//        ListIterator<String> listIterator = list1.listIterator();
//        boolean hasPrevious = listIterator.hasPrevious();
//        String previous = listIterator.previous();
//        int previousIndex = listIterator.previousIndex();
//        
//        boolean hasNext = listIterator.hasNext();
//        //String next = listIterator.next();
//        int nextIndex = listIterator.nextIndex();
//        
//        String remove = list1.remove(1);
//        boolean remove1 = list1.remove("a");
//        boolean removeAll = list1.removeAll(list1);
        
        ArrayList<Integer> listInt = new ArrayList<>();
        
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        
        Integer set = listInt.set(1, 10);
        
//        System.out.println("set -> " + set);
//        
        System.out.println("listInt.toString() -> " + listInt.toString());
        System.out.println("listInt -> " + listInt);
        
        listInt.add(2, 12);
        System.out.println("listInt.add() -> " + listInt);
        
        List<Integer> subList = listInt.subList(0, 2);
        System.out.println("subList -> " + subList);
        
        //Object[] toArray0 = listInt.toArray();
        Integer[] toArray = listInt.toArray(new Integer[listInt.size()]);
        
        //------------------------------------------!!!
        
        List<Integer> newList = new ArrayList<>();
        
        //------------------------------------------!!!
        
        
//        for (int i = 0; i < listInt.size(); i++) {
//            if (listInt.get(i) % 2 == 0) {
//                listInt.remove(i);
//            }
//        }
//        
//        for (Integer el : listInt) {
//            
//        }
        //--------------------------------------------------------    
//        Iterator<Integer> iterator = listInt.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next % 2 == 0) {
//                iterator.remove();
//            }
//        }
//        System.out.println("listInt -> " + listInt.toString());
        
        
        
        
    }
}