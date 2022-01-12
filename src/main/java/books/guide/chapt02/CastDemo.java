package books.guide.chapt02;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;
        
        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println("value i: " + i);
        
        i = 100;
        b = (byte) i;
        System.out.println("value b: " + b);
        
        i = 257;
        b = (byte) i;
        System.out.println("value b: " + b); // b = 1
        
        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}