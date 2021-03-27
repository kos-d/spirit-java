package offtop.java_patterns.strategy.parkAuto;

public  class Auto {

    FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void fill() {
        fillStrategy.fill();
    }
    
    public void gas() {
        System.out.println("Ride forward");
    }

    public void stop() {
        System.out.println("Brake");
    }
}
