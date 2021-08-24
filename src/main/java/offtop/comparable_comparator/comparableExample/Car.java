package offtop.comparable_comparator.comparableExample;

public class Car implements Comparable<Car>{
    private String model;
    private int year;
    
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setAge(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car {" + 
                "model" + model + 
                ", year " + year +
                '}';
    }

//    @Override
//    public int compareTo(Car car) {
//        
//        if (year == car.getYear()) {
//            return 0;
//        }
//        if (year < car.getYear()) {
//            return -1;
//        }
//        return 1;
//    }
    
    @Override
    public int compareTo(Car car) {
        return model.compareTo(car.getModel());
    }
}