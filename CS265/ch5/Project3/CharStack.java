 /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */
import java.util.*;
/**
 *
 * @author ziping
 */
public class CharStack {
    private Stack<Character> myCharacters; // STL stack of chars.

    public void StringToStack(String inStr) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        myCharacters = new Stack<>();

        for (char currentChar : inStr.toCharArray()) {
            for (char currentAllowedChar : allowedChars.toCharArray()) {
                if (currentAllowedChar == currentChar) {
                    myCharacters.push(currentChar);
                    break;
                }
            }
        }
    }
    /*  StringToStack function reads the string into its private stack.
        Precondition: check if a character is an alphabetic letter
        Postcondition: only alphabetic letters of the string are in the private
stack.
                       Other characters(like space, digit, punct, etc) can not be
in the stack.

    */

    public CharStack Reverse() {
        if (myCharacters.isEmpty()) {
            System.out.println("Char Stack is empty,");
            return new CharStack();
        }
        CharStack charStack = new CharStack();
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : this.myCharacters) {
            stringBuilder.append(character);
        }
        charStack.StringToStack(stringBuilder.toString());

        CharStack reverseCharStack = new CharStack();
        StringBuilder reverseStringBuilder = new StringBuilder();
        for (int i = charStack.myCharacters.size() - 1; i > -1; i--) {
            reverseStringBuilder.append(charStack.myCharacters.get(i));
        }
        reverseCharStack.StringToStack(reverseStringBuilder.toString());
        return reverseCharStack;
    }
    /*  Reverse function first creates a deep copy of its private stack.
Then it empties out the deep copy into another stack,
        causing the order of the characters to be reversed.  Returns this new
stack.
        Precondition:  Private stack is not empty.
Postcondition:  If private stack is empty, displays error and returns.
         Otherwise: Returns new stack containing private stack's
    elements in reverse order.  Private stack should not be changed.
    */

    @Override
    public boolean equals (Object B) {
        if (B instanceof CharStack) {
            CharStack otherCharStack = (CharStack) B;
            if (this.myCharacters.isEmpty() || otherCharStack.myCharacters.isEmpty()) {
                System.out.println("One of the stack's is empty.");
                return false;
            }
            return this.myCharacters.equals(otherCharStack.myCharacters);
        }
        return false;
    }
    /* IsEqual function tests if both private stack and B's stack are the same.
        Precondition:  Neither stack is empty.
Postcondition:  If either stack is empty,
        displays error message and returns.
        Otherwise:
            Returns true if both stacks are the same, returns false otherwise.
            Both the private stack and B's stack are empty.
    */

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (char character : this.myCharacters) {
            str.append(character);
        }
        return str.toString();
    }
    /* Postcondition:  Contents of stack have been converted to string on one line.
       the private stack myCharacters is unchanged.
    */

}
