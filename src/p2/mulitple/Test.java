package p2.mulitple;

import p1.single.Task;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)  {
            Thread thread = new Thread(new Task());
            thread.start();
        }
    }
}
