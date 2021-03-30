package offtop.sqrtScanner;
import java.util.Scanner;
public class SqrtRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.print("a = ");
        a = in.nextDouble();
        System.out.print("b = ");
        b = in.nextDouble();
        System.out.print("c = ");
        c = in.nextDouble();
        
        double result = b * b - 4 * a * c;
        if (result < 0) {
            System.out.println("Kornej net");
        } else if (result == 0) {
            double x = (-b) / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(result)) / (2 * a);
            double x2 = (-b - Math.sqrt(result)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        in.close();
        System.out.println("in.close!");
    }
}