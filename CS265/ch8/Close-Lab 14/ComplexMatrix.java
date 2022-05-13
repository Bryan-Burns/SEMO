/*
Author: Bryan Burns
Date: 04/13/2022
Purpose: To be able to add, multiply, and show matrices using complex numbers.
*/
public class ComplexMatrix extends GenericMatrix<Complex>{
    @Override
    protected Complex add(Complex o1, Complex o2) {
        return o1.add(o2);
    }

    @Override
    protected Complex multiply(Complex o1, Complex o2) {
        return o1.multiply(o2);
    }

    @Override
    protected Complex zero() {
        return new Complex(0);
    }
}
