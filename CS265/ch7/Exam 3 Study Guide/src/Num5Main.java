/**
 * @author Bryan Burns
 * Date: 4/13/2022
 * Description: Main function for number 4 and method.
 */

public class Num5Main {

    public static void main(String[] args) {

        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.enqueue(100);
        q1.enqueue(200);
        q1.enqueue(300);
        q1.enqueue(500);
        q1.enqueue(600);

        q2.enqueue(-100);
        q2.enqueue(-200);
        q2.enqueue(-300);

        Queue q3 = MergeQueue(q1, q2);
        System.out.println(q3);
    }

    public static Queue MergeQueue(Queue Q1, Queue Q2) {
        Queue result = new Queue((Q1.size() + Q2.size()) * 2);

        if (Q1.size() >= Q2.size()) {
            for (int i = 0; i <= Q2.size() + 1; i++) {
                result.enqueue(Q1.dequeue());
                result.enqueue(Q2.dequeue());
            }
            while (!Q1.isEmpty()) {
                result.enqueue(Q1.dequeue());
            }
        } else {
            for (int i = 0; i <= Q1.size() + 1; i++) {
                result.enqueue(Q1.dequeue());
                result.enqueue(Q2.dequeue());
            }
            while (!Q2.isEmpty()) {
                result.enqueue(Q2.dequeue());
            }
        }

        return result;
    }

}
