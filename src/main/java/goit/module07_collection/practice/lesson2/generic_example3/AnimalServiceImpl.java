package goit.module07_collection.practice.lesson2.generic_example3;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimalServiceImpl<K, V extends Animal> implements AnimalService<K, V> {
    
    private DataBase<K, V> dataBase;

    @Override
    public V save(V value) {
        return dataBase.save(value);
    }

    @Override
    public V delete(K id) {
        return dataBase.delete(id);
    }

    @Override
    public V findById(K id) {
        return dataBase.findById(id);
    }
    
    // template method
    
    public List<V> findAll() {
        return dataBase.findAll();
    }
    
    // template method (incapsulation)
    /*
        protected List<Animal> findByName(String name) {
        List<V> animals = findAll();
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                result.add(animal);
            }
        }
        return result;
    }
    */

}