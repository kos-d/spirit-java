package library.patterns.abstract_factory.factory;

public class WindowsFactory extends Factory{
    
    protected WindowsFactory() {}

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }

    @Override
    public Panel createPanel() {
        return new WindowsPanel();
    }
    
}
