package module03.homework.autocheck;

import java.util.Scanner;


public class MoonComputerTests {
   Scanner scanner = new Scanner(System.in);
    public void testBasicInputOutput() {
  //  Scanner scanner = new Scanner(System.in);
        //System.out.print("Input test data: ");
        String line = scanner.nextLine();
        //System.out.printf("Output test data: %s \n", line);
        System.out.printf("%s \n", line);
        scanner.close();
    }
    public void testMath() {
//      Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int sum = value1 + value2;
        int sub = value1 - value2;
        int multiply = value1 * value2;
        int divide = value1 / value2;
        System.out.println(sum + " " + sub + " " + multiply + " " + divide);
        scanner.close();
    }
    /*
    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println(sum + " " + sub + " " + multiply + " " + divide);

        scanner.close();
    }
     */
    public void testLogicalOperators() {
        boolean bool1 = scanner.nextBoolean();
        boolean bool2 = scanner.nextBoolean();
        boolean bool3 = scanner.nextBoolean();
        boolean result1 = bool1 && bool2 && bool3;
        boolean result2 = bool1 || bool2 || bool3;
        System.out.println(result1 + " " + result2);

        scanner.close();
    }

    public static void main(String[] args) {
       // MoonComputerTests computerTests = new MoonComputerTests();
       // computerTests.testBasicInputOutput();
       // new MoonComputerTests().testMath();
        new MoonComputerTests().testLogicalOperators();
    }
}
