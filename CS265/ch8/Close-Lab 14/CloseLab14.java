/*
Author: Bryan Burns
Date: 04/13/2022
Purpose: To test the ComplexMatrix class.
*/

public class CloseLab14 {

    public static void main(String[] args) {

        Complex[][] m1 = {{new Complex(1,1), new Complex(2, 2), new Complex(3, 3)},
                {new Complex(3, 3), new Complex(2,2), new Complex(1,1)},
                {new Complex(1, 1), new Complex(2, 2), new Complex(3, 3)}};

        Complex[][] m2 = {{new Complex(3, 3), new Complex(2,2), new Complex(1,1)},
                {new Complex(1,1), new Complex(2, 2), new Complex(3, 3)},
                {new Complex(3, 3), new Complex(2,2), new Complex(1,1)}};

        ComplexMatrix complexMatrix = new ComplexMatrix();

        ComplexMatrix.printResult(m1, m2, complexMatrix.addMatrix(m1, m2), '+');
        System.out.println();
        ComplexMatrix.printResult(m1, m2, complexMatrix.multiplyMatrix(m1, m2), '*');
    }

}