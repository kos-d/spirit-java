package library.parsing;

public class ParsingApp {
    public static void main(String[] args) {
        
        byte myByte = Byte.parseByte("42");
        short myShort = Short.parseShort("42");
        int myInt = Integer.parseInt("42");
        long myLong = Long.parseLong("42");
        float myFloat = Float.parseFloat("42.0");
        double myDouble = Double.parseDouble("42.0");
        
        System.out.println(
                "myByte = " + myByte + "\n" + 
                "myShort = " + myShort + "\n" +
                "myInt = " + myInt + "\n" +
                "myLong = " + myLong + "\n" +
                "myFloat = " + myFloat + "\n" +
                "myDouble = " + myDouble);
    }
}