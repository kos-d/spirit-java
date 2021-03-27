package offtop.methods.loops.appIf;

public class IfTest {
    
    public boolean boolA = true;
    public boolean boolB = false;

    public void ifTest1() {
        if (boolA) {
            System.out.println("Test variable boolean, boolA = true");
        }
    }
    public int x = 3;
    public void ifTest2() {
        if (x > 2) {
            System.out.println("x biger 2");
        }
    }

    public void ifTest3() {
        if (boolB) {
            System.out.println("variable boolB = true");
        } else {
            System.out.println("variable boolB = false");
        }
    }
}
