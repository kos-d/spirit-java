package module06.conspectus.video.lesson03;

public class WrapperDemo {
    public static void main(String[] args) {
        integerDemo();
    }
    
    private static void integerDemo() {
        int primitive = 10;
        
        Integer integerWrapper = primitive; //Autoboxing        
        int unboxingPrimitive = integerWrapper; //Unboxing
        
        Integer integer1 = Integer.valueOf("10");
        
        System.out.println("Max " + Integer.MAX_VALUE);
        System.out.println("Min " + Integer.MIN_VALUE);
        
        int i = Integer.parseInt("12");
        Integer integer = Integer.valueOf(11);
        int compare = Integer.compare(integer, integer1);
        System.out.println("Compare result " + compare);
        
        int i1 = integer.intValue();
        
        unboxingMethod(integer);
        unboxingMethod(i1);
        
        Integer[] array = new Integer[10];
        arrayUnboxing(array);
    }
    
    private static void arrayUnboxing(Integer[] array) {
        
    }
    
    private static void unboxingMethod(int integer) {
        System.out.println("First " + integer);
    }
    
    private static void unboxingMethod(Integer integer) {
        System.out.println("Second " + integer);
    }
}