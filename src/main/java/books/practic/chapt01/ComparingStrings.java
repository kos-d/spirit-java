package books.practic.chapt01;

public class ComparingStrings {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "abc";
        s2 = s1;
        System.out.println("equals links: " + (s1 == s2)); // true
        
        s1 += 'd';
        System.out.println("s1 = " + s1);
        System.out.println("equals links: " + (s1 == s2)); // false
        
        s2 = new String(s1);
        System.out.println("equals links: " + (s1 == s2)); // false
        System.out.println("equals value: " + s1.equals(s2));
    }
}