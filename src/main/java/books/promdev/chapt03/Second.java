package books.promdev.chapt03;

import java.util.Calendar;

public class Second {
    private int x;
    private int y = 71;
    public final int CURRENT_YEAR = 2021;
    protected static int bonus;
    static String version = "Java 8";
    protected Calendar now;
    
    public int method(int z) {
        z++;
        int a;
        a = 4;
        a++;
        now = Calendar.getInstance();
        return a + x + y + z;
        
    }
    public static void main(String[] args) {
        Second o = new Second();
        int result = o.method(5);
            
        System.out.println(result);
    }
}