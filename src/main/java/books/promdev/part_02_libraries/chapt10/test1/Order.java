package books.promdev.part_02_libraries.chapt10.test1;

import books.promdev.part_02_libraries.chapt10.*;

public class Order {
    private int orderId;
    private float amount;
    
    public Order(int orderId, float amount) {
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
    public String toString() {
        return "Order [ orderId = " + orderId + ", amount = " + amount + " ]";
    }
}
