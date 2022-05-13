/**
 * @author Bryan Burns
 * Date: 4/13/2022
 * Description: Main function for number 1 code and gives correct output.
 */

public class Num1Main {

    public static void main(String[] args) {
        Stack S = new Stack();
        int x, y;
        x = 5;
        S.push(8);
        S.push(x + 3);
        y = S.peek();
        S.push(2 * y);
        S.pop();
        x = S.peek();
        S.push(S.peek());
        while(!S.empty()) {
            System.out.println("S = " + S.pop());
        }

        //Answer is 8, 8, 8
    }
}
