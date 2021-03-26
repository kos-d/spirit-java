package module02.homework.autocheck;

public class NumberTester {
    public boolean isNumberEven(int number) {
        return number % 2 == 0;
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } return false;
    }
    public boolean isOdd(int number) {
        return number % 2 != 0; 
    }

    public static void main(String[] args) {
    NumberTester numberTester = new NumberTester();

    System.out.println(numberTester.isNumberEven(10));
    System.out.println(numberTester.isEven(4));
    System.out.println(numberTester.isEven(5));
    System.out.println(numberTester.isOdd(7));
    System.out.println(numberTester.isOdd(8));
        
    }
}
