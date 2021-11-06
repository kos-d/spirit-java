package books.promdev.part_02_libraries.chapt10;

import books.promdev.part_02_libraries.chapt10.test1.Order;
import java.util.LinkedList;
import java.util.Queue;

public class OrderQueueAction {
    public static void main(String[] args) {
        LinkedList<Order> orders = new LinkedList<Order>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
            }
        };
        Queue<Order> queueA = orders;
        queueA.offer(new Order(222, 9.7f));
        orderProcessing(queueA);
        if (queueA.isEmpty()) {
            System.out.println("Queue of Orders is empty");
        }
    }
    
    public static void orderProcessing(Queue<Order> queue) {
        Order ob = null;
        
        while ((ob = queue.poll()) != null) {
            System.out.println("Order #" + ob.getOrderId() + " is processing");
        }
    }
}
