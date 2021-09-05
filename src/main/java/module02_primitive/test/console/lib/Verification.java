package module02_primitive.test.console.lib;

import java.io.Console;

public class Verification {

    private String login;

    public Verification() {}

    public void verificationMethod() {
        Console console = System.console();
        if (console != null) {

            this.login = console.readLine("Input your login: ");
            char[] password = console.readPassword("Input your password: ");
        
            console.printf("Entered login: %s \n", login);
            console.printf("Entered password: %s \n", new String(password));
        }
    }
    public String getLogin() {
        return login;
    }
    public void messageVerifi() {
        System.out.println("Hello " + login + "!");
    }
}

