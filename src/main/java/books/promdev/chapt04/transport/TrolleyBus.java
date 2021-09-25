package books.promdev.chapt04.transport;

public class TrolleyBus extends Transport {
    @Override
    public void repair() {
        System.out.println("renovated TrolleyBus");
    }
}