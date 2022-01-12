package books.guide.chapt02;
//79

public class Main_test {
    public static void main(String[] args) {
        int x, y, z;
        boolean bool1 = true;
        boolean bool2 = true;
        boolean bool3 = false;
        
        
        x = y = z = 100;
        
        x = x + 10;
        x += 10;
        
        System.out.println("x = " + x); // x = 120
        
        x = x - 100;
        x -= 100;
        
        System.out.println("x = " + x); // x = -80
        
        y *= 20;
        y /= 5;
        
        z %= 4;
        bool1 &= bool2;        
        bool1 |= bool3;
        bool2 ^= bool1;
        //--------------------------------------
        
        int i;
        float f;
        
        i = 10;
        f = i;
    }
}