package goit.module11.conspectus.materials;

public class CalculatorTestLambda {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum = calculator.calc(2, 3, (a, b) -> a + b);
        
        int sub = calculator.calc(10, 3,(int a, int b) -> a - b);
        
        int multiply = calculator.calc(5, 5, new Calculable() {
        @Override
        public int calc(int a, int b) {
            return a * b;
        }
    });
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multiply);
        
        
        
    }
}
