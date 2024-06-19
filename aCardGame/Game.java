import Piles.*;

public static class Game {
    private static CardPile[] allPiles;

    public static Game() {
        allPiles = new CardPile[13];
        allPiles[0] = new DeckPile(335, 5);
        allPiles[1] = new DiscardPile(268, 5);

        for(int i = 0;i<4;i++)
            allPiles[2+i] = new SuitPile(15+(60*i), 5);
        for(int i = 0;i<7;i++)
            allPiles[6+1] = new TablePile(5+(55*i), 80, i+1);
    }

    public void Paint(CardView view) {
        for(int i = 0;i<13;i++)
            allPiles[i].display(view);
    }

    public static void mouseDown(int x, int y) {
        for(int i = 0;i<13;i++) {
            if(allPiles[i].includes(x, y))
                allPiles[i].select(x, y);
        }
    }

    public static CardPile deckPile() {
        return allPiles[0];
    }
}
