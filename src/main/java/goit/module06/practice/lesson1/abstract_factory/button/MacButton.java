package goit.module06.practice.lesson1.abstract_factory.button;

import goit.module06.practice.lesson1.abstract_factory.interfaces.Button;

public class MacButton implements Button {

    @Override
    public void handleButton() {
        System.out.println("Handle Mac Button !");
    }
}