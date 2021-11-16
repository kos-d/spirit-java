package books.guide.chapt04;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Mini furgon can ride " + minivan.passengers + " passenger on length " + range + " mile");
    }
}