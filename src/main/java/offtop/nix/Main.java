package offtop.nix;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        String str = "test";
        System.out.println(++a);
        System.out.println(b++);
        String concat = str.concat("2");
        System.out.println(concat);
    }
}