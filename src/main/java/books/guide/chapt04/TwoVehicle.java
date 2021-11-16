package books.guide.chapt04;

public class TwoVehicle {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        Vehicle sedan;
        sedan = new Vehicle();
        
        int range1, range2;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        
        System.out.println("Minivan can ride " + minivan.passengers + " passenger on length " + range1 + " mile");
        System.out.println("Minivan can ride " + sportscar.passengers + " passenger on length " + range2 + " mile");
    }
}