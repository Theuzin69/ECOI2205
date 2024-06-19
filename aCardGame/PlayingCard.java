package Piles;

import java.awt.*;

public class PlayingCard {
    private boolean faceUp;
    private int rank;
    private Suits suit;

    public enum Suits {
        Spade, Diamond, Club, Heart;
    }

    public PlayingCard(Suits suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        faceUp = false;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void flip() {
        faceUp = !faceUp;
    }

    public int getRank() {
        return rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public Color getColor() {
        if (suit == Suits.Heart || suit == Suits.Diamond)
            return Color.RED;
        return Color.BLACK;
    }
}
