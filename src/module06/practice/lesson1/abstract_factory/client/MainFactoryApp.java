package module06.practice.lesson1.abstract_factory.client;

import module06.practice.lesson1.abstract_factory.factory.Factory;

public class MainFactoryApp {
    
    //public final static String OS = "WINDOWS";
    //public final static String OS = "LINUX";
    public final static String OS = "MAC";
    
    public static void main(String[] args) {
        
        System.out.println("abstract factory from module 06 lesson 1");
        
        Factory factory = Factory.of();
        
        factory.createButton().handleButton();
        factory.createPanel().handlePanel();
        factory.createScroll().handleScroll();
    }
}