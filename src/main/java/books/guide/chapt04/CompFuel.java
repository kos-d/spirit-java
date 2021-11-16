package books.guide.chapt04;

public class CompFuel {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("For distance " + dist + " miles minivan needed " + gallons + " gallons fuel");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("For distance " + dist + " miles sportscar needed " + gallons + " gallons fuel");

        System.out.println("Minivan can ride " + minivan.passengers + " passenger on length " + minivan.range() + " mile");
        System.out.println("Minivan can ride " + sportscar.passengers + " passenger on length " + sportscar.range() + " mile");
    }
}
