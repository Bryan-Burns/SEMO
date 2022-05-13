/*
Author: Bryan Burns
Date: 04/03/2022
Purpose: To write recursive functions and use them.
*/

import java.util.ArrayList;

public class cLab11 {

    public static void writeLine(char character, int numColumns) {
        if (numColumns != 0) {
            System.out.print(character);
            writeLine(character, numColumns - 1);
        }
        else {
            System.out.println();
        }
    }

    public static void writeBlock(char character, int numColumns, int numRows) {
        if (numRows != 0) {
            writeLine(character, numColumns);
            writeBlock(character, numColumns, numRows - 1);
        }
    }

    public static void writeBackwards(String s, int length) {
        if (length != 0) {
            System.out.print(s.charAt(length - 1));
            writeBackwards(s, length - 1);
        }
        else {
            System.out.println();
        }
    }

    public static void displayArrayList(ArrayList<Integer> A, int first, int last) {
        //base case
        if(first == last){
            return;
        }
        //recursive case
        else{
            System.out.println(A.get(first));
            displayArrayList(A, first + 1, last);
        }
    }

    public static int vowels(String s, int size) {
        //base case
        s.toLowerCase();
        if (size == 0) {
            return 0;
        }
        //recursive case
        if (s.charAt(size - 1) == 'a' || s.charAt(size - 1) == 'e' || s.charAt(size - 1) == 'i'
                || s.charAt(size - 1) == 'o' || s.charAt(size - 1) == 'u') {
            return (1 + vowels(s.substring(0, size-1), size - 1));
        }
        return vowels(s.substring(0, size-1), size - 1);

    }

    public static void reverseString(String s) {
        if (s.length() != 0) {
            System.out.print(s.charAt(s.length() - 1));
            reverseString(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        writeLine('*', 5);
        System.out.println();

        writeBlock('*', 5, 3);
        System.out.println();

        writeBackwards("abcde", 5);
        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);

        displayArrayList(arrayList, 0, arrayList.size());
        System.out.println();

        System.out.println(vowels("abcde", 5));
        System.out.println();

        reverseString("abcde");
        System.out.println();
    }
}