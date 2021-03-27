package offtop.java_patterns.strategy.context;

class StrategyExample {

    public static void main(String[] args) {
        
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3, 4);

        context.setStrategy(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3, 4);

        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3, 4);
        
        System.out.println("Result A : "+ resultA);    
        System.out.println("Result B : "+ resultB);    
        System.out.println("Result C : "+ resultC);    

    }
}
