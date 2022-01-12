package books.guide.chapt02.practice2_2;

public class LogicalOpTable_2 {
    public static void main(String[] args) {
        boolean a, b;
        int p = 1, q = 1;
        
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        a = true; b = true;
        
        if (a == true & b == true) 
            p = q = 1;
        
        
        
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
        
//        p = true; q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//        
//        p = false; q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//        
//        p = false; q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
    }
}