package offtop.comparable_comparator.comparableExample;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        
        List<Car> list = new ArrayList<>();
        list.add(new Car("vw", 1990));
        list.add(new Car("renault", 2020));
        list.add(new Car("volvo", 1850));
        list.add(new Car("mers", 2002));
        list.add(new Car("lada", 2015));
        
        Collections.sort(list);
        
        for (Car car: list) {
            System.out.println(car.getModel() + " | " + car.getYear());
        }
        
        System.out.println(list);
    }
}