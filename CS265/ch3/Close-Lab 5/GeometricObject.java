import java.util.Date;

public class GeometricObject {

    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
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
}
