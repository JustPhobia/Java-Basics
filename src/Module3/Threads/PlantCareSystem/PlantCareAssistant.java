package Module3.Threads.PlantCareSystem;

import Module2.TaskManagerExercise.UtilClass;

import java.util.ArrayList;
import java.util.Scanner;

public class PlantCareAssistant{
    ArrayList<Plant> garden = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlantCareAssistant plantCare = new  PlantCareAssistant();
        Degrade degrade = new Degrade(plantCare);
        Thread degradeThread = new Thread(degrade);
        degradeThread.setDaemon(true);
        degradeThread.start();
        plantCare.run(sc);
    }

    public void run(Scanner sc){
        UtilClass utilClass = new UtilClass(sc);

        String name;
        String plantType;
        int waterIncrement;
        int sunlightIncrement;
        boolean running = true;

        try {
            while (running) {
                System.out.println("=================|Menu Selection|=================" +
                        "\n1. Add new plant" +
                        "\n2. Water plant" +
                        "\n3. Give plant more Sunlight" +
                        "\n4. View health and status of all plants" +
                        "\n5. Exit");
                System.out.print("Please enter your choice: ");

                switch (utilClass.getInputInt(1,5)) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Please enter the name you want to call this plant");
                        name = utilClass.getInputString("[^0-9]+");
                        System.out.println("Please enter the plant type:");
                        plantType = utilClass.getInputString("[^0-9]+");
                        System.out.println("Please enter the sunlight increment value:");
                        sunlightIncrement = utilClass.getInputInt(1,50 );
                        System.out.println("Please enter the water increment value:");
                        waterIncrement = utilClass.getInputInt(1,50 );
                        PlantType type = new PlantType(plantType, sunlightIncrement, waterIncrement);
                        addPlant(name, type);
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("What plant do you want to water: ");
                        displayGarden();
                        System.out.print("Please input the plant you wish to care for: ");
                        garden.get(utilClass.getIndexInt(garden.size())).water();
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.println("What plant do you want to increase sunlight levels for: ");
                        displayGarden();
                        System.out.print("Please input the plant you wish to care for: ");
                        garden.get(utilClass.getIndexInt(garden.size())).provideSunlight();
                        break;
                    case 4:
                        sc.nextLine();
                        displayStatusOfPlants();
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.println("Thank you for using PlantCareSystem :D" +
                                "\nEnjoy your day kind user");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid input, please try again.");
                }
            }
        }catch (Exception e){
            System.out.println("There was an error, please reload game.");
            sc.close();
        }

    }

    public void displayGarden(){
        for (int i = 0; i < garden.size(); i++) {
            System.out.println((i+1) + ": "+garden.get(i));
        }
        System.out.println();
    }

    public synchronized void addPlant(String name, PlantType type) {
        System.out.println("Adding plant " + name);
        Plant newPlant = new Plant(name, type);
        garden.add(newPlant);
        notifyAll();
    }
    public void waterPlant(String name) {
        if (garden.contains(name)) {
            int index = garden.indexOf(name);
            if(garden.get(index).waterLevel <100) {
                garden.get(index).water();

            }else {
                System.out.println(name+"does not need to be watered yet.");
            }

        }else{
            System.out.println("Plant " + name + " not found.");
        }
    }
    public void provideSunlightToPlant(String name) {
        if (garden.contains(name)) {
            int index = garden.indexOf(name);
            if(garden.get(index).sunlightLevel <100) {
                garden.get(index).provideSunlight();

            }else {
                System.out.println(name+"does not need sunlight yet.");
            }

        }else{
            System.out.println("Plant " + name + " not found.");
        }
    }
    public void displayStatusOfPlants() {
        System.out.println(toString());
    }
    public synchronized void startBackgroundDegradation() {
        for (int i = 0; i < garden.size(); i++) {
            garden.get(i).degrade();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( "===========Garden Status===========\n");
        for (int i = 0; i < garden.size(); i++) {
            sb.append( (i+1) +garden.get(i).toString());

        }

        return sb.toString();
    }
}
