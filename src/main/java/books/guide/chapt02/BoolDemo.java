package books.guide.chapt02;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;        
        b = false;
        System.out.println("Value b: " + b);
        b = true;
        System.out.println("Value b: " + b);
        if (b) System.out.println("This instruction work");
        b = false;
        if (b) System.out.println("Thi instruction not work");
        
        System.out.println("Comparison result 10 > 9: " + (10 > 9));
    }
}