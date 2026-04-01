package Module3.Threads.ConveyorBeltProblem;

import java.util.Random;

public class AddWorker implements Runnable {
    ConveyorBelt belt;
    public AddWorker(ConveyorBelt belt){
        this.belt = belt;
    }
    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            belt.add(rand.nextInt(1,100));
        }
        System.out.println(belt.size());
    }
}
