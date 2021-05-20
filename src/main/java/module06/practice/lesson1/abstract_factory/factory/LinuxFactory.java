package module06.practice.lesson1.abstract_factory.factory;

import module06.practice.lesson1.abstract_factory.button.LinuxButton;
import module06.practice.lesson1.abstract_factory.interfaces.Button;
import module06.practice.lesson1.abstract_factory.interfaces.Panel;
import module06.practice.lesson1.abstract_factory.interfaces.Scroll;
import module06.practice.lesson1.abstract_factory.panel.LinuxPanel;
import module06.practice.lesson1.abstract_factory.scroll.LinuxScroll;

public class LinuxFactory extends Factory {
    
    protected LinuxFactory() {}

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Scroll createScroll() {
        return new LinuxScroll();
    }

    @Override
    public Panel createPanel() {
        return new LinuxPanel();
    }
}