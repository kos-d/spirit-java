package books.promdev.chapt05_pattern._02_GoF._03_builder;

public abstract class BaseBuilder {
    protected User user = new User();
    
    public User getUser() {
        return user;
    }
    
    public abstract void buildLogin();
    public abstract void buildPassword();
}