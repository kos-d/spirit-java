package module02.conspectus.materials.theme04;

public class Main {
    public static void main(String[] args) {
        int a = 2000;
        int b = 2000;
        
        boolean result = a == b;
        System.out.println(result);         //true
        
        char bigA= 'A';
        char smallA = 'a';
        boolean result1 = bigA == smallA;
        
        System.out.println(result1);        // false
        
        int myAge = 18;
        int myFatherAge = 45;
        
        boolean result2 = myAge != myFatherAge;
        
        System.out.println(result2);        // true
        
        int appleCount = 5;
        int bananaCount = 6;
        int mangoCount = 6;

        System.out.println(appleCount > bananaCount);   // false
        System.out.println(bananaCount >= mangoCount);  // true
        System.out.println(mangoCount < bananaCount);   // false
        System.out.println(mangoCount <= bananaCount);  // true
    }
}