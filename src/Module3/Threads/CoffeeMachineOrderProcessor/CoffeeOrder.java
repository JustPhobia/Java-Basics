package Module3.Threads.CoffeeMachineOrderProcessor;

public class CoffeeOrder {
    private CoffeeMachine coffeeMachine;
    int beans = 0;
    int water = 0;
    int cups = 0;
    String name;


    public CoffeeOrder(CoffeeMachine coffeeMachine,String name, int beans, int water, int cups) {
        this.coffeeMachine = coffeeMachine;
        this.name = name;
        this.beans = beans;
        this.water = water;
        this.cups = cups;
    }

    public synchronized void createCoffee(){
        while (coffeeMachine.getBeans() < beans || coffeeMachine.getWater() < water || coffeeMachine.getCups() < cups){
            try {
                System.out.println(name +" is waiting for refill");
                wait();

            } catch (InterruptedException e) {
                System.out.println("Coffee Order Interrupted");
            }

        }


        coffeeMachine.removeBeans(beans);
        coffeeMachine.removeCups(cups);
        coffeeMachine.removeWater(water);

        System.out.println(getCoffee());
        System.out.println(this.name + " has been made!");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        notifyAll();
    }

    public String getName() {
        return name;
    }

    public String getCoffee() {
        return coffeeMachine.toString();
    }
}
