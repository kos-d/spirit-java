package books.promdev.part_02_libraries.chapt07;

public class RefString {
    public static void changeStr(String s) {
        s.concat(" Microsystems");
    }
    public static void main(String[] args) {
        String str = new String("Sun");
        changeStr(str);
        System.out.println(str);
    }
}