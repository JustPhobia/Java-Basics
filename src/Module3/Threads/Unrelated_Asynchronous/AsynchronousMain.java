package Module3.Threads.Unrelated_Asynchronous;

public class AsynchronousMain {
    public static void main(String[] args) {
        AsynchronousMessagePrint textPrint = new AsynchronousMessagePrint();
        AsynchronousNumberPrinter numberPrinter = new AsynchronousNumberPrinter();
        Thread textThread= new Thread(textPrint);
        Thread numThread = new Thread(numberPrinter);

        numThread.start();
        textThread.start();

    }
}
