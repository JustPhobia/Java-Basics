package Module3.Threads.RelatedAsynchronous;

public class Counter {
    private int  counter=0;

    public void increment(){
        counter++;
    }

    public void decrement(){
        counter--;
    }

    @Override
    public String toString() {
        return  "" +counter ;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        IncrementThread inc = new IncrementThread(counter);
        DecrementThread dec = new DecrementThread(counter);
        IncrementThread inc2 = new IncrementThread(counter);
        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(dec);
        Thread t3 = new Thread(inc2);

        t1.start();
        t2.start();
        t3.start();
        System.out.println(counter);
    }
}
