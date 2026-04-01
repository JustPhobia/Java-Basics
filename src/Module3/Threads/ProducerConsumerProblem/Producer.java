package Module3.Threads.ProducerConsumerProblem;
import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable{
    private ProducerConsumer resource;

    public Producer(ProducerConsumer resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(rand.nextInt(1000,5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int item = rand.nextInt(100);
            System.out.println(i + " : Producer placed: " + item);

            this.resource.add(item);
        }
    }
}