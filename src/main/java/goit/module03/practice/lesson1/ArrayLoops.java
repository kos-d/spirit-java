package goit.module03.practice.lesson1;

public class ArrayLoops {
    public static void main(String[] args) {
        
        int[] array = new int [3];        
        array[0] = 2;
        array[1] = 8;
        array[2] = 4;
        
        System.out.println("method forward");
        forward(array);
        System.out.print("\n");
        System.out.println("method rearward");
        rearward(array);
        System.out.print("\n");
        System.out.println("method forEach");
        forEach(array);
        System.out.print("\n");
        System.out.println("method whileLoop");
        whileLoop(array);
        System.out.print("\n");
        System.out.println("method whileLoop1");
        whileLoop1(array);
        System.out.print("\n");
        System.out.println("method doWhileLoop");
        doWhileLoop(array);
        System.out.print("\n");
        System.out.println("method whileLoop2");
        whileLoop2(array);
    }
    public static void forward(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] -> " + args[i]);
        }
    }
    public static void rearward(int[] args) {
        for (int i = args.length-1; i >= 0; i--) {
            System.out.println("args[" + i + "] -> " + args[i]);
        }
    }
    
    public static void forEach(int[] args) {
        for (int value : args) {
            System.out.println("args[" + value + "] -> " + value);
        }
    }
    
    public static void whileLoop(int[] args) {
        
        int i = 0;
        boolean x = i < args.length;
        while (i < args.length) {
            System.out.println("args[" + i + "] -> " + args[i]);
            i++;
        }
    }
    public static void whileLoop1(int[] args) {
        
        int i = 0;
        while (!(i >= args.length)) {
            System.out.println("args[" + i + "] -> " + args[i++]);
        }
    }
    public static void doWhileLoop(int[] args) {
        int i = 0;
        do {
            System.out.println("args[" + i + "] -> " + args[i++]);
        } while (i < args.length);
    }
    
    public static void whileLoop2(int[] args) {
        int i = 0;
        while (i < args.length) {
            System.out.println("i = " + i);
            System.out.println("args[" + i + "] -> " + args[i]);
            i++;
            //continue;
            break;
        }
    }
}