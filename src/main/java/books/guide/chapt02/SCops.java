package books.guide.chapt02;

public class SCops {
    public static void main(String[] args) {
        int n, d, q;
        
        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
        System.out.println(d + " has divider " + n);
        
        d = 0;
        
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " has divider " + n);
        
//        if (d != 0 & (n % d) == 0)
//            System.out.println(d + " has divider " + n);
    }
}