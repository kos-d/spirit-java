package module11.practice.lesson2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable {
    
    class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            return Thread.currentThread().getName();
        }
    }
    
    public void start() throws Exception {
        //ExecutorService executor = Executors.newCachedThreadPool();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();
        
        System.out.println(LocalDateTime.now());
        
        for (int i = 0; i < 10; i++) {
            Future<String> result = executor.submit(new CallableClass());
            futures.add(result);
        }
        
        for (Future<String> future : futures) {
            System.out.println(LocalDateTime.now() + " -> " + future.get());
            //String get = future.get();
        }
    }
    
    public static void main(String[] args) throws Exception {
        new MyCallable().start();
    }
}