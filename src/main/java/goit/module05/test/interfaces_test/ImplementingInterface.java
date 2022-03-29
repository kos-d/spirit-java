package goit.module05.test.interfaces_test;

public class ImplementingInterface {
    void interfaceMethod() {
        System.out.println("This method from interface I");
    }
    
    public static void main(String[] args) {
        ImplementingInterface temp = new ImplementingInterface();
        temp.interfaceMethod();
    }
}
