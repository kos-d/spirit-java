package module02.console.main;

import module02.console.lib.Message;
import module02.console.lib.Verification;

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
