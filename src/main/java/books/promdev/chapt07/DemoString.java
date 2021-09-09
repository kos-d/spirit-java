package books.promdev.chapt07;

public class DemoString {
    static int i;
    
    public static void main(String[] args) {
        char s[] = { 'J', 'a', 'v', 'a' };
        
        String str = new String(s);
//        System.out.println(str);
        if (!str.isEmpty()) {
            i = str.length();
//            System.out.println(i);
            str = str.toUpperCase();
//            System.out.println(str);
            String num = String.valueOf(6);
//            System.out.println(num);
            if (num instanceof String) {
                
            }
        }
        
    }
}