package Module3.Threads.RelatedAsynchronous;

public class DecrementThread implements Runnable {
    Counter counter;
    public DecrementThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            if (i%2 ==0){
                System.out.println();
            }
            counter.decrement();
            System.out.println("2:"+counter+" iteration "+i);
        }
    }
}
