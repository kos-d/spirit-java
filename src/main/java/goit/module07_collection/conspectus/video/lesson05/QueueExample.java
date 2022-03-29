package goit.module07_collection.conspectus.video.lesson05;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    // Queue - FIFO FIrst in First out
    // список
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        Queue<String> queue = new PriorityQueue<>();
        queue.add("Alex");
        queue.add("Petro");
        queue.add("Andrew");
        queue.add("Oleh");
        
        queue.offer("Taras");
        
        System.out.println("Queue before changes: " + queue);
        
        String remove = queue.remove();
        
        System.out.println("Queue after remove: " + remove + " " + queue);
        
        String poll = queue.poll();
        
        System.out.println("After poll: " + poll + " " + queue);
        
        String element = queue.element();
        System.out.println("element " + element + " " + queue);
        
        String peek = queue.peek();
        
        System.out.println("peek " + peek + " " + queue);
    }
}