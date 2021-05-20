package library.patterns.abstract_factory.clients;

import library.patterns.abstract_factory.factory.Factory;

public class Main {
    
    //Possile params : WINDOWS, LINUX or MAC
    public final static String OS = "WINDOWS";

    public static void main(String[] args) {
        
        //new MacFactory(); -> impossible action (constructor has access modifier protected)
        
        //creating instances of a class (factory implementation) is only possible using the static method 'of'
        Factory factory = Factory.of();
        factory.createButton().handleButton();
        factory.createPanel().handlePanel();
        factory.createScroll().handleScroll();
    }

}
