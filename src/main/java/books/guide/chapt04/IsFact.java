package books.guide.chapt04;

public class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();
        
        if (x.isFactor(2, 20)) System.out.println("2 - divider");
        if(x.isFactor(3, 20))
            System.out.println("this string is not out");
    }
}