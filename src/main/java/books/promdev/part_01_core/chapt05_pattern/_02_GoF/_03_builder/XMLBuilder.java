package books.promdev.part_01_core.chapt05_pattern._02_GoF._03_builder;

public class XMLBuilder extends BaseBuilder {
    @Override
    public void buildLogin() {
        user.setLogin("Admin");
    }
    @Override
    public void buildPassword() {
        user.setPassword("Qu");
    }
}