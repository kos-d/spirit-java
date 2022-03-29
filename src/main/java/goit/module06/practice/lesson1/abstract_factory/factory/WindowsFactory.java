package goit.module06.practice.lesson1.abstract_factory.factory;

import goit.module06.practice.lesson1.abstract_factory.button.WindowsButton;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Button;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Panel;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Scroll;
import goit.module06.practice.lesson1.abstract_factory.panel.WindowsPanel;
import goit.module06.practice.lesson1.abstract_factory.scroll.WindowsScroll;

public class WindowsFactory extends Factory {

    protected WindowsFactory() {}
    
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }

    @Override
    public Panel createPanel() {
        return new WindowsPanel();
    }
}