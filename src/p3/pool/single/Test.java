package p3.pool.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newSingleThreadExecutor()){
            service.execute(() -> System.out.println(Thread.currentThread().getName() + " is running.."));
        }
    }
}
