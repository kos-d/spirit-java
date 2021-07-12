package module07.conspectus.video.lesson04;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        List<String> classB = new LinkedList<>();
        classB.add("Alex");
        classB.add("Oleh");        
                
        List<String> classA = new LinkedList<>();
        classA.add("Ivan");
        classA.add(0, "Petro");
        
        classA.addAll(0, classB);
        System.out.println(classA);
        
        boolean containsTrue = classA.contains("Ivan");
        boolean containsFalse = classA.contains("ivan");
        
        System.out.println("Ivan " + containsTrue);
        System.out.println("ivan " + containsFalse);
        
        classA.remove("Ivan");
        classA.remove(0);
        
        containsTrue = classA.contains("Ivan");
        System.out.println("Ivan " + containsTrue);
        
        System.out.println(classA);
        
        classA.add("Alex");
        System.out.println(classA);
        
        int lastIndexOf = classA.lastIndexOf("Alex");
        System.out.println(lastIndexOf);
    }
}