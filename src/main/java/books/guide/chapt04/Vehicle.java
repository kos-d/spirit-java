package books.guide.chapt04;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
    int range() {
        return mpg * fuelcap;
    }
    
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}