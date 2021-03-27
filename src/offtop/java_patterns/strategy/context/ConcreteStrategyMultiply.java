package offtop.java_patterns.strategy.context;

class ConcreteStrategyMultiply implements Strategy {

    public int execute(int a, int b) {
    System.out.println("Called ConcreteStrategyMultiply's execute()");
    return a * b;
    }
}
