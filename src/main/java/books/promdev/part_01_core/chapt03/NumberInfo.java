package books.promdev.part_01_core.chapt03;

public class NumberInfo {
    public static void main(String[] args) {
        
//        NumberInfo numberInfo = new NumberInfo();
        
        
        Number[] num = { new Integer(7), 71, 3.14f, 7.2 };
//        viewNum(10);
        
        for (Number n : num)
            viewNume(n);
        viewNum(new Integer(8));
//        viewNum(81);
//        viewNum(4.14f);
//        viewNum(8.2);
        
    }
    public static void viewNum(double i) {
        System.out.printf("Integer=%d%n", i);
    }
    public static void viewNum(Integer i) {
        System.out.printf("Integer=%d%n", i);
    }
    public static void viewNum(int i) {
        System.out.printf("int=%d%n", i);
    }
    public static void viewNum(Float f) {
        System.out.printf("Float=%.4f%n", f);
    }
    public static void viewNume(Number n) {
        System.out.println("Number=" + n);
    }

//    private void viewNum(Number e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}