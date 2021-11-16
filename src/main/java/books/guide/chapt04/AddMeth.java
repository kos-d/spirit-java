package books.guide.chapt04;

public class AddMeth {
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
        
        System.out.print("Minivan can ride " + minivan.passengers + " passengers. ");
        
        minivan.range();
        System.out.print("Minivan can ride " + sportscar.passengers + " passengers. ");
        
        sportscar.range();
    }
}