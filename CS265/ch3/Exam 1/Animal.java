import java.util.Date;

public class Animal {

    private boolean vegetarian;
    private String eatings;
    private int numOfLegs;
    private final Date birthDate;

    public Animal(boolean vegetarian, String eatings, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.eatings = eatings;
        this.numOfLegs = numOfLegs;
        birthDate = new Date();
    }

    public Animal() {
        this(true, "leaves", 4);
    }

    public void setAnimal(boolean vegetarian, String eatings, int numOfLegs){
        this.vegetarian = vegetarian;
        this.eatings = eatings;
        this.numOfLegs = numOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEatings() {
        return eatings;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "vegetarian = " + vegetarian +
                ", eatings = " + eatings +
                ", numOfLegs = " + numOfLegs +
                ", birthDate = " + birthDate;
    }
}