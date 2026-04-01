package Module3.Threads.ConveyorBeltProblem;

public class Output {
    public static void main(String[] args) {
        new Output().run();
    }
    public void run(){
        ConveyorBelt conveyorBelt = new ConveyorBelt();
        RemoveWorker removeWorker = new RemoveWorker(conveyorBelt);
        AddWorker addWorker = new AddWorker(conveyorBelt);

        Thread remove = new Thread(removeWorker);
        Thread add = new Thread(addWorker);

        add.start();
        remove.start();
    }
}
