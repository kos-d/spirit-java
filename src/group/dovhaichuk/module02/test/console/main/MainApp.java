package module02.test.console.main;

import module02.test.console.lib.Message;
import module02.test.console.lib.Verification;

public class MainApp {
    public static void main(String[] args) {
        Message mes = new Message();
        mes.message();

        Verification verifi = new Verification();
        verifi.verificationMethod();
        verifi.messageVerifi();

  //      String loginName = verifi.getLogin();

//        System.out.println("Hello " + loginName + "!");
    }

}
