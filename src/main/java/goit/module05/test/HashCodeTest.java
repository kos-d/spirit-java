package goit.module05.test;

public class HashCodeTest {
    public static void main(String[] args) {
        int hCode = (new Object()).hashCode();
        System.out.println("hashCode = " + hCode);
    }
}