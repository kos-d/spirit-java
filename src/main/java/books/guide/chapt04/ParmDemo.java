package books.guide.chapt04;

public class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();
        
        if (e.isEven(10)) System.out.println("10 - even number");
        
        if (e.isEven(9)) System.out.println("9 - even number");
        
        if (e.isEven(8)) System.out.println("8 - even number");
    }
}