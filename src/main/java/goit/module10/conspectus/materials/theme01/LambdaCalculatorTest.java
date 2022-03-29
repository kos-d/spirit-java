package goit.module10.conspectus.materials.theme01;

public class LambdaCalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum = calculator.calc(2, 3, (a, b) -> a + b);
        
        calculator.calc(2, 3, (int a, int b) -> {
            return a + b;
        });
        
        calculator.calc(2, 3, (a, b) -> {
            return a + b;
        });
        
//        calculator.calc(2, 3, (a, b) -> return a + b);
        
        int sub = calculator.calc(5, 4, (a, b) -> a - b);
        
        System.out.println(sum);
        System.out.println(sub);
    }
}