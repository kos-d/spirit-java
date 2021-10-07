package books.promdev.part_02_libraries.chapt07;

import java.util.Formatter;

public class SimpleFormatString {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This %s is about %n%S %c", "book", "java", '6');
        System.out.print(f);
    }
}