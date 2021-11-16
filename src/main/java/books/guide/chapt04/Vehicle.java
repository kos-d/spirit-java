package books.guide.chapt04;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
    void range() {
        System.out.println("Distance - " + fuelcap * mpg + " mile.");
    }
}