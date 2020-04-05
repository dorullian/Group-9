import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		/*Deck deck1= new Deck();
		System.out.println(deck1.dealCard(5)); */
		Random rand= new Random();
		Scanner scan= new Scanner(System.in);

		Deck blackJackDeck= new Deck();
		String input;
		int num1=rand.nextInt(4);
		int num2=rand.nextInt(13);
		
		do {
			System.out.println("Would you like to draw a card? y/n");
			input=scan.nextLine();
			
			//uses a while look to randomly check the array until we get a card that hasnt been delt
			 do{
				num1=rand.nextInt(4);
				num2=rand.nextInt(13);
			}while(blackJackDeck.checkCard(num1, num2) == false);
			 
			blackJackDeck.dealCard(num1, num2);
			Card playerCard1= new Card(rand.nextInt(4), rand.nextInt(13));
			playerCard1.showCard();
		}while(input != "n");


	}
}
