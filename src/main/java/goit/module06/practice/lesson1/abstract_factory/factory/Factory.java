package goit.module06.practice.lesson1.abstract_factory.factory;

import static goit.module06.practice.lesson1.abstract_factory.client.MainFactoryApp.OS;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Button;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Panel;
import goit.module06.practice.lesson1.abstract_factory.interfaces.Scroll;

public abstract class Factory {
    
    private static Factory factory;
    
  
    
    public static Factory of() {
        if (factory == null) {
            factory = init(OS);
        }
        return factory;
    }
    
//    private static Factory init(String os) {
//        switch(os) {
//            case "WINDOWS" : return new WindowsFactory();
//            case "LINUX" : return new LinuxFactory();
//            case "MAC" : return new MacFactory();
//            default: throw new RuntimeException("Unsupported OS !");
//        }
//    }
    
    private static Factory init(String os) {
        if (os.equalsIgnoreCase("WINDOWS")) {
            return new WindowsFactory();
        }
        else if (os.equalsIgnoreCase("LINUX")) {
            return new LinuxFactory();
        }
        else if (os.equalsIgnoreCase("MAC")) {
            return new MacFactory();
        }
        throw new RuntimeException("Unsupported OS !");
    }
    
    public abstract Button createButton();
    
    public abstract Scroll createScroll();
    
    public abstract Panel createPanel();
}