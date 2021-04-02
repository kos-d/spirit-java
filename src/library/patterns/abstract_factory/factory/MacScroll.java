package library.patterns.abstract_factory.factory;

public class MacScroll implements Scroll{

    @Override
    public void handleScroll() {
        System.out.println("Handle Mac Scroll !");
    }
    
}