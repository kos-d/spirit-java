package books.promdev.part_02_libraries.chapt10.test2;

import books.promdev.part_02_libraries.chapt10.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Order implements Iterable<Item>{
    private int orderId;
    private List<Item> listItems;
    
    public Order(int orderId, List<Item> listItems) {
        this.orderId = orderId;
        this.listItems = listItems;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public List<Item> getListItems() {
        return Collections.unmodifiableList(listItems);
    }
    
    public boolean add(Item e) {
        return listItems.add(e);
    }
    
    public Item get(int index) {
        return listItems.get(index);
    }
    
    public Item remove(int index) {
        return listItems.remove(index);
    }
    
    @Override
    public Iterator<Item> iterator() {
        return listItems.iterator();
    }
    
    
//    @Override
//    public String toString() {
//        return "Order [ orderId = " + orderId + ", amount = " + amount + " ]";
//    }
}
