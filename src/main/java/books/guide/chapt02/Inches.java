package books.guide.chapt02;

public class Inches {
    public static void main(String[] args) {
        long ci, im;
        
        im = 5280 * 12;
        
        ci = im * im * im;
        
        System.out.println("In cubic mile " + ci + " cubic inches");
    }
}