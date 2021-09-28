package books.promdev.chapt06_interface_inner_class;

public class ShapeCreator {
    public static void main(String[] args) {
        Shape sh;
        Rectangle re = new Rectangle(5, 9.95);
        sh = re;
        double perimeter1 = sh.getPerimeter();
        Circle cr = new Circle(7.01);
        sh = cr;
        double perimeter2 = sh.getPerimeter();
        
        System.out.println(perimeter1);
        System.out.println(perimeter2);
    }
}