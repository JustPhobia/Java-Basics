package Module3.Threads.Unrelated_Asynchronous;

import java.util.Random;

public class AsynchronousMessagePrint implements Runnable{
private String[] jokePool = {
        "I tried to catch fog yesterday… I mist.",
        "Why don’t programmers like nature? Too many bugs.",
        "I told my computer I needed a break… it said 'No problem, I'll go to sleep.'",
        "Parallel lines have so much in common… it’s a shame they’ll never meet.",
        "Why did the scarecrow win an award? He was outstanding in his field.",
        "My code works… I have no idea why.",
        "I would tell you a UDP joke… but you might not get it.",
        "Debugging: being the detective in a crime movie where you are also the murderer."
};

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(random.nextInt(1000,3000));
                System.out.println(jokePool[random.nextInt(jokePool.length)] = jokePool[i]);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
