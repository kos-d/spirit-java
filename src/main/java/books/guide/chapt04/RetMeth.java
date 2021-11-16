package books.guide.chapt04;

public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        
        int range1, range2;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        
//        range1 = minivan.range();
//        range2 = sportscar.range();
        
        System.out.println("Minivan can ride " + minivan.passengers + " passenger on length " + minivan.range() + " mile");
        System.out.println("Minivan can ride " + sportscar.passengers + " passenger on length " + sportscar.range() + " mile");
        
        if (minivan.range() > sportscar.range()) {
            System.out.println("minivan > sportscar");
        }
    }
}