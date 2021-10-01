package books.promdev.part_01_core.chapt04.transport;

import java.util.Random;

public class RepairingFactory {
    public Transport getClassFromFactory(int numMode) {
        switch (new Random().nextInt(numMode)) {
            case 0:
                return new Bus();
            case 1: 
                return new Tram();
            case 2:
                return new TrolleyBus();
            default:
                throw new IllegalArgumentException();
        }
    }
}