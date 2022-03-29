package goit.module07_collection.conspectus.video.lesson01;

public interface Car {
    static final int NUMBER_OF_WHEELS = 4;
    
    void drive();
    
    int horsePower();
    
    default int getNumberWheels() {
        return NUMBER_OF_WHEELS;
    }
}
