package p1.single;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
    }

}
