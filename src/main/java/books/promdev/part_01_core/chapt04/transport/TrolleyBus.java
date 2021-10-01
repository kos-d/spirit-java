package books.promdev.part_01_core.chapt04.transport;

public class TrolleyBus extends Transport {
    @Override
    public void repair() {
        System.out.println("renovated TrolleyBus");
    }
}