package Module3.Threads.ProducerConsumerProblem;
import java.util.LinkedList;

public class ProducerConsumer {
    LinkedList<Integer> items = new LinkedList<>();
    public synchronized void add(Integer item) {
        while ((items.size() > 5)) {
            System.out.println("Producer is waiting...");
            System.out.println();
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer is no longer waiting");
            }
        }
        items.push(item);
        notifyAll();
    }
    public synchronized void pop(int count) {
        while (items.isEmpty()) {
            System.out.println("Consumer is waiting...");
            System.out.println();
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer is ready to consume...");
            }
        }
        System.out.println(count + " :Consumer took: " + this.items.pop());
        notifyAll();
    }

    public static void main(String[] args) {
        ProducerConsumer items = new ProducerConsumer();
        Producer producer = new Producer(items);
        Consumer consumer = new Consumer(items);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
        System.out.println(items.items);
    }
}
