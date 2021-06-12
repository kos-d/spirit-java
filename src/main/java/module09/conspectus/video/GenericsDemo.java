package module09.conspectus.video;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericsDemo {
    public static void main(String[] args) {
//        Set mySet = new TreeSet();
//        mySet.add(100L);
//        mySet.add("Hello");
//        mySet.add(123);
//        
//        System.out.println(mySet);
//        List<String> myList = new ArrayList<>();
//        //myList.add(123L);
//        myList.add("Hello");
//        System.out.println(myList);
//        
//        printElement(myList);
//        
//    }
//    private static void printElement(List<String> list) {
//            for (String element : list) {
//                System.out.println(element);
//            }
        final GenericTypeOld genericTypeOld = new GenericTypeOld();
        genericTypeOld.set("Hello");
//        genericTypeOld.set(100);
        
        final Object genericObject = genericTypeOld.get();
        
        if (genericObject instanceof String) {
           final String element = (String) genericTypeOld.get(); 
           System.out.println(element);
        } else if (genericObject instanceof Integer) {
            final Integer element = (Integer) genericTypeOld.get();
            System.out.println(element);
        }
        
        
        
        
    }
}