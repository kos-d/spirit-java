package goit.module02_primitive.homework.autocheck;

public class MathUtils {
    // nonStatic  method sum
    public int sum(int a, int b) {
        return a + b;
    }
    
    // nonStatic method sub
    public int sub(int a, int b) {
        return a - b;
    }
    
    // nonStatic method twice
    public float twice(float number) {
        return number /= 0.5f;
    }
    // nonStatic method quad
    public float quad(float number) {
        return 2 * twice(number);
    }   
    // nonStatic method twicedSum
    public int twicedSum(int a, int b) {
        return sum(a, b) * 2;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        System.out.println("math.sum(3, 2) = " + math.sum(3, 2));
        System.out.println("math.sub(5, 3) = " + math.sub(5, 3));
        System.out.println("math.twice(7f) = " + math.twice(7));
        System.out.println("math.quad(2f) = " + math.quad(2));
        System.out.println("math.twicedSum(2, 3) = " + math.twicedSum(2, 3));
    }
}
