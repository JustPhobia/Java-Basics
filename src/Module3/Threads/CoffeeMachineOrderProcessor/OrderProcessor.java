package Module3.Threads.CoffeeMachineOrderProcessor;

public class OrderProcessor implements Runnable {
    CoffeeOrder coffeeOrder;
    public OrderProcessor(CoffeeOrder order) {
        this.coffeeOrder = order;
    }
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            coffeeOrder.createCoffee();
        }
    }
}
