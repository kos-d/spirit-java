package library.patterns.abstract_factory.factory;

public class LinuxPanel implements Panel{

    @Override
    public void handlePanel() {
        System.out.println("Handle Linux Panel !");
    }
    
}