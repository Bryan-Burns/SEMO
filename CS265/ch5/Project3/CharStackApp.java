import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ziping
 */
public class CharStackApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }

        String inputFileName;
        Scanner inputFile;
        Scanner input = new Scanner(System.in);

        //prompt user to enter file name for palindrome check
        //(use provided palindrome1.txt and palindrome2.txt files)
        //read file line by line and use the CharStack class to check
        System.out.print("Please enter a file to check for palindromes: ");
        inputFileName = input.nextLine();

        try {
            inputFile = new Scanner(new File(inputFileName));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return;
        }

        //if the line is palindrome, you need to call StringToStack() function to 
        //push all letters from the line to a CharStack
        while (inputFile.hasNextLine()) {
            String currentLine = inputFile.nextLine().toLowerCase();
            CharStack charStack = new CharStack();
            charStack.StringToStack(currentLine);

            //output the stack using toString() function
            System.out.println(charStack.toString());

            //then call reverse() function to get the reverse of the above CharStack
            CharStack reversedCharStack = charStack.Reverse();

            //call equals() function to check if the contents of two CharStacks
            //are the same and make decision about palindrome
            if (charStack.equals(reversedCharStack)) {
                //output all palindrome lines to a file to save them
                try {
                    writer.write(charStack.toString());
                    writer.write("\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                    return;
                }
            }
        }
        try {
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}