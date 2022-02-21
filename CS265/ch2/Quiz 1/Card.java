import java.util.Objects;

public class Card {

    private String suit;
    private int face;

    public Card(String suit, int face) {
        this.suit = suit;
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public void setCard(String suit, int face){
        this.suit = suit;
        this.face = face;
    }

    public Boolean isLessThan(Card C){
        return C.getFace() > this.face;
    }

    public String getFaceString(){
        return switch (this.face) {
            case 1 -> "Ace";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> "Invalid Card Face";
        };
    }

    @Override
    public String toString() {
        return "The " + getFaceString() + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        if (card.getSuit().equals(this.suit) && card.getFace() == this.face){
            return true;
        }
        return face == card.face && Objects.equals(suit, card.suit);
    }

}
