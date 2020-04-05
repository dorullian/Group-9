
public class Card {
	private int rank;
	private int value;
	private int suit;
	private String[] ranks= {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING"};
	private String[] suits= {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};
	
	public Card(int suit, int rank) {
		this.suit= suit;
		this.rank= rank;
	}
	
	public void showCard() {
		System.out.println(ranks[rank] + " of " + suits[suit]);
	}
}
