package Piles;

public class DiscardPile extends CardPile {

    public DiscardPile(int x, int y) {
        super(x,y);
    }

    public void addCard(PlayingCard Card) {
        if(!Card.isFaceUp())
            Card.flip();
        super.addCard(Card);
    }

    public void select(int x, int y) {
        if(isEmpty())
            return;

        for(int i = 0;i<4;i++) {
            if(Game.suitPile(i).canTake(getTop())) {
                Game.suitPile(i).addCard(getTop());
                return;
            }
        }

        for(int i = 0;i<7;i++) {
            if(Game.tableau(i).canTake(getTop())) {
                Game.tableau(i).addCard(getTop());
                return;
            }
        }
        addCard(getTop());
    }
}
