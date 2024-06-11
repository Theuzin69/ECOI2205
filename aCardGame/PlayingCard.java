package aCardGame;

public class PlayingCard {
	private boolean faceUp;
	private int rank;
	private Suits suit;
	
	enum Suits {
		SPADE, 
		DIAMOND, 
		CLUB, 
		HEART
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
	
	public Suits suit() {
		return suit;
	}
	
	public Color color() {
		if(this.suit == Suits.HEART || this.suit == Suits.DIAMOND)
			return Color.red;
		return Color.black;
	}
}
