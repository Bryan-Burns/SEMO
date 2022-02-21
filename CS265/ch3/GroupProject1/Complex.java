/*
Author: Ethan Brazzle and Bryan Burns
Date: 02/17/2022
Purpose: To create an interface on which complex numbers can be managed.
*/

public class Complex implements Cloneable {
    private double a;
    private double b;

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String add(Complex number) {
        return (getRealPart() + number.getRealPart()) + " + " + ((getImaginaryPart() + number.getImaginaryPart())) + "i";
    }

    public String subtract(Complex number) {
        return (getRealPart() - number.getRealPart()) + " + " + ((getImaginaryPart() - number.getImaginaryPart())) + "i";
    }

    public String multiply(Complex number) {
        return ((getRealPart() * number.getRealPart()) - (getImaginaryPart() * number.getImaginaryPart()) + " + " +
                (getImaginaryPart() * number.getRealPart()) + (getRealPart() * number.getImaginaryPart()) + "i");
    }

    public String divide(Complex number) {
        return ((((getRealPart() * number.getRealPart()) + (getImaginaryPart() * number.getImaginaryPart())) /
                (Math.pow(number.getRealPart(), 2) + Math.pow(number.getImaginaryPart(), 2))) + " + " +
                (((getImaginaryPart() * number.getRealPart()) - (getRealPart() * number.getImaginaryPart())) /
                        (Math.pow(number.getRealPart(), 2) + (Math.pow(number.getImaginaryPart(), 2)))) + "i");
    }

    public double abs() {
        return Math.sqrt((Math.pow(getRealPart(), 2)) + (Math.pow(getImaginaryPart(), 2)));
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    public String toString() {
        if (getImaginaryPart() == 0) {
            return getRealPart() + "";
        }
        else {
            return getRealPart() + " + " + getImaginaryPart() + "i";
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}