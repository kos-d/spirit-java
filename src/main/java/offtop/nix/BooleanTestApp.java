package offtop.nix;

public class BooleanTestApp {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println((a && !b) || c);         // true
        
        boolean a1 = false;
        boolean b1 = true;
        boolean c1 = false;
        System.out.println((!a1 || b1) && !c1);     // true
    }
}