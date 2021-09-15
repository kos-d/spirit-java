package books.promdev.chapt02;

public class CastType {
    public static void main(String[] args) {
        Float f1 = new Float(10.71);    // double in Float
        String s1 = Float.toString(0f); // float in String
        String s2 = String.valueOf(f1); // Float in String
        Byte b = Byte.valueOf("120");   // String in Byte
        double d = b.doubleValue();     // Byte in double
        byte b0 = (byte) (float) f1;    // Float in byte
        short s = (short) d;            // double in short
        
        /* Character in int */
        Character ch = new Character('3');
        int i = Character.digit(ch.charValue(), 10);
        System.out.printf("f1=%1.2e s1=%s s2=%s%n", f1, s1, s2);
        System.out.printf("b=%o d=%.1f b0=%d s=%d i=%d", b, d, b0, s, i);
    }
}