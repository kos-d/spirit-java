package module11.practice.lesson2;

import java.lang.annotation.Annotation;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Repeat(3)
public class Executor {
    private final static int POOL_SIZE = 10;
    
    private final static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(POOL_SIZE);
    
    public static Scheduler getScheduler() {
        return (Runnable task, Integer delaySec) -> executorService
                .schedule(task, delaySec, TimeUnit.SECONDS);
    }
    
    public static void main(String[] args) {
        
        Annotation[] annotations = Executor.class.getAnnotations();
        System.out.println(Arrays.toString(annotations));
        
        Scheduler scheduler = getScheduler();
        System.out.println(LocalDateTime.now());
        scheduler.apply(() -> System.out.println(LocalDateTime.now() + " -> task_1"), 5);
        scheduler.apply(() -> System.out.println(LocalDateTime.now() + " -> task_2"), 3);
        executorService.shutdown();
    }
}