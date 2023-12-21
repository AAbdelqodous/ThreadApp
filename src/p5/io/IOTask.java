package p5.io;

public class IOTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running..");
    }
}
