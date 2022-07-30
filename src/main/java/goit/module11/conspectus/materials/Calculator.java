package goit.module11.conspectus.materials;

public class Calculator {
    public static int calc(int a, int b, Calculable calculable) {
        return calculable.calc(a, b);
    }
}
