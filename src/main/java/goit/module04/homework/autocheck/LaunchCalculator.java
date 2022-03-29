package goit.module04.homework.autocheck;

public class LaunchCalculator {
    public int calculateTotalPrice(Spaceport_test spaceportTest, int passengerCount) {
        return spaceportTest.calculateTotalPrice(passengerCount);
    }
    public static void main(String[] args) {
        LaunchCalculator calculator = new LaunchCalculator();

        int jupiterStarPrice = calculator.calculateTotalPrice(new JupiterStar(), 100);
        System.out.println("JupiterStar price = " + jupiterStarPrice);

        int mercuryBeatPrice = calculator.calculateTotalPrice(new MercuryBeat(), 100);
        System.out.println("MercuryBeat price = " + mercuryBeatPrice);

        int sunHeavenPrice = calculator.calculateTotalPrice(new SunHeaven(), 100);
        System.out.println("SunHeaven price = " + sunHeavenPrice);
    }
}
abstract class Spaceport_test {
    public abstract int calculateTotalPrice(int passengerCount);
}
class JupiterStar extends Spaceport_test {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        int fixPrice = 500;
        int overPrice = 2;
        int resultPrice = fixPrice + passengerCount * overPrice;
        return resultPrice;
    }
}
class MercuryBeat extends Spaceport_test {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        int overPrice = 15;
        int resultPrice = passengerCount * overPrice;
        return resultPrice;
    }
}
class SunHeaven extends Spaceport_test {
    @Override
    public int calculateTotalPrice(int passengerCount) {
        int fixPrice = 2000;
        int resultPrice = fixPrice;
        return resultPrice;
    }
}
