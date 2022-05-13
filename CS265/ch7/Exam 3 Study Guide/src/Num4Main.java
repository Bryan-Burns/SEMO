/**
 * @author Bryan Burns
 * Date: 4/13/2022
 * Description: Main function for number 4 and method.
 */

public class Num4Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        RemoveItem(stack, 4);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

    }

    public static void RemoveItem(Stack aStack, int item) {
        Stack tempStack = new Stack();
        while (!aStack.empty()) {
            if (aStack.peek() == item) {
                aStack.pop();
            } else {
                tempStack.push(aStack.pop());
            }
        }

        while (!tempStack.empty()) {
            aStack.push(tempStack.pop());
        }
    }
}
