package books.promdev.part_01_core.chapt05_pattern._02_GoF._03_builder;

public class User {
    private String login = "Guest";
    private String password = "Kc";
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}