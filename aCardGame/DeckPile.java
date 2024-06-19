package Piles;

import java.util.ArrayList;
import java.util.Random;

public class DeckPile extends CardPile {

    public DeckPile(int x, int y) {
        super(x,y);

        ArrayList List = new ArrayList();
        for(int i = 0;i<=12;i++) {
            List.add(new PlayingCard(PlayingCard.Suits.Heart, i));
            List.add(new PlayingCard(PlayingCard.Suits.Diamond, i));
            List.add(new PlayingCard(PlayingCard.Suits.Spade, i));
            List.add(new PlayingCard(PlayingCard.Suits.Club, i));
        }

        Random random = new Random();
        for(int i=0;i<52;i++) {
            int index = random.nextInt(List.size());
            addCard((PlayingCard) List.get(index));
            List.remove(index);
        }
    }

    public void select(int x, int y) {
        if(isEmpty())
            return;
        Game.discardPile().addCard(pop());
    }
}
