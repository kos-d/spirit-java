package module02.conspectus.materials.theme06;

public class PrimitiveTypeApp {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int result = a + b;
        
        byte age = 18;
        int intAge = age;
        
        byte value = (byte) 128; // получаем -128 из-за «прокрутки»
        int val = value;
        
        System.out.println(value);
    }
}