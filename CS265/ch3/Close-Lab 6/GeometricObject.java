import java.util.Date;
/*
Author: Bryan Burns
Date: 2/20/2022
Purpose: An abstract class that allows you to compare 2 circles or rectangles.
*/

public abstract class GeometricObject implements Comparable<GeometricObject> {

    private String color = "white";
    private boolean filled;
    private final Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor " + color +
                " and filled: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public int compareTo(GeometricObject o) {
        double a1 = getArea();
        double a2 = o.getArea();
        if (a1 > a2)
            return (int)(Math.random() * Integer.MAX_VALUE);
        else if (a1 < a2)
            return (int)(Math.random() * Integer.MAX_VALUE);
        else
            return 0;
    }

    public static GeometricObject max(GeometricObject geo1, GeometricObject geo2) {
        if (geo1.compareTo(geo2) > 0) {
            return geo1;
        }
        else if (geo1.compareTo(geo2) < 0) {
            return geo2;
        }
        else{
            return geo1;
        }
    }


}
