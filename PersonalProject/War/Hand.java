import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(ArrayList<Card> hand){
        this.hand = hand;
    }

    public void showHand(){
        System.out.println(hand);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void getRandomHand(int numCards){
        Deck deck = new Deck(makeSuitsArray());
        for (int i = 0; i < numCards; i++){
            Card card = deck.getRandomCard();
            if (checkCard(card)){
                card = deck.getRandomCard();
                checkCard(card);
            }
            hand.add(card);
        }
    }

    private boolean checkCard(Card card){
        return hand.contains(card);
    }

    private ArrayList<String> makeSuitsArray(){
        ArrayList<String> suits = new ArrayList<>();
        suits.add("Spades");
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Clubs");
        return suits;
    }
}
