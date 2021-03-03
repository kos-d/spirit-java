package java_patterns.strategy.context;

class ConcreteStrategySubtract implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Calles ConcreteStrategySubtract's execute()");
        return a - b;
    }
}
