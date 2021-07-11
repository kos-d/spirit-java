package module02.test.parse_Int;

public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";
        
        try {
            int value1 = Integer.parseInt(arg); // return int
            int value2 = Integer.valueOf(arg);  // return Integer
            int value3 = Integer.decode(arg);   // return Integer
            int value4 = new Integer(arg);      // create Integer
        } catch (NumberFormatException e) {
            System.err.println("Wrong format number " + e);
        }
        
        int value = 72;
        String arg1 = Integer.toString(value);
        String arg2 = String.valueOf(value);
        
    }
}