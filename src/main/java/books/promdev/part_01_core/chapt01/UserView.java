package books.promdev.part_01_core.chapt01;

public class UserView {
    public static void welcome(User obj) {
        System.out.printf("Hello! Input code: %d, password: %s", obj.getNumericCode(), obj.getPassword());
    }
}