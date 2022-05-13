public class Cat extends Animal{

    private String color;

    public Cat(boolean vegetarian, String eatings, int numOfLegs, String color) {
        super(vegetarian, eatings, numOfLegs);
        this.color = color;
    }

    public Cat() {
        this(false, "meat", 4, "black");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color = " + color;
    }
}