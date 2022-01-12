package books.guide.chapt03;

public class KbIn {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        
        System.out.println("Press any button, after press ENTER: ");
        ch = (char) System.in.read();
        System.out.println("You press button " + ch);
    }
}