package library.patterns.abstract_factory.factory;

public class LinuxFactory extends Factory{
    
    protected LinuxFactory() {}

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Scroll createScroll() {
        return new LinuxScroll();
    }

    @Override
    public Panel createPanel() {
        return new LinuxPanel();
    }
    
}
