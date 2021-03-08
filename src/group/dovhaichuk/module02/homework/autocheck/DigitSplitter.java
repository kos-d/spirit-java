package module02.homework.autocheck;

public class DigitSplitter {
    public int getFirstDigit(int number) {
        return number / 10;
    }
    public int getSecondDigit(int number) {
        return number % 10;
    }
 
    public static void main(String[] args) {
        DigitSplitter digitSplitter = new DigitSplitter();
        System.out.println(digitSplitter.getFirstDigit(15));
        System.out.println(digitSplitter.getSecondDigit(15));
    }
}
