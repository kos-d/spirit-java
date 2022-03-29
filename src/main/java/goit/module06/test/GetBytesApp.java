package goit.module06.test;

import java.util.Arrays;

public class GetBytesApp {
    public static void main(String[] args) {
        String coolString = "cool string";
        
        String java = "java";

        byte[] byteArray = coolString.getBytes();
        
        byte[] byteArray1 = java.getBytes();
        
        System.out.println("" + Arrays.toString(byteArray));
        
        System.out.println("" + Arrays.toString(byteArray1));

        String reconstitutedString = new String(byteArray);
        
        String reconstitutedString1 = new String(byteArray1);
        
        byte[] startBytes = {74, 97, 86, 97};
        
        String reconstitutedString2 = new String(startBytes);

        System.out.println(reconstitutedString);
        
        
        System.out.println(reconstitutedString1);
        
        System.out.println(reconstitutedString2);
    }
}