package p4.CPUs;

public class CpuIntensiveTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is running..");
    }
}
