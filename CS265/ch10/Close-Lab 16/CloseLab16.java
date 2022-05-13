/**
 * @authoor Bryan Burns
 * Date: 5/1/2022
 * Purpose: To use Stacks and Queues to check if strings from a file are palindromes.
 */

import java.io.*;
import java.util.*;

public class CloseLab16 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("palindrome.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
        Scanner input = new Scanner(bufferedReader);

        while (input.hasNextLine()) {
            char[] line = input.nextLine().toLowerCase().toCharArray();
            Queue forwardQueue = new Queue(line.length + 1);
            Stack<Character> reverseStack = new Stack<>();

            for (char c : line) {
                if (Character.isLetterOrDigit(c)) {
                    forwardQueue.enqueue(c);
                    reverseStack.push(c);
                }
            }

            StringBuilder forwardString = new StringBuilder();
            StringBuilder reverseString = new StringBuilder();
            while (!forwardQueue.empty()) {
                forwardString.append(forwardQueue.front());
                forwardQueue.dequeue();
                reverseString.append(reverseStack.pop());
            }

            if (forwardString.toString().equals(reverseString.toString())) {
                bufferedWriter.write("Is a palindrome: " + forwardString);
            } else {
                bufferedWriter.write("Not a palindrome: " + forwardString);
            }
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
