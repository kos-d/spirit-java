package library.patterns.abstract_factory.factory;

public class LinuxScroll implements Scroll{

    @Override
    public void handleScroll() {
        System.out.println("Handle Linux Scroll !");
    }
    
}