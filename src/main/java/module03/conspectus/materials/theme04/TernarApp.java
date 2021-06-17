package module03.conspectus.materials.theme04;

public class TernarApp {
    public static void main(String[] args) {
        // condition?value1:value2
        
        int age1 = 20;
        String accessAllowed = age1 >= 18 ? "yes" : "no";
        System.out.println("accessAllowed -> " + accessAllowed);
        
        int appleCount = 10;
        String name = appleCount > 100 ? "A lot of apples" : "Few apples";
        System.out.println(name);
        
        int age = 50;
        int maxAge = age > 100 ? 100 : 150;        
        
        
        TernarApp app = new TernarApp();
        System.out.println(app.getEvenOrOdd(5));
        System.out.println(app.getEvenOrOdd(8));
        
        System.out.println(app.max(4, 7));
        System.out.println(app.max(5, 3));
        
        System.out.println(app.maxFrom3(1, 2, 3));
        
        System.out.println(app.maxFrom3New(5, 4, 3));
    }
    public String getEvenOrOdd(int number) {
            return number % 2 == 0 ? "even" : "odd";
    }
    public int max(int a, int b) {
        return a > b ? a : b;
    }
    
    public int maxFrom3(int a, int b, int c) {
        return a > b && a > c ? a :
               b > a && b > c ? b 
                              : c;
    }
    
    public int maxFrom3New(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }
}