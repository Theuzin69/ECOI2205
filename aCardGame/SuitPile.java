package Piles;

public class SuitPile extends CardPile {

    public SuitPile(int x, int y) {
        super(x, y);
    }

    public boolean canTake(PlayingCard Card) {
        if(isEmpty())
            return (Card.getRank() == 0);
        PlayingCard topCard = getTop();
        return ( (Card.getSuit() == topCard.getSuit()) &&
                (Card.getRank() == (topCard.getRank() + 1)) );
    }
}
