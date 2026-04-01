package Module3.Threads.SynchronizedNumbers;

public class NumberPrinter  {
    int num=1;
    public synchronized void evenPrint(int index){
        while (num%2!=0){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
        if (num<=index){
            System.out.println("Printing Even Number:");
            System.out.println(num);
            num++;
            notifyAll();
        }


    }
    public synchronized void oddPrint(int index){
        while (num%2==0){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
        if(num<=index){
        System.out.println("Printing Odd Number:");
        System.out.println(num);
        num++;
        notifyAll();
        }

    }
    public void run(){
        NumberPrinter printer=new NumberPrinter();

        oddThread odd = new oddThread(printer,9);
        evenThread even = new evenThread(printer,9);

        Thread oddCount = new Thread(odd);
        Thread evenCount = new Thread(even);

        oddCount.start();
        evenCount.start();
    }

    public static void main(String[] args) {
        new  NumberPrinter().run();
    }
}
