package module02_primitive.conspectus.video.lesson01;

public class PrimitiveTypeTest {
    public static void main(String[] args) {
        int number = 10000;
        byte litleNumber = 16;
        
        int numeric = 127;
        short value = 16;
        
        number = litleNumber;        
        litleNumber = (byte) number;
        
        System.out.println(number);        
        System.out.println(litleNumber);
        
        value = (short) numeric;
        System.out.println(value);
        
    }
}