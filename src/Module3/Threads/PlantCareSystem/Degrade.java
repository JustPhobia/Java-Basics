package Module3.Threads.PlantCareSystem;

public class Degrade implements Runnable {
    final PlantCareAssistant plantCareAssistant;
    public Degrade(PlantCareAssistant plantCareAssistant) {
        this.plantCareAssistant = plantCareAssistant;
    }
    @Override
    public void run() {
        synchronized (plantCareAssistant) {
        while (true) {
            while (plantCareAssistant.garden.isEmpty()) {
                try {
                    plantCareAssistant.wait();
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted");
                    ;
                }
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Degrade Class Error 2");
            }
            plantCareAssistant.startBackgroundDegradation();
        }
        }
    }
}

