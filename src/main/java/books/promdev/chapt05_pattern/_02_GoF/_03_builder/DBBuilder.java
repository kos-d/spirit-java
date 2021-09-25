package books.promdev.chapt05_pattern._02_GoF._03_builder;

public class DBBuilder extends BaseBuilder {
    @Override
    public void buildLogin() {
        user.setLogin("Moderator");
    }
    @Override
    public void buildPassword() {
        user.setPassword("Ku");
    }
}