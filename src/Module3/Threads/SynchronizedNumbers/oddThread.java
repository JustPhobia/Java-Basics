package Module3.Threads.SynchronizedNumbers;

public class oddThread implements Runnable {
    NumberPrinter printer;
    int index;

    public oddThread(NumberPrinter printer, int index) {
        this.printer = printer;
        this.index = index;
    }

    @Override
    public void run() {
        int num = 0;
        while (num < index) {
            printer.oddPrint(index);
            num++;
        }
    }
}
