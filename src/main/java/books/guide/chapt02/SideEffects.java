package books.guide.chapt02;

public class SideEffects {
    public static void main(String[] args) {
        int i;
        
        i = 0;
        
        if (false & (++i < 100))
            System.out.println("This string no view");
        System.out.println("Operator if work: " + i);
        
        if (false && (++i < 100))
            System.out.println("This string no view");
        System.out.println("Operator if work: " + i);
    }
}