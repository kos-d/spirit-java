package books.promdev.part_02_libraries.chapt07;

public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("length -> " + sb.length());
        System.out.println("size -> " + sb.capacity());
        sb.append("Java");
        System.out.println("string -> " + sb);
        System.out.println("length -> " + sb.length());
        System.out.println("size -> " + sb.capacity());
        System.out.println("reverse -> " + sb.reverse());
    }
}