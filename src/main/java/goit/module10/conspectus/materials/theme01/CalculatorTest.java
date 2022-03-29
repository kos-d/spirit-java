package goit.module10.conspectus.materials.theme01;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum = calculator.calc(2, 3, new Calculable() {
            public int calc(int a, int b) {
                return a + b;
            }
        });
        
        int sub = calculator.calc(5, 4, new Calculable() {
            public int calc(int a, int b) {
                return a - b;
            }
        });
        
        System.out.println(sum);
        System.out.println(sub);
    }
}