package cr.test;

public class AppMain {
    public static void main(String[] args) {
        
        
        char c = 'c';
        
        int res = (int) c;
        
        System.out.println(res);
        
        char tableNumber = (char) 102;
        
        System.out.println(Character.class.isInstance(c));
        System.out.println(Character.class.isInstance(res));
        System.out.println(Integer.class.isInstance(res));
        System.out.println(tableNumber);
        
        
        
    }
}