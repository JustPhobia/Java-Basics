package Module3.Threads.CoffeeMachineOrderProcessor;

public class Barista {
    public void run(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeOrder latte = new CoffeeOrder(coffeeMachine, "Latte",5, 250,1);
        CoffeeOrder cappucino = new CoffeeOrder(coffeeMachine, "Cappucino",8, 250,1);
        CoffeeOrder frappucino = new CoffeeOrder(coffeeMachine, "Frappucino",6, 250,1);

        OrderProcessor latteProcessor = new OrderProcessor(latte);
        OrderProcessor cappucinoProcessor = new OrderProcessor(cappucino);
        OrderProcessor frappucinoProcessor = new OrderProcessor(frappucino);

        Thread latteThread = new Thread(latteProcessor);
        Thread  cappucinoThread= new Thread(cappucinoProcessor);
        Thread frappucinoThread = new Thread(frappucinoProcessor);

        latteThread.start();
        cappucinoThread.start();
        frappucinoThread.start();

    //Can receive user input to add functionality, for now goal wasn't intended so we will leave this as is.
    }
    public static void main(String[] args) {
        new  Barista().run();
    }
}
