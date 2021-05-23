package library.patterns.abstract_factory.factory;

public class WindowsScroll implements Scroll{

    @Override
    public void handleScroll() {
        System.out.println("Handle Windows Scroll !");
    }
    
}