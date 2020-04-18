import java.util.Scanner;

/**Write a program that takes user input describing a playing card in the following
shorthand notation:
A Ace
2 ... 10 Card values
J Jack
Q Queen
K King
D Diamonds
H Hearts
S Spades
C Clubs
Your program should print the full description of the card.
 * @author Lyle
 *
 */
public class P3_14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cardName = "";
		System.out.print("Please enter card: ");
		String userCard = in.nextLine();
		in.close();
		
		char rank = userCard.charAt(0);
		char suit = userCard.charAt(1);
		
		if(rank == 'A') {
			cardName = "Ace";
		} else if(rank == 'J') {
			cardName = "Jack";
		} else if(rank == 'Q') {
			cardName = "Queen";
		} else if(rank == 'K') {
			cardName = "King";
		} else if(rank == '1') {
			cardName = "Ten";
			suit = userCard.charAt(2);
		} else {
			cardName += rank;
		}
	
		cardName += " of ";
		
		if(suit == 'H') {
			cardName += "Hearts";
		} else if(suit == 'S') {
			cardName += "Spades";
		} else if(suit == 'D') {
			cardName += "Diamonds";
		} else if(suit == 'C') {
			cardName += "Clubs";
		}
		
		System.out.println("Card is: " + cardName);
	}
	
}
