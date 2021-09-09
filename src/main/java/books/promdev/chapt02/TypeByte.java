package books.promdev.chapt02;

public class TypeByte {
    public static void main(String[] args) {
        byte b = 1, b1 = 1 + 2;
        final byte B = 1 + 2;
        b += b++;
        System.out.println(b);
    }
}