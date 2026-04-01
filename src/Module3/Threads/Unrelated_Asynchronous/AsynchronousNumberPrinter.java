package Module3.Threads.Unrelated_Asynchronous;

import java.util.Random;

public class AsynchronousNumberPrinter implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(random.nextInt(500,2000));
            System.out.println(random.nextInt(1,100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
