package books.guide.chapt01;
//  48
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        
        if (a < b) System.out.println("a less b");
        if (a == b) System.out.println("no work");
        
        System.out.println();
        
        c = a - b;
        
        System.out.println("c contains -1");
        if (c >=0) System.out.println("c - positive number");
        if (c < 0) System.out.println("c - not positive number");
        
        c = b - a;
        
        System.out.println("c contains 1");
        if (c >= 0) System.out.println("c - positive number");
        if (c < 0) System.out.println("c - not positive number");
    }
}