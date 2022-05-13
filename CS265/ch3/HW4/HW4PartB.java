import java.util.Scanner;

public class HW4PartB {

    public static void main(String[] args) throws BinaryFormatException {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = keyboard.nextLine();
        int binaryInt = bin2Dec(binaryString);
        System.out.println(binaryInt);
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        if (!isBinaryString(binaryString)) {
            throw new BinaryFormatException();
        } else {
            return Integer.parseInt(binaryString, 2);
        }
    }

    public static boolean isBinaryString(String binaryString) {
        int i = 0;
        while (i < binaryString.length()) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                return false;
            }
            i++;
        }
        return true;

    }

    public static class BinaryFormatException extends Exception {
        public BinaryFormatException() {
            super("Not a binary value.");
        }
    }
}