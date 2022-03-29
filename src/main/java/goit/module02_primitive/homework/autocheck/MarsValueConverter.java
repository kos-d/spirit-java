package goit.module02_primitive.homework.autocheck;

public class MarsValueConverter {

    public int changeMoneyAmount(float startAmount, float toRemove) {
       return (int) (startAmount - toRemove);
    }
    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }
    public short halfOfMoney(double startMoney) {
        return (short) (startMoney * 0.5);
    }
    public static void main(String[] args) {
        MarsValueConverter converter = new MarsValueConverter();

        System.out.println("changeMoneyAmount(100f, 40.5f) = " + converter.changeMoneyAmount(100f, 40.5f));
        System.out.println("calculateMoneySum(50, 40) = " + converter.calculateMoneySum(50, 40));
        System.out.println("halfOfMoney(1000.9999) = " + converter.halfOfMoney(1000.9999));
    }
}
