package goit.module05.homework.autocheck;

public class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        
            int sum = 0;
            for (int sampleValue : samples) {
                sum += sampleValue;
            }
            try {
            return sum / samples.length;
        } catch (ArithmeticException e) {
            return 0;
        }    
    }
}
class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));
        
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}