package module01.conspectus.materials;

public class FirstClass {

    public int sum(int a, int b) {
        return a + b;
    }
}
class Runner {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        int resultSum = firstClass.sum(2, 4);
        System.out.println("resultSum = " + resultSum);
    }
}
