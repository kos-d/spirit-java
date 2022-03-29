package goit.module07_collection.conspectus.video.lesson05;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DequeExample {
    public static void main(String[] args) {
        // Deque - FILO FIrst in Last out 
        // двунаправленная очередь\список
        
        Deque<String> deque = new LinkedList<>();
        
        deque.add("Alex");
        deque.add("Petro");
        deque.add("Andrew");
        deque.add("Oleh");
        
        deque.offer("Taras");
        
        System.out.println("Deque before changes: " + deque);
        
        deque.addFirst("Roger");
        deque.addLast("Kim");
        
        System.out.println("Deque after changes: " + deque);
        
        
    }
}