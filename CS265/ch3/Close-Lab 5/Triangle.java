//Triangle class
public class Triangle extends GeometricObject{

    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 7, 9);
        triangle.setColor("yellow");
        triangle.setFilled(true);

        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println(triangle);
    }

    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = ((side1 + side2 + side3) / 2);
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
