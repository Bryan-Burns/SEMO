/*
Author: Bryan Burns
Date: 2/20/2022
Purpose: An abstract class that allows you to compare 2 circles or rectangles.
*/
public class cLab6Test {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(1, 2);

        Circle circle = (Circle)GeometricObject.max(circle1, circle2);
        Rectangle rectangle = (Rectangle)GeometricObject.max(rectangle1, rectangle2);

        System.out.println("The max circle's radius is " + circle.getRadius());
        System.out.println(circle);
        System.out.println("The max rectangle's area is " + rectangle.getArea());
        System.out.println(rectangle);
    }

}
