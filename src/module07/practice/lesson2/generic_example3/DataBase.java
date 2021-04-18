package module07.practice.lesson2.generic_example3;

import java.util.ArrayList;
import java.util.List;

public class DataBase<K, V> {
    
    private K id;
    
    private V value;
    
    public V save(V value) {
        return value;
    }
    
    public V delete(K id) {
        return value;
    }
    
    public V findById(K id) {
        return value;
    }
    
    // templates method
    public List<V> findAll() {
        return new ArrayList<>();
    }
}