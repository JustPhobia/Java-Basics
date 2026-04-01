package Module3.Threads.ConveyorBeltProblem;

public class RemoveWorker implements  Runnable {
    ConveyorBelt belt;
    public RemoveWorker(ConveyorBelt belt){
        this.belt = belt;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            belt.remove();
        }
        System.out.println(belt.size());
    }
}
