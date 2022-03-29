package goit.module06.practice.lesson1.abstract_factory.panel;

import goit.module06.practice.lesson1.abstract_factory.interfaces.Panel;

public class MacPanel implements Panel {
    
    @Override
    public void handlePanel() {
        System.out.println("Handle Mac Panel !");
    }
}