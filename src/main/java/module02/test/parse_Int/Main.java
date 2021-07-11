package module02.test.parse_Int;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a + 1);
        
        String stringDigit = "12";
        
        System.out.println(stringDigit);        
        
        int result = Integer.parseInt(stringDigit);
        System.out.println(result + a);
        
        Integer value = 127;
        int valueNew = 128;
        
        int intValue = value.intValue();
        System.out.println(intValue + a);
        
        if (value instanceof Integer) {            
            System.out.println(true);
        }        
    }
}