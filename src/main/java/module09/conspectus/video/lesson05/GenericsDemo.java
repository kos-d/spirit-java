package module09.conspectus.video.lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericTypeOld genericTypeOld = new GenericTypeOld();
        genericTypeOld.set("Hello");
        genericTypeOld.set(123);
        
        Object genericObject = genericTypeOld.get();
        
        if (genericObject instanceof String) {
            String element = (String) genericTypeOld.get();
            System.out.println(element);
        } else if (genericObject instanceof Integer){
            Integer element = (Integer) genericObject;
                System.out.println(element);
        }
        
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add(100L);
//        list.add(123);

//        System.out.println(list);

//        printElement(list);

//        Set uniqueSet = new TreeSet();
//        uniqueSet.add(100L);
//        uniqueSet.add("Hello");
//        uniqueSet.add(123);
//        
//        System.out.println(uniqueSet);
    }

//    private static void printElement(List<String> list) {
//        for (String element : list) {
//            System.out.println(element);
//        }
//    }
}