package Module3.Threads.RelatedAsynchronous;

public class IncrementThread implements Runnable {
    Counter counter;
    public IncrementThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            if (i%2 ==0){
                System.out.println();
            }
            counter.increment();
            System.out.println("1: "+counter +" iteration "+i);

        }
    }
}