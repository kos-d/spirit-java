package library.test;

public class StringTestApp {
    public static void main(String[] args) {
        String s1 = "0";
        String s2 = "0";
        
        System.out.println("s1 == s2 = " + s1 == s2);               //false
        System.out.println("s1.equals(s2) = " + s1.equals(s2));     //true
    }
}