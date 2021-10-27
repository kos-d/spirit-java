//package books.promdev.part_02_libraries.chapt09;

import java.io.Console;
import java.util.InputMismatchException;

public class Helper {

    public void readFromConsole() {
        Console con = System.console();
        if (con != null) {
            con.printf("Enter numerical code:");
            int code = 0;
            try {
                code = Integer.valueOf(con.readLine());
                System.out.println("Code access:" + code);
            } catch (InputMismatchException e) {
                con.printf("wrong format code" + e);
            }
            if (code != 0) {
//                con.printf("Enter password:");
                String password;
                char passTemp[] = con.readPassword("Enter password: ");
                password = new String(passTemp);
                System.out.println("Password: " + password);
            } else {
                System.out.println("Console offline");
            }
        }
    }
}
