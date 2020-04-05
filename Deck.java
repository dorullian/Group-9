/*  The deck class is used to simply keep track of
 *  a array of booleans that represent a card so that
 *  each card in the deck is only delt once until the
 *  main class shuffles the deck which makes the array
 *  true again.
 */ 
import java.util.Arrays;

public class Deck {
	/*index numbers match the index of suit and rank in the card class
	 * for example fullDeck[5][0] would be the SIX of CLUBS
	 */
	private int numOfSuits= 4;
	private int numOfRanks= 13;
	private boolean[][] fullDeck= new boolean[numOfSuits][numOfRanks];


	public Deck() {
		for(int i=0; i <numOfSuits; i++) {
			for(int j=0; j< numOfRanks; j++) {
				fullDeck[i][j]= true;
			}
		}
	}
	
	//makes all the values in the element true again so the cards can be drawn	
	public void shuffle(){
		for(int i=0; i <fullDeck.length; i++) {
			for(int j=0; j<fullDeck.length; j++) {
				fullDeck[i][j]= true;
			}
		}
	  }
	//returns a true or false boolean based on if the card has already been delt
	public boolean checkCard(int number, int number2) {
		boolean card;
			if(fullDeck[number][number2] == true) {
				card= true;
			}
			else{
				card= false;
			}
		return card;
	}
	//changes the boolean at array index to false when card is delt
	public void dealCard(int number, int number2) {
		fullDeck[number][number2]= false;
	}
}
