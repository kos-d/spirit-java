package goit.module06.practice.lesson1.abstract_factory.factory;

import goit.module06.practice.lesson1.abstract_factory.button.MacButton;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Button;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Panel;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Scroll;
import goit.module06.practice.lesson1.abstract_factory.panel.MacPanel;
import goit.module06.practice.lesson1.abstract_factory.scroll.MacScroll;

public class MacFactory extends Factory {
    
    protected MacFactory() {}

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Scroll createScroll() {
        return new MacScroll();
    }

    @Override
    public Panel createPanel() {
        return new MacPanel();
    }
}