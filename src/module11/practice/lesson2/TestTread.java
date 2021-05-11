package module11.practice.lesson2;

import java.util.concurrent.Callable;

public class TestTread implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "test";
    }
    
//    @SneakyThrows
//    public static void main(String[] args) {
//        new TestTread().call();
//    }
    
}