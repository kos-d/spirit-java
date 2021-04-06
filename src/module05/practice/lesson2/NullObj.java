package module05.practice.lesson2;

import java.util.Optional;

public class NullObj {
    public static void main(String[] args) {
        
        String name;
        
        Optional<String> test1 = test1("c");
        System.out.println("" + test1);
        if (test1.isPresent()) {
            System.out.println("isPresent = " + "test");
        }
        
        Optional<String> test2 = test1("b");
        System.out.println("" + test2);
        if (test1.isPresent()) {
            System.out.println("isPresent = " + "test");
        }
        
        // Exception
//        String get = test1.get();
//        System.out.println("get = " + get);

        String myTest = test2("c");
        System.out.println("myTest " + myTest);
    }
    
    public static String test(String name) {
        switch (name) {
            case "a" :
                return "1";
            case "b" :
                return "2";
            //default: return null; !!! antipattern
            // 1 variant
            default: throw new RuntimeException("Not found");
        }
    }
    public static Optional<String> test1(String name) {
        switch (name) {
            case "a" :
                return Optional.of("1");
            case "b" :
                return Optional.of("2");
            // 2 variant
            default: return Optional.empty();
        }
    }
    
    //pattern nullobject
    public static String test2(String name) {
        switch (name) {
            case "a" :
                return "1";
            case "b" :
                return "2";
            // nullobject
            default: return "";
        }
    }
    
    public static A test3(String name) {
        switch (name) {
            case "a" :
                return new A("a");
            case "b" :
                return new A("b");
            default: return new A();
        }
    }
}
class A {
    private String name;
    
    public A() {}

    public A(String name) {
        this.name = name;
    }
}