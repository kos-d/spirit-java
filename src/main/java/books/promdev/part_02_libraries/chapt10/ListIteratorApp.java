package books.promdev.part_02_libraries.chapt10;

import books.promdev.part_02_libraries.chapt10.test1.Order;
import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorApp {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        
        Iterator<Order> it = orders.iterator();
        orders.add(new Order(12, 12.1f));
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
