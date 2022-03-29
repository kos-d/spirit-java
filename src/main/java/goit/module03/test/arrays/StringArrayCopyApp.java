package goit.module03.test.arrays;

import java.util.Arrays;

public class StringArrayCopyApp {

    public String[] makeCopy(String[] names) {
        System.out.println("Copied!");
        return Arrays.copyOf(names, names.length);
    }

    public static void main(String[] args) {
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new StringArrayCopyApp().makeCopy(source);

        source[0] = "CHANGED!";

        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(source));
    }
}
