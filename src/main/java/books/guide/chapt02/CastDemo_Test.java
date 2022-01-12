package books.guide.chapt02;

public class CastDemo_Test {
    public static void main(String[] args) {
        double x, y;
        x = 10.4D;
        y = 2.0D;
        
        double result1 = x / y;
        int result2 = (int) (x / y);
        System.out.println("result 1: " + result1);
        System.out.println("result 2: " + result2);
    }
}