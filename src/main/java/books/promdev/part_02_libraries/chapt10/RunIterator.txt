package books.promdev.part_02_libraries.chapt10;

import books.promdev.part_02_libraries.chapt10.test1.Order;
import java.util.ArrayList;
import java.util.List;

public class RunIterator {
    public static void main(String[] args) {
        
        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
                add(new Order(240, 14.f));
            }
        };
        
        FindOrder fo = new FindOrder();
        List<Order> res = fo.findBiggerAmountOrder(10f, orders);
        System.out.println(res);
    }
}
