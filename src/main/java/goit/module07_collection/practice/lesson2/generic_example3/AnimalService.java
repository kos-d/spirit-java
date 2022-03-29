package goit.module07_collection.practice.lesson2.generic_example3;

import java.util.ArrayList;
import java.util.List;

public interface AnimalService<K, V extends Animal> {
    
    V save(V value);
        
    V delete(K id);
    
    V findById(K id);
    
    // template method
    
    List<V> findAll();
    
    default List<Animal> findByName(String name) {
        List<V> animals = findAll();
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                result.add(animal);
            }
        }
        return result;
    }
}