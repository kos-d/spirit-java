package goit.module06.practice.lesson1.abstract_factory.panel;

import goit.module06.practice.lesson1.abstract_factory.interfaces.Panel;

public class LinuxPanel implements Panel {
    
    @Override
    public void handlePanel() {
        System.out.println("Handle Linux Panel !");
    }
}