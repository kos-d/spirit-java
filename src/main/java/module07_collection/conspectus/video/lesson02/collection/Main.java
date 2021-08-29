package module07_collection.conspectus.video.lesson02.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        
        collection.add("First");
        collection.add("Second");
        collection.add("Third");
        System.out.println("Size before remove " + collection.size());
        display(collection);
        System.out.println("Size after remove " + collection.size());
        
    }
//    private static void display(Collection<String> collection) {
//        for (String element : collection) {
//            System.out.println(element);
//        }
//    }

    private static void display(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}