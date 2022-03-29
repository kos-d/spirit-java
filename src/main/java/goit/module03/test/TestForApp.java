package goit.module03.test;
// https://geekbrains.ru/tests/39/trials/2004317/run

public class TestForApp {
    public static void main(String[] args) {
        //for (int i = 10; i > 0; i++) {
          //  System.out.println(i);
        //}
        System.out.println("\n");

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);
        System.out.println(" ");
        System.out.println(s1.equals(s2));

        byte a = 127;
        a++;
        System.out.println(a);

    }
}
