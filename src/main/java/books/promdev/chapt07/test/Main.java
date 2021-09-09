package books.promdev.chapt07.test;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Pifagor");
        String name = user.getName();
        System.out.println(name);
    }
}