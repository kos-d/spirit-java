package module02_primitive.conspectus.materials.theme05_logical_operation.test;

public class BitwiseOperators {
    // Поразрядные операторы &, | и ^
    
    public static void main(String[] args) {
        int a = 25;
        int b = 112;
        int c = -13;
        
        int res1 = a & b;
        int res2 = a | b;
        int res3 = a ^ b;
        
        System.out.println("a & b = " + res1);
        System.out.println("a | b = " + res2);
        System.out.println("a ^ b = " + res3);
        
        String toBinaryString = Integer.toBinaryString(a);
        String toBinaryString1 = Integer.toBinaryString(c);
        System.out.println(a + " to binary = " + toBinaryString);
        System.out.println(c + " to binary = " + toBinaryString1);
    }
}