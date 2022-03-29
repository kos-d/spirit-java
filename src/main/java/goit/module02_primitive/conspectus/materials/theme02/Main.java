package goit.module02_primitive.conspectus.materials.theme02;

public class Main {
    public static void main(String[] args) {
        long x = 15; //Значение 15 изначально берется как int, и потом приводится к типу long
        long value0 = 100l;
        long anotherValue = 500L;
        
        float myFloat = 5; //Число 5 изначально берется как int, и приводится к типу float
        float f1 = 10.0f;
        float f2 = 15f;
        float f3 = 43F;
        float f4 = .5f;
        
        int value1 = 015;   // в восьмеричной кодировке                 13 в десятичной
        int value2 = 0xA;   // в шестнадцатиричной системе исчисления   10 в десятичной
        int value3 = 0b11;  // в двоичной системе исчисления             3 в десятичной
    }
}