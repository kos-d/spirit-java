package module06.practice.lesson1.abstract_factory.scroll;

import module06.practice.lesson1.abstract_factory.interfaces.Scroll;

public class WindowsScroll implements Scroll {

    @Override
    public void handleScroll() {
        System.out.println("Handle Windows Scroll !");
    }
}