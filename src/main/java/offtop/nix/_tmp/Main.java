package offtop.nix._tmp;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        printArgs(args);
        
//        for (String str : args) {
//            System.out.println(str);
//        }
        
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(5);
//        list.add(1);
//        list.add(10);
//        System.out.println(list);
//        
//        System.out.println(new Main().message());
//        System.out.println(new Main2().message());
    }
    
//    Object message() {
//        return "Hello!";
//    }
    private static void printArgs(String[] args) {
        for (String str : args) {
            System.out.println(str);
        }
    }
}
//class Main2 extends Main {
//    String message() {
//        return "World!      ";
//    }
//}