package p3.pool.scheduled;

import p1.single.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        try(ScheduledExecutorService service = Executors.newScheduledThreadPool(10);) {
            service.schedule(new Task(), 10, TimeUnit.SECONDS);
//            service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
//            service.scheduleWithFixedDelay(new Task(), 10, 5, TimeUnit.SECONDS);
        }
    }
}
