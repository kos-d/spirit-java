package module03.conspectus.materials.arrays;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {

        byte[] byteArray = new byte[4];
        System.out.println("byteArray.length = " + byteArray.length);

        short[] shortArray = new short[7];
        System.out.println("shortArray.length = " + shortArray.length);

        int[] intArray = new int[3];
        System.out.println("intArray.length = " + intArray.length);

        long[] longArray = new long[8];
        System.out.println("longArray.length = " + longArray.length);

        float[] floatArray = new float[2];
        System.out.println("floatArray.length = " + floatArray.length);

        double[] doubleArray = new double[9];
        System.out.println("doubleArray.length = " + doubleArray.length);

        char[] charArray = new char[6];
        System.out.println("charArray.length = " + charArray.length);

        String[] stringArray = new String[5];
        System.out.println("stringArray.length = " + stringArray.length);

        boolean[] booleanArray = new boolean[11];
        System.out.println("booleanArray.length = " + booleanArray.length);
        
        Person bob = new Person();
        System.out.println(bob.toString());

        Person[] personArray = new Person[2];
        System.out.println("personArray.length  = " + personArray.length);
        personArray[0] = bob;
        System.out.println("personArray[0] = " + personArray[0]);
    }
}

class Person {
    String name = "Bob";
    int age = 20;

    public String toString() {
        return "Person { name " + name + " age " + age + " }";
    }
}
