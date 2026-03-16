package Module2.TestingStuff;
import java.util.Random;
import java.util.Scanner;

public class NameList {

    // Array holding 100 different names
    private String[] names = {
            "Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona", "George", "Hannah", "Ian", "Julia",
            "Kevin", "Laura", "Michael", "Nina", "Oscar", "Paula", "Quentin", "Rachel", "Steven", "Tina",
            "Ulysses", "Victoria", "William", "Xavier", "Yvonne", "Zachary", "Aaron", "Beth", "Carl", "Denise",
            "Ethan", "Faith", "Gavin", "Hailey", "Isaac", "Jasmine", "Kyle", "Lily", "Martin", "Natalie",
            "Oliver", "Penelope", "Quincy", "Rebecca", "Samuel", "Teresa", "Uriel", "Valerie", "Walter", "Xena",
            "Yosef", "Zoey", "Adam", "Bella", "Connor", "Danielle", "Elliot", "Grace", "Henry", "Isla",
            "Jack", "Kara", "Liam", "Maya", "Noah", "Olivia", "Patrick", "Queenie", "Raymond", "Sophia",
            "Thomas", "Uma", "Victor", "Wendy", "Ximena", "Yara", "Zane", "Andrea", "Blake", "Catherine",
            "Dominic", "Eva", "Felix", "Gabriella", "Harvey", "Ivy", "Jason", "Kimberly", "Leon", "Monica",
            "Nathan", "Ophelia", "Peter", "Quorra", "Riley", "Samantha", "Tristan", "Ursula", "Vincent", "Whitney"
    };

    // Method to print all names
    public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Method to get a random name
    public String getRandomName() {
        Random rand = new Random();
        return names[rand.nextInt(names.length)];
    }

    // Method to search for a name
    public boolean searchName(String target) {
        for (String name : names) {
            if (name.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }

    // Main program
    public static void main(String[] args) {
        NameList list = new NameList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the NameList Program!");
        System.out.println("Choose an option:");
        System.out.println("1. Print all names");
        System.out.println("2. Get a random name");
        System.out.println("3. Search for a name");
        System.out.println("4. Exit");

        boolean running = true;
        while (running) {
            System.out.print("\nEnter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice){
            }
        }

/*            switch (choice) {
                case 1:
                    list.printNames();
                    break;
                case 2:
                    System.out.println("Random name: " + list.getRandomName());
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String target = scanner.nextLine();
                    if (list.searchName(target)) {
                        System.out.println(target + " is in the list!");
                    } else {
                        System.out.println(target + " was not found.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }*/

        scanner.close();
    }
}