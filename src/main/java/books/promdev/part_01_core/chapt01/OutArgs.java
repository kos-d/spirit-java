package books.promdev.part_01_core.chapt01;

public class OutArgs {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.printf("Arg-> %s%n", str);
        }
    }
}