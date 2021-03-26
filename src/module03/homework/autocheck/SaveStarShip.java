package module03.homework.autocheck;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {
    /*
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }
     */
    public int calculateDistance(int distance) {
        return Math.abs(distance);
    }

    public String[] getPlanets(String galaxy) {
    String[] Miaru = new String[] {"Maux", "Reux", "Piax"};
    String[] Milkyway = new String[] {"Earth", "Mars", "Jupiter"};
    String[] DangerBanger = new String[] {"Fobius", "Demius"};
    String[] Unknown = new String[0];

        if(galaxy.equals("Miaru")) {
            //System.out.println(Arrays.toString(Miaru));
            return Miaru;
        } else if (galaxy.equals("Milkyway")) {
            return Milkyway;
            //System.out.println(Arrays.toString(Milkyway));
        } else if (galaxy.equals("DangerBanger")) {
            return DangerBanger;
            //System.out.println(Arrays.toString(DangerBanger));
        } else {
            return Unknown;
            //System.out.println(Arrays.toString(Unknown));
        }
    }
    /*
    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }
     */

    public String choosePlanet(long distanceToEarth) {
        String earth = "Earth";
        String pern = "Pern";
        if (distanceToEarth < 45677) {
            return earth;
        } else {
            return pern;
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 0;
        int fuelPrice = 0;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")){
            price = 200 ;
        } else {
            price = 50;
        }
        fuelPrice = count * price;
        return fuelPrice;
    }
    /*
    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    }
     */

    public int roundSpeed(int speed) {
        if (speed % 10 < 5) {
            while (speed % 10 != 0) {
                speed--;
            }
        } else {
            while (speed % 10 != 0) {
                speed++;
            }
        }
        return speed;
    }
    /*
    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }
    */
     public int calculateNeededFuel(int distance) {
         int netral = 1000;
         int overFuel = 5;

         if (distance <= 20) {
             return netral;
         } else {
             return ((distance - 20) * overFuel) + netral;
         }
     }
     /*
     public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }

        int extraDistance = distance - 1000;
        return 1000 + extraDistance * 5;
    }
      */
    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);

        float coefMin = 0.7f;
        float coefMidl = 1.2f;
        float coefMax = 2.1f;

        int firstEngine = scanner.nextInt();
        int secondEngine = scanner.nextInt();
        int thirdEngine = scanner.nextInt();

        int maxPowerEngine = Math.max(Math.max(firstEngine, secondEngine), thirdEngine);


        if (maxPowerEngine < 10) {
            float minPower = maxPowerEngine * coefMin;
            System.out.println(minPower);
        } else if (maxPowerEngine >= 10 && maxPowerEngine <= 100) {
            float midlPower = maxPowerEngine * coefMidl;
            System.out.println(midlPower);
        } else {
            float maxPower = maxPowerEngine * coefMax;
            System.out.println(maxPower);
        }
        scanner.close();
    }
    /*
    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();
    }
     */

    public String getMyPrizes(int ticket) {
        String prize = "";
        if (ticket % 10 == 0) {
            prize = "crystall";
        }
        if (ticket % 10 == 7) {
            prize = prize + " chip";
        }
        if (ticket > 200) {
            prize = prize + " coin";
        }
        return prize.trim();
    }
    public boolean isHangarOk(int side1, int side2, int price) {
        int square = side1 * side2;
        int longSide = Math.max(side1, side2);
        int shortSide = Math.min(side1, side2);
        int priceSquareMeter = price / square;

        if (square < 500) {
            return false;
        }
        if (longSide > shortSide * 2) {
            return false;
        }
        if (priceSquareMeter > 1000) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        SaveStarShip ship = new SaveStarShip();
        System.out.println(ship.calculateDistance(-10));
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")) );

        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
        System.out.println(Arrays.toString(ship.getPlanets("Unknown")));

        System.out.println(ship.choosePlanet(10));
        System.out.println(ship.choosePlanet(100000));

        System.out.println(ship.calculateFuelPrice("STAR100", 10));
        System.out.println(ship.calculateFuelPrice("STAR7", 5));

        System.out.println(ship.roundSpeed(55));

        System.out.println(ship.calculateNeededFuel(21));
        System.out.println(ship.calculateNeededFuel(25));

        //ship.calculateMaxPower();

        System.out.println(ship.getMyPrizes(250));

        System.out.println(ship.isHangarOk(100, 75, 1000000));

    }
}
