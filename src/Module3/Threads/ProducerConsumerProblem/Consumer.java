package Module3.Threads.ProducerConsumerProblem;

import java.util.Random;

public class Consumer implements Runnable {
    private ProducerConsumer resource;

    public Consumer(ProducerConsumer resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(rand.nextInt(1000, 8000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.resource.pop(i);
        }
    }
}
