package module06.test;

public class OutArgsTest {
    public static void main(String[] args) {
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("Args -> " + args[i]);
        }
        int lengthArray = args.length;
        System.out.println("length Array = " + lengthArray);
    }
}
