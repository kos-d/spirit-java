package module05.test.exception;

public class ErrorExample {
    private Test test = new Test();
    
    public void foo() {
//        System.out.println(1/0);
/*
        int[] array = {1, 2, 3};
        array[4] = 4;
*/
        try {
            test.show();
            System.out.println(1/0);
        } catch (NullPointerException | ArithmeticException e) {
//            System.err.println("Objects Null pointer");
            e.printStackTrace();
        } 
//        catch (ArithmeticException ex) {
//            ex.printStackTrace();
//        }

//        if (test == null) {
//            System.out.println("Null pointer");
//        } else {
//            test.show();
//        }
    }
}