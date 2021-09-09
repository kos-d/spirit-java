package books.promdev.chapt01;

public class UserView {
    public static void welcome(User obj) {
        System.out.printf("Hello! Input code: %d, password: %s", obj.getNumericCode(), obj.getPassword());
    }
}