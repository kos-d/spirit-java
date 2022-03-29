package goit.module05.test.interface_example;

public class Correct implements A, C {

    @Override
    public int getValue() {
        return 5;
    }
    public static void main(String[] args) {
        Correct tmp = new Correct();
        int value = tmp.getValue();
        System.out.println("value " + value);
    }
}