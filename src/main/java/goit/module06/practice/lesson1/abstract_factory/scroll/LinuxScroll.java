package goit.module06.practice.lesson1.abstract_factory.scroll;

import goit.module06.practice.lesson1.abstract_factory.interfaces.Scroll;

public class LinuxScroll implements Scroll {

    @Override
    public void handleScroll() {
        System.out.println("Handle Linux Scroll !");
    }
}