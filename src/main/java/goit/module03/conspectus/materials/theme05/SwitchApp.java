package goit.module03.conspectus.materials.theme05;

public class SwitchApp {
    public static void main(String[] args) {
//        switch (condition) {
//            case value1:
//                action1;
//                break;
//            case value2:
//                action2;
//                break;
//        }

        int digit1 = 5;
        String digitName;
        
        switch (digit1) {
            case 0:
                digitName = "zero";
                break;
            case 1:
                digitName = "one";
                break;
            case 2:
                digitName = "two";
                break;
            case 3:
                digitName = "three";
                break;
            case 4:
                digitName = "four";
                break;
            case 5:
                digitName = "five";
                break;
            case 6:
                digitName = "six";
                break;
            case 7:
                digitName = "seven";
                break;
            case 8:
                digitName = "eight";
                break;
            case 9:
                digitName = "nine";
                break;
            default:
                digitName = "Unknown";
        }
        System.out.println(digitName);
        
        boolean isDigitZeroOrOne;
        int digit = 2;
        
        switch(digit) {
            case 0:
            case 1:
                isDigitZeroOrOne = true;
                break;
            default:
                isDigitZeroOrOne = false;
                break;
        }
        System.out.println(isDigitZeroOrOne);
    }
}