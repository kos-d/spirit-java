package offtop.comparable_comparator.comparatorExample;

import java.util.Comparator;

public class SortByYear implements Comparator<Car> {
    
    @Override
    public int compare(Car car1, Car car2) {        
        
        if (car1.getYear() < car2.getYear()) {
            return -1;
        }
        
        if (car1.getYear() == car2.getYear()) {
            return 0;
        }
        
        return 1;
    }
}