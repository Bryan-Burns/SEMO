import java.util.ArrayList;

public class CardMain {
    public static void main(String[] args){
        ArrayList<String> suits = new ArrayList<>();
        suits.add("Spades"); suits.add("Diamonds"); suits.add("Hearts"); suits.add("Clubs");
        Deck myDeck = new Deck(suits);
        Card myCard = myDeck.getRandomCard();
        System.out.println(myCard);
    }
}
