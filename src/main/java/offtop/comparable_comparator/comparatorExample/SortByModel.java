package offtop.comparable_comparator.comparatorExample;

import java.util.Comparator;

public class SortByModel implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getModel().compareTo(car2.getModel());
    }

}