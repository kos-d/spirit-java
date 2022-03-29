package goit.module07_collection.conspectus.video.lesson03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // time complexity
        
        // получение элемента по индексу - O(1)
        
        // добавление элемента в конец - O(1)
        // добавление элемента в конец с перестраиванием массива - O(n)
        // добавление элемента в начало - O(n)
        // добавление элемента в середину - O(n)
        
        // удаление элемента - O(n)
        
        
        List<String> list = new ArrayList<>();
        
        list.add("First");
        list.add("Second");
        list.add("Third");
        display(list);
        
        System.out.println("------------");
//        for (String element : list) {
//            System.out.println(element);
//        }
        list.add(2, "Fifth");
        
//        list.trimToSize();
        
        display(list);

        System.out.println("------------");

        Collections.sort(list);
        
        display(list);
        
//        String toString = list.toString();        
//        System.out.println(toString);
        
        
//        int size = list.size();
//        System.out.println(size);


        boolean empty = list.isEmpty();
        System.out.println(empty);
        
        list.get(1);
        
        List<String> subList = list.subList(1, 3);
    }
    
    private static void display(List list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}