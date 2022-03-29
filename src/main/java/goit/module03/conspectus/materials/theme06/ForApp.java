package goit.module03.conspectus.materials.theme06;

public class ForApp {
    public static void main(String[] args) {
        loop();
        forLoop(1);
        
         System.out.println("-------------------");
         
//        int year = 1900;
//        for(;;) {
//            System.out.println(year);
//            year++;
//            if (year > 2000) {
//                break;
//            }
//        }
        
//        a: {
//            b: {
//                c: {
//                    System.out.println("Very inner block");
//                    break b;                    
//                }                
//            }
//            System.out.println("Middle block");
//        }        
//        System.out.println("Outer block");
 System.out.println("-------------------");
//        outerLoop:
//        for(int i = 0; i < 100; i++) {
//            for (int j = 0; j < 100; j++) {
//                for(int k = 0; k < 100; k++) {
//                    System.out.println(i * j * k);
//                    if (i * j * k == 1000) {
//                        break outerLoop;
//                    }
//                }
//            }
//        }
        for(int i = 1; i < 100; i++) {
            if (i%10 == 0) {
                continue;
            }
            System.out.println(i);
        }
        
        System.out.println("-------------------");
        
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                System.out.println(numbers[i]);
            }
        }
        
        System.out.println("-------------------");
        
        int[] num = {1, 2, 3, 4, 5};
        for (int i = 1; i < num.length; i += 2) {
            System.out.println(numbers[i]);
        }
    }
    public static void loop() {
        
        for(int i = 0; i < 10; i++) {
            System.out.println("# " + i);
        }
    }
    public static void forLoop(int month) {
        for (; month <= 12; month++) {
            System.out.println(month);
        }
    }  
}