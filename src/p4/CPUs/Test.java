package p4.CPUs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        for (int i = 0; i < 100; i++) {
            service.execute(new CpuIntensiveTask());
        }
        service.shutdown();
    }
}
