package goit.module04.homework.autocheck;

public class SpaceshipCalc {
    final int calculateAirBalloons(int passengerCount) {
        int countBalloons = 10;
        int result = countBalloons * passengerCount;
        return result;
    }
    int calculateBookCount(int passengerCount) {
        int countBooks = 2;
        int result = countBooks * passengerCount;
        return result;
    }

    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(35));
        System.out.println(calc.calculateBookCount(50));
    }
}