public class Num4Main {

    public static boolean isGreaterThan(Stack s1, Stack s2) {
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;
        int count2 = 0;
        Stack s1Copy = new Stack();
        Stack s2Copy = new Stack();

        // Getting sums
        while (!s1.empty()) {
            s1Copy.push(s1.peek());
            if (count % 2 == 0) {
                sum1 += s1.pop();
            } else {
                s1.pop();
            }
            count++;
        }

        while (!s2.empty()) {
            s2Copy.push(s2.peek());
            if (count2 % 2 == 0) {
                sum2 += s2.pop();
            } else {
                s2.pop();
            }
            count2++;
        }

        // Making stacks the same as before
        while (!s1Copy.empty()) {
            s1.push(s1Copy.pop());
        }

        while (!s2Copy.empty()) {
            s2.push(s2Copy.pop());
        }

        return sum1 > sum2;
    }
}
