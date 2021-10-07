package books.promdev.part_02_libraries.chapt07;

public class EqualsStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Sun");
        StringBuffer sb2 = new StringBuffer("Sun");
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.hashCode() == sb2.hashCode());
    }
}