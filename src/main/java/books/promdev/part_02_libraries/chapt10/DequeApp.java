package books.promdev.part_02_libraries.chapt10;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> db = new LinkedList<>();
        
        db.add("Java");
        db.add("Hello");
        
        db.addFirst("Test");
        db.addLast("Last");
        
        System.out.println(db);
    }
}
