/**
 * @author Bryan Burns
 * Date: 4/13/2022
 * Description: Main function for number 2 code and gives correct output.
 */

public class Num2Main {

    public static void main(String[] args) {

        Queue Q = new Queue();
        int x, y;

        x = 5;
        Q.enqueue(8);
        Q.enqueue(x + 3);
        y = Q.front();
        Q.enqueue(2 * y);
        Q.dequeue();
        x = Q.front();
        Q.enqueue(Q.front());
        System.out.println("Q = " + Q.toString());

        //Answer = 8, 16, 8

    }

}
