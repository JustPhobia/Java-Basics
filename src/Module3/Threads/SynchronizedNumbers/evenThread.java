package Module3.Threads.SynchronizedNumbers;

public class evenThread implements Runnable{
    NumberPrinter printer;
    int index;

    public evenThread(NumberPrinter printer, int index) {
        this.printer = printer;
        this.index = index;
    }

    @Override
    public void run() {
        int num = 0;
        while (num < index) {
            printer.evenPrint(index);
            num++;
        }

    }
}
