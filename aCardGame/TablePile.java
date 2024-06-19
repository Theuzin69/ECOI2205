package Piles;

public class TablePile extends CardPile {

    public TablePile(int x, int y, int c) {
        super(x,y);
        for(int i = 0;i<c;i++)
            addCard(Game.deckPile().pop());
        getTop().flip();
    }

    public boolean canTake(PlayingCard Card) {
        if(isEmpty())
            return ( Card.getRank() == 12 );
        PlayingCard topCard = getTop();
        return ( (Card.getColor() != topCard.getColor()) &&
                (Card.getRank() == (topCard.getRank() -1)) );
    }

    public boolean includes(int x, int y) {
        return ( (this.x <= x) && (x <= (this.x+CardView.Width))
        && (this.y <= y));
    }

    public void select(int x, int y) {
        if(isEmpty())
            return;

        PlayingCard topCard = getTop();
        if(!topCard.isFaceUp()) {
            topCard.flip();
            return;
        }

        topCard = pop();
        for(int i = 0;i<4;i++) {
            if(Game.tableau(i).canTake(topCard)) {
                Game.tableau(i).addCard(topCard);
                return;
            }
        }
        addCard(topCard);
    }

    public void display(CardView view) {
        Object [] cardArray = pile.toArray();
        int size = pile.size();
        int halfSize = (CardView.Height/2);
        int y = this.y;

        for(int i = (pile.size()-1);i>=0;i--) {
            view.display((PlayingCard) cardArray[i], this.x, y);
            y += halfSize;
        }
    }
}
