package module06.test;

public class CharAtTest {
    public static void main(String[] args) {
        String str = "Java is very popular language";
        //String str = "Я буду хорошим программистом!";
        
        char result1 = str.charAt(8);
        char result2 = str.charAt(11);
        
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}