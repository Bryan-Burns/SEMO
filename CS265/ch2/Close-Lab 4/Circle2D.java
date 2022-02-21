public class Circle2D {

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }


    private final double x,y;
    private final double radius;

    public Circle2D(){
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)) < radius;
    }

    public boolean contains(Circle2D circle) {
        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius2 = circle.getRadius();
        double radius3 = Math.abs(radius - radius2);
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)) <= radius3;
    }

    public boolean overlaps(Circle2D circle) {
        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius2 = circle.getRadius();
        double radius3 = radius + radius2;
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)) <= radius3;
    }
}
