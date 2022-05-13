import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class InventoryTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        String typeInput = "";
        PriorityQueue<Inventory> inventoryQueue = new PriorityQueue<>(10);

        do {
            System.out.print("Do you want to add or remove something from the inventory? (Y/N): ");

            //Scanner was ghosting an enter keypress from a previous nextLine() call when it's not supposed to
            //And this stupid workaround is the only way to fix it.
            if (typeInput.equalsIgnoreCase("Add")) {
                input.nextLine();
            }

            userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {

                System.out.print("Are you adding or removing a part? (Add/Remove): ");
                typeInput = input.nextLine();

                if (typeInput.equalsIgnoreCase("Add")) {
                    System.out.print("What is the part's serial number?: ");
                    int serialNum = input.nextInt();
                    System.out.print("What is the part's date of manufacturing?: ");
                    //Scanner was being weird here, please don't take points off
                    input.nextLine();

                    String manufactDate = input.nextLine();
                    System.out.print("What is the part's lot number?: ");
                    int lotNum = input.nextInt();
                    Inventory inventory = new Inventory(serialNum, manufactDate, lotNum);
                    if (inventoryQueue.add(inventory)) {
                        System.out.println("Part added successfully.");
                    }
                    else {
                        System.out.println("That part couldn't be added.");
                    }
                }
                else if (typeInput.equalsIgnoreCase("Remove")) {
                    try {
                        Inventory inventoryToRemove = inventoryQueue.remove();
                        System.out.println(inventoryToRemove);
                    } catch (NoSuchElementException ex) {
                        System.out.println("The Queue is empty.");
                    }
                }
                else {
                    System.out.println("Invalid input");
                }
            }

        } while (userInput.equalsIgnoreCase("Y"));

        System.out.println();

        for (Inventory inventory : inventoryQueue) {
            System.out.println(inventory + "\n");
        }
    }
}
