package goit.module08.practice.lesson2.generic_example4;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public interface AnimalService<V extends Animal> {
    
    Long save(V value);
        
    V delete(Long id);
    
    V findById(Long id);
    
    // template method
    
    Collection<V> findAll();
    
//    default List<Animal> findByName(String name) {
//        List<V> animals = findAll();
//        List<Animal> result = new ArrayList<>();
//        for (Animal animal : animals) {
//            if (animal.getName().equals(name)) {
//                result.add(animal);
//            }
//        }
//        return result;
//    }
}