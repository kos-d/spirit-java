package goit.module08.conspectus.materials.theme01;

import java.util.List;

public class TransportTest {
    public static void main(String[] args) {
        
    }
    public static void driveAllTransport(List<? extends Transport> transports) {
        for (Transport transport : transports) {
            transport.drive();
        }
    }
}