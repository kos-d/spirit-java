package library.patterns.abstract_factory.factory;

public class WindowsButton implements Button{

    @Override
    public void handleButton() {
        System.out.println("Handle Windows Button !");
    }
    
}
