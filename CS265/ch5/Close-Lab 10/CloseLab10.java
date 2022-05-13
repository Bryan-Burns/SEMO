/*  
Author: Bryan Burns
Date: 3/23/22
Purpose: This program will read a file and tell if the line is a palindrome or not.
*/

import java.io.*;

public class CloseLab10 {

    public static void main(String[] args) throws IOException {

        Stack<Character> stack = new Stack<>();
        BufferedReader reader = new BufferedReader(new FileReader("palindrome.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String string;

        while((string = reader.readLine()) != null){

            string = string.toLowerCase().replaceAll("\\W", "");

            for(int i=0; i<string.length(); i++){
                stack.push(string.charAt(i));
            }

            StringBuilder theReverse= new StringBuilder();

            while (!stack.isEmpty()){
                theReverse.append(stack.pop().toString());
            }

            if(string.equals(theReverse.toString())){
                writer.write(String.format("Is a palindrome: %s.", theReverse));
            }
            else{
                writer.write("Not a palindrome.");
            }
            writer.newLine();
            writer.write("" );
            writer.newLine();

        }

        reader.close();
        writer.close();

    }

}