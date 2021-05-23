package module03.practice.lesson2;

public class LoopsTernarApp {
    public static void main(String[] args) {
        //use mainTrue mainFalse methods
        boolean x = false;

        if (x) {
            mainTrue();
        } else {
            mainFalse();
        }
    }
    //use getTrue getFalse methods
    boolean y = false;

    String result = y ? getTrue() : getFalse();



    public static void mainTrue() {
        System.out.println("Method mainTrue()");
    }
    public static void mainFalse() {
        System.out.println("Method mainFalse()");
    }

    public static String getTrue() {
        System.out.println("Methods getTrue()");
        return null;
    }
    public static String getFalse() {
        System.out.println("Methods getFalse()");
        return null;
    }
}
