package Module3.Threads.PlantCareSystem;

import java.util.Objects;

public class Plant {
    String name;
    PlantType plantType;
    int health=100;
    int waterLevel=100;
    int sunlightLevel=100;

    public Plant(String name, PlantType plantType) {
        this.name = name;
        this.plantType = plantType;
    }

    public void water() {
        waterLevel += plantType.waterIncrement;
    }
    public void provideSunlight() {
        sunlightLevel += plantType.sunlightIncrement;
    }
    public void displayStatus() {
        System.out.println("|Name: " + name+"\t|");
        System.out.println("|PlantType: " + plantType+"\t|");
        System.out.println("|Health: " + health+"\t|");
        System.out.println("|Water Level: " + waterLevel+"\t|");
        System.out.println("|Sunlight Level: " + sunlightLevel+"\t|\n");
    }
    public synchronized void degrade(){
        if (this.sunlightLevel - plantType.sunlightIncrement >=0) {
            this.sunlightLevel -= plantType.sunlightIncrement;
        }else{
            if (health-5> 0) {
                this.health-=5;
            }else{
                System.out.println(name+"has died. :(");
            }
        }
        if (waterLevel - plantType.waterIncrement >=0) {
            this.waterLevel -= plantType.waterIncrement;
        }else{
            if (health-5> 0) {
                this.health-=5;
            }else{
                this.health-=5;
                System.out.println(name+"has died. :(");
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(name, plant.name);
    }

    @Override
    public String toString() {
        return "| "+this.name+" | Water Level: "+this.waterLevel+" | Sunlight Level: "+sunlightLevel+" | Health: "+this.health;
    }
}
