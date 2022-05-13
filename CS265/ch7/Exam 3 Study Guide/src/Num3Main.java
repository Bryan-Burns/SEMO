/**
 * @author Bryan Burns
 * Date: 4/13/2022
 * Description: Main function for number 3 and method.
 */

public class Num3Main {

    public static void main(String[] args) {

        double[] doubles = {2, 3.5, 8, 5, 6.25, 18, 4.25};

        System.out.println(sumOfArray(doubles, 0, doubles.length - 1));


    }

    public static double sumOfArray(double[] a, int first, int last) {
        //Base case
        if (first >= last) {
            return a[first];
        }

        //Math happens
        a[first + 1] = a[first] + a[first + 1];

        // Recursive Case
        return sumOfArray(a, first + 1, last);
    }

}
