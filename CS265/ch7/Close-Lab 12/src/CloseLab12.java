import java.io.*;
import java.util.Stack;

/*
Author:  Bryan Burns
Date: April 10, 2022
Purpose: Use Stacks and Queues to find palindromes in a file, and then add them to another file.
*/
public class CloseLab12 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/bryan/Desktop/CS265/Close-Lab 12/src/palindrome.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/bryan/Desktop/CS265/Close-Lab 12/src/output.txt"));

        String str;
        Stack stack = new Stack();
        QueueChar queueChar = new QueueChar(100);
        while ((str = reader.readLine()) != null) {
            str = str.toLowerCase().replaceAll("\\W", "");
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
                queueChar.enqueue(str.charAt(i));
            }

            StringBuilder reverse = new StringBuilder();
            StringBuilder reverse2 = new StringBuilder();
            while (!stack.isEmpty()) {
                reverse.append(stack.peek());
                stack.pop();
            }
            while (!queueChar.empty()) {
                reverse2.append(queueChar.front());
                queueChar.dequeue();

            }
            if (reverse2.toString().equalsIgnoreCase(reverse.toString())) {
                writer.write("Is a palindrome: " + reverse);
                writer.newLine();
            } else {
                writer.write("Not a palindrome: " + reverse);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();
    }


}