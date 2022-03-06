package cr.test;

public class Main {
    public static void main(String[] args) {
        int age = 17;
        
        if (age >= 18) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not allowed");
        }
        
        if (age <= 18) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not allowed");
        }
        
//        int num = 17;
        int num = 15;
        
        if (num % 2 == 0) {
            System.out.println("even");
        } else if (num % 3 == 0) {
            System.out.println("div on 3");
        } else if (num % 5 == 0) {
            System.out.println("div on 5");
        } else {
            System.out.println("==__==");
        }
    }
}