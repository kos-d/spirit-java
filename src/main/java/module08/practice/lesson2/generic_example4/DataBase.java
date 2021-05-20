package module08.practice.lesson2.generic_example4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase<V> {
    
    private Map<Long, V> map = new HashMap<>();
    
    private static Long id = 0L;
    
//    private K id;
//    
//    private V value;
    
    public long save(V value) {
        map.put(id++, value);
        return id-1;
    }
    
    public V delete(Long id) {
        return map.remove(id);
    }
    
    public V findById(Long id) {
        return map.get(id);
    }
    
    // templates method
    public Collection<V> findAll() {
        return map.values();
    }
}