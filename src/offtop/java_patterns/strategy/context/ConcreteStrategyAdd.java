package java_patterns.strategy.context;

class ConcreteStrategyAdd implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyAdd's execute()");   // execute - выполнять
        return a + b;
    }
}
