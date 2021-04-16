package module06.test;

public class StringToCharArrayApp {
    public static void main(String[] args) {
        String test = "abc";
        char[] result = test.toCharArray();
        
        System.out.println("Charr array:");
        for (int i = 0; i <result.length; i++) {
            System.out.println("Element [" + i + "]: " + result[i]);
        }
    }
}