package module02.conspectus.video.operation;

public class CombinOperationApp {
    public static void main(String[] args) {
        
        int x = 0;  // x = 0
        x = x + 1;  // 0 + 1 x = 1
        x = x + 4;  // 1 + 4 x = 5

        System.out.println("x = " + x);

        int y = 0;  // y = 0;
        y += 1;     // y = y + 1
        y += 4;     // y = y + 4
        System.out.println("y = " + y);
        
        int a = 1;
        a++; // a = a + 1
        System.out.println("a = " + a);

        int b = 1;
        b--; // b = b - 1
        System.out.println("b = " + b);

        int c = 1;
        System.out.println(c++); // c = 1 после вывода к с прибавится 1
        System.out.println(c);   // c = 2 в этом месте программы
    
        System.out.println(++c); // c = 3 
        
        int d = 2;
        System.out.println(d--); // d = 2
        System.out.println(d);   // d = 1 
        System.out.println(--d); // d = 0
        
    }
}
