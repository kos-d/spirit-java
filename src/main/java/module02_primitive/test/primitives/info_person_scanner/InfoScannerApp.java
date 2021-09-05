package module02_primitive.test.primitives.info_person_scanner;

import java.util.Scanner;

public class InfoScannerApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
        in.close();
    }
}
