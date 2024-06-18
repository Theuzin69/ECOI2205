import java.util.Stack;

public class CardPile {
    protected int x, y;
    protected Stack pile;

    public CardPile(int x, int y) {
        this.x = x;
        this.y = y;
        pile = new Stack();
    }

    public PlayingCard getTop() {
        return (PlayingCard) pile.peek();
    }

    public boolean isEmpty() {
        return pile.stream().count() == 0;
    }

    public PlayingCard pop() {
        return (PlayingCard) pile.pop();
    }

    public boolean includes(int x, int y) {
        return (this.x <= x) && (x <= this.x + CardView.Width)
                && (y <= this.y) && (y <= this.y + CardView.Height);
    }

    public void select(int x, int y) {
    }

    public void addCard(PlayingCard Card) {
        pile.push(Card);
    }

    public void display(CardView Card) {
        if (isEmpty())
            Card.display(null, x, y);
        else
            Card.display(getTop(), x, y);
    }

    public boolean canTake(PlayingCard Card) {
        return false;
    }
}
