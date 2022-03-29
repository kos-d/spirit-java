package goit.module08.conspectus.materials.theme03;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
//        Set<Integer> numbers = new HashSet<>();
//        numbers.add(100);
//        numbers.add(100);
//        numbers.add(102);
//
//        System.out.println(numbers.size());
//        System.out.println(numbers);
//        System.out.println();
        
        String[] allNames = {"John Dou", "Elon Musk", "John Bew", "Bill Cory", "Bill Elot"};
        Set<String> uniqueNames = new HashSet<>();
        
        for (String name : allNames) {
            uniqueNames.add(name);
        }
        
        for (String name : uniqueNames) {
            System.out.println(name);
        }
        
        Set<Integer> prices = new HashSet<>();
        prices.add(99);
        
        boolean contains = prices.contains(0);
        boolean contains1 = prices.contains(99);
        System.out.println(contains);
        System.out.println(contains1);
    }
}