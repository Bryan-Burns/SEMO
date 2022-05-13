import java.util.Scanner;

/**
 *
 * @author Bryan Burns and Ethan Brazzle
 * Date: 4/24/2022
 * Purpose: This program tests the IntegerSet class with user testing whichever method they choose.
 */

public class project5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        IntegerSet mySet = new IntegerSet(10);
        for (int i = 0; i < 10; i++) {
            mySet.add((int) (Math.random() * 100));
        }
        mySet.display();

        IntegerSet mySet2 = new IntegerSet(10);
        String userInput;

        do {
            System.out.println("""
                0: Exit Program
                1: size() method\t2: isEmpty() method\t3: isMember() method
                4: add() method\t5: remove() method\t6: isSubset() method
                7: intersection() method\t8: union() method\t9: difference() method""");
            System.out.println();
            System.out.print("Choose an option: ");
            userInput = input.nextLine();

            switch (userInput) {
                case "0" -> {}
                case "1" -> System.out.println(mySet2.size());
                case "2" -> System.out.println(mySet2.isEmpty());
                case "3" -> {
                    System.out.print("Enter an int to check for: ");
                    System.out.println(mySet2.isMember(Integer.parseInt(input.nextLine())));
                }
                case "4" -> {
                    System.out.print("Enter an int to add: ");
                    System.out.println(mySet2.add(Integer.parseInt(input.nextLine())));
                }
                case "5" -> {
                    System.out.print("Enter an int to remove: ");
                    System.out.println(mySet2.remove(Integer.parseInt(input.nextLine())));
                }
                case "6" -> System.out.println(mySet.isSubset(mySet2));
                case "7" -> mySet.intersection(mySet2).display();
                case "8" -> mySet.union(mySet2).display();
                case "9" -> mySet.difference(mySet2).display();
                default -> System.out.println("Invalid input.");
            }
        } while (!userInput.equals("0"));

        mySet.display();
        mySet2.display();
    }
}
