package module06.practice.lesson1.abstract_factory.button;

import module06.practice.lesson1.abstract_factory.interfaces.Button;

public class LinuxButton implements Button {

    @Override
    public void handleButton() {
        System.out.println("Handle Linux Button !");
    }
}