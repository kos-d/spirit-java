package module06.practice.lesson1.abstract_factory.panel;

import module06.practice.lesson1.abstract_factory.interfaces.Panel;

public class WindowsPanel implements Panel{

    @Override
    public void handlePanel() {
        System.out.println("Handle Windows Panel !");
    }
}