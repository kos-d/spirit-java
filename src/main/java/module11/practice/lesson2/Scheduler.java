package module11.practice.lesson2;

import java.util.concurrent.ScheduledFuture;
import java.util.function.BiFunction;


@FunctionalInterface
public interface Scheduler extends BiFunction<Runnable, Integer, ScheduledFuture>{

    @Override
    public ScheduledFuture apply(Runnable task, Integer delaySec);
    
    //()->{...}
    
    
}
