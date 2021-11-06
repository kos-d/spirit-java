package books.promdev.part_02_libraries.chapt10.test3;

import books.promdev.part_02_libraries.chapt10.*;
import java.util.ArrayList;

public class Order extends ArrayList<Item>{
    private int orderId;
    
    public Order(ArrayList<Item> c) {
        super(c);
    }
    
    public Order(int orderId, ArrayList<? extends Item> c) {
        super(c);
        this.orderId = orderId;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
//    @Override
//    public String toString() {
//        return "Order [ orderId = " + orderId + ", amount = " + amount + " ]";
//    }
}
