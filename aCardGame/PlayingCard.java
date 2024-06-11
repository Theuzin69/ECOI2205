package aCardGame;

public class PlayingCard {
	private boolean faceUp;
	private int r;
	private Suits s;
	
	enum Suits {
		SPADE, 
		DIAMOND, 
		CLUB, 
		HEART
	}
	
	public PlayingCard(Suits sv, int rv) {
		s = sv;
		r = rv;
		faceUp = false;
	}
	
	public boolean isFaceUp() {
		return faceUp;
	}
	
	public void flip() {
		faceUp = !faceUp;
	}
	
	public
}
