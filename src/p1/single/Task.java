package p1.single;

public class Task implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+ " is Running..");
    }
}
