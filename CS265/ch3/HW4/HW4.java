import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a a binary string: ");
        String binaryString = keyboard.nextLine();
        int binaryInt = bin2Dec(binaryString);
        System.out.println(binaryInt);
    }

    public static int bin2Dec(String binaryString) {
        try {
            return Integer.parseInt(binaryString, 2);
        }
        catch (NumberFormatException e) {
            System.out.println("A NumberFormatException occurred.");
            e.printStackTrace();
        }
        return 0;
    }
}