package books.promdev.chapt01;

public class Runner {
    public static void main(String[] args) {
        User user = new User();
        user.setNumericCode(71);
        user.setPassword("pass");
        UserView.welcome(user);
    }
}