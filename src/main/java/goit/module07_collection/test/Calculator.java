package goit.module07_collection.test;

public interface Calculator<N extends Number> {
    
    N sum(N num1, N num2);
    //<N extends Number> int sum (N a, N b);
    N sub(N num1, N num2);
    N multy(N num1, N num2);
    N div(N num1, N num2);
}
