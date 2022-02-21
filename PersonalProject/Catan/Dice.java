package Catan;

public class Dice {

    public Dice() {

    }

    public int getDiceRoll(){
        return (int)(Math.random() * 6);
    }
}
