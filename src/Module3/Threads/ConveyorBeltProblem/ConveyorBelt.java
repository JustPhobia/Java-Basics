package Module3.Threads.ConveyorBeltProblem;

import java.util.LinkedList;

public class ConveyorBelt {
    private LinkedList<Integer> items = new LinkedList<>();

    public synchronized  void add( Integer item) {
        while (items.size()>100) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        items.add(item);
        System.out.println("ConveyorBelt: Adding " +item);
        notifyAll();
    }

    public synchronized  void remove() {
        while (items.size()<1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("ConveyorBelt: Removing " +items.pop());

        notifyAll();
    }

    public  synchronized int size() {
        return items.size();
    }
}
