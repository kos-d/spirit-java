package books.promdev.part_01_core.chapt06_interface_inner_class.anonymous;

public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        for (Shape f : Shape.values()) {
            f.setShape(3, i--);
            System.out.println(f.name() + "-> " + f.getParameters()
                    + " square = " + f.getSquare());
        }
    }
}