package module03.homework.autocheck;


import java.util.Arrays;
import java.lang.Math;
public class QuadraticEquationSolver {
    public double[] solve(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        double squareOfDiscriminant = Math.sqrt(discriminant);
        double[] result = new double[] {};
        if (discriminant > 0) {
            double firstRadical = ((-b) + squareOfDiscriminant) / (2 * a);
            double secondRadical = ((-b) - squareOfDiscriminant) / (2 * a);
            double maxRadical = Math.max(firstRadical, secondRadical);
            double minRadical = Math.min(firstRadical, secondRadical);
            result = new double[] {maxRadical, minRadical};
            return result;
        }
        if (discriminant == 0) {
            double radical = (-b) / (2 * a);
            result = new double[] {radical};
            return result;
        }
        return result;
    }
    public static void main(String[] args) {
        double[] equation = new QuadraticEquationSolver().solve(1, -2, -3);
        System.out.println(Arrays.toString(equation));
        double[] equation2 = new QuadraticEquationSolver().solve(1, 12, 36); // [-6]
        System.out.println(Arrays.toString(equation2));
        double[] equation3 = new QuadraticEquationSolver().solve(5, 3, 7); // []
        System.out.println(Arrays.toString(equation3));
    }
}
