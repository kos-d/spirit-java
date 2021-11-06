package books.promdev.part_02_libraries.chapt10;

import java.util.ArrayList;

public class Order implements Comparable<Order>{
    private int orderId;
    private float amount;
    
    public Order(int orderId, float amount) {
        super();
        this.orderId = orderId;
        this.amount = amount;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public float getAmount() {
        return amount;
    }
    
    @Override
    public int compareTo(Order ob) {
        return this.orderId - ob.orderId;
    }
    
    @Override
    public String toString() {
        return "Order [orderId = " + orderId + ", amount = " + amount + " ]" + '\n';
    }
}
