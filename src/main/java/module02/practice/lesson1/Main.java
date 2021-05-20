package module02.practice.lesson1;

public class Main {
    
    int nonStaticX = 0;
    
    // class variable
    static int a;
    
    static int staticX = 1;
    // class method
    public static void main(String[] args) {
        
        int b = 1;        
        int x = 5;
        
        String str = "ABC";
        
        main1(String.valueOf(x));
        main1(str);
        
        long y = x;
        int z = (int) y;
        
        System.out.println("variable a = " + a);
        System.out.println("variable b = " + b);
        
        Main main = new Main();
        main.main2();
        
        Main main1 = new Main();        
        main1.nonStaticX = 5;
        
        Main main2 = new Main();
        main2.nonStaticX = 10;
        
        System.out.println("staticX = " + staticX);
        System.out.println("main.nonStaticX = " + main.nonStaticX);
        
        System.out.println("main1.nonStaticX = " + main1.nonStaticX);
        System.out.println("main2.nonStaticX = " + main2.nonStaticX);
        
        main3();
        
        int varX = 2;
        int varY = 3;
        
        int varZ = varX + varY;
        System.out.println("varZ = " + varZ);
        
        int varZSum = sum(varX, varY);       
        System.out.println("varZSum = " + varZSum);
        
        int varZSum1 = sum(15, 20, 30);
        System.out.println("varZSum1 = " + varZSum1);
        
        int varZSum2 = sum(15, 20, 30, 40);
        System.out.println("varZSum2 = " + varZSum2);
    }
    
    public static int sum(int a, int b) {
        int result =  a + b;
        return result;
    }
    public static int sum(int a, int b, int c) {
        int result =  a + b + c;
        return result;
    }
    
    public static int sum(int ... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
    
    public static int sum(String s, int ... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
    
    public static void main1(String args) {
        System.out.println("variable a from main1 = " + a);
    }
    
    public void main2() {
        main3();
        System.out.println("method main2 $");
    }
    
    public static void main3() {
        System.out.println("method main3 *");
    }
}