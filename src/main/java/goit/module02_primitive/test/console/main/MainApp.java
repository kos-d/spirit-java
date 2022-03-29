package goit.module02_primitive.test.console.main;

import goit.module02_primitive.test.console.lib.Message;
import goit.module02_primitive.test.console.lib.Verification;

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
