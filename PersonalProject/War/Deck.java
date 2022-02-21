import java.util.ArrayList;

public class Deck {

    private static ArrayList<String> suits;
    private static Card[] deck;

    public Deck(ArrayList<String> suits){
        Deck.suits = suits;
        Deck.deck = makeDeck();
    }

    private Card[] makeDeck(){
        int count = 0;
        Card[] deck = new Card[52];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                deck[count] = new Card(suits.get(i), (j + 1));
                count++;
            }
        }
        return deck;
    }

    public Card[] getDeck() {
        return deck;
    }

    public static ArrayList<String> getSuits() {
        return suits;
    }

    public Card getCard(int index){
        return deck[index];
    }

    public Card getRandomCard(){
        return deck[(int) (Math.random() * 52)];
    }
}
