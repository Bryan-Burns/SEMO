/*
Author: Bryan Burns
Date: 2/20/2022
Purpose: An abstract class that allows you to compare 2 circles or rectangles.
*/
public class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1.0);
    }

    public Circle(double radius, String color, boolean filled) {
        this(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }



}
