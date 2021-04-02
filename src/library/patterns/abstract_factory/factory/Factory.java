package library.patterns.abstract_factory.factory;

import static library.patterns.abstract_factory.clients.Main.OS;

//factory is implementation of singletone patern with lazy initialization
public abstract class Factory {
    
    private static Factory factory;
    
    //Lazy initialization of singletone
    public static Factory of(){
        if(factory == null)factory = init(OS);
        return factory;	
    }
    //Factory Method implementation
    private static Factory init(String os) {
        switch(os){
            case "WINDOWS" : return new WindowsFactory();
            case "LINUX" : return new LinuxFactory();
            case "MAC" : return new MacFactory();
            default: throw new RuntimeException("Unsupported OS!");
        }
    }
    
    protected Factory() {}
    
    public abstract Button createButton();

    public abstract Scroll createScroll();

    public abstract Panel createPanel();

}
