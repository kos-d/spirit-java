package module06.conspectus.materials.theme02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] bytes = {74, 97, 118, 97};
        System.out.println(new String(bytes));
        
        System.out.println(Arrays.toString("Java".getBytes()));
        
        System.out.println(Arrays.toString("Java".toCharArray()));
    }
}