package Module3.Threads.CoffeeMachineOrderProcessor;

public class CoffeeMachine {
    Integer MAX_WATER =10000;
    Integer MAX_CUPS =1000;
    Integer MAX_BEANS =1000;
    Integer beans =100;
    Integer water =10000;
    Integer cups =100;

    public void removeBeans(int amount){
        this.beans-=amount;
    }

    public void removeWater(int amount){
        this.water-=amount;
    }

    public void removeCups(int amount){
        this.cups-=amount;
    }

    public Integer getBeans() {
        return beans;
    }

    public Integer getCups() {
        return cups;
    }

    public void addBeans(Integer increase) {
        if (this.beans+increase<= MAX_BEANS || this.beans-increase>0) {
            this.beans += increase;
            System.out.println("Added beans. ");
        }else{
            System.out.println("Incorrect beans amount.");
        }
    }

    public Integer getWater() {
        return water;
    }

    public void addWater(Integer increase) {
        if (this.water+increase<= MAX_WATER || this.water-increase>0)  {
            this.water += increase;
            System.out.println("Added water. ");
        }else{
            System.out.println("Incorrect water amount.");
        }

    }

    public void addCups(Integer increase) {
        if (this.cups+increase<= MAX_CUPS || this.cups-increase>0) {
            this.cups += increase;
            System.out.println("Added Cups.");
        }else{
            System.out.println("Incorrect cups amount.");
        }
    }

    @Override
    public String toString() {
        return "|Current quantities: "+
                "|Beans = " + beans +
                "| Water = " + water +
                "| Cups = " + cups+
                "|";
    }
}
