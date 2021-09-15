package books.promdev.chapt02;

public class TypeByte {
    public static void main(String[] args) {
        byte b = 1, b1 = 1 + 2;
        final byte B = 1 + 2;
        b = B + 1;
        System.out.println(b);  // 4        
        b = (byte ) (b1 + 120); // 123
        
        int i = 3;
        final int I = 3;
        final int I2 = 129;
        
        b = (byte) I;
        
        b += i++;
        b += 1000;
        b1 *= 2;
        
        float f = 1.1F;
        
        b /= f;
                
        System.out.println(b);
    }
}