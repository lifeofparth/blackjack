/* Parth Chhasatiya
   September 10, 2019
   Purpose: This program is used to play the card game, War
   Inputs: N/A
   Output: The cards each player plays each turn and the end results of each round 
 */
import java.util.ArrayList;

/** 
 * This class will hold all of our War game logic.
 * It will add Cards to each player's hand and compare
 * the cards to see who wins each round.
 * @author Parth Chhasatiya
 */
public class War {

	public static void main(String[] args) {
		/** initializes an empty Array List full of 26 cards named player1 */
		ArrayList<Card> player1 = new ArrayList<Card>(26);
		/** initializes an empty Array List full of 26 cards named player2 */
		ArrayList<Card> player2 = new ArrayList<Card>(26);
		/** initializes a card C with no value and suit */
		Card C;
		/** initializes a card D with no value and suit */
		Card D;
		/** initializes a new deck full of 52 cards */
		Deck deck = new Deck(); 
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			C = deck.drawRandomCard();
			D = deck.drawRandomCard();
			player1.add(C); //adds 26 unique random cards to player 1's hand
			player2.add(D); //adds 26 unique random cards to player 2's hand
		}
		
		int x = 0;
		
		while (x == 0) { //game will continue until one player's hand is empty
			if (x == player1.size()) {
				System.out.println("Player 2 wins the game!");
				break;
			}
			
			if (x == player2.size()) {
				System.out.println("Player 1 wins the game!");
				break;			}
			
			if ((x < player1.size())&&(x < player2.size())){ //actual game logic
				System.out.println("Player 1's Deck Size: " + player1.size());
				System.out.println("Player 2's Deck Size: " + player2.size());
				System.out.println("Player 1 plays the " + player1.get(x).toString());
				System.out.println("Player 2 plays the " + player2.get(x).toString());

				if (player1.get(x).getValue() > player2.get(x).getValue()) { // compares the two cards played
					player1.add(player2.get(x)); //adds and removes the two cards played to the
					player1.add(player1.get(x)); //correct hand 
					player1.remove(x);
					player2.remove(x);
					System.out.println("Player 1 wins the round! \n");
				}
				
				else if (player1.get(x).getValue() < player2.get(x).getValue()) { //compares the two cards played
					player2.add(player1.get(x));
					player2.add(player2.get(x));
					player1.remove(x);
					player2.remove(x);
					System.out.println("Player 2 wins the round! \n");
				}
				
				else { //War logic for if the cards tie
					if (player2.size() < 4) {//if player2 doesn't have enough cards to go to war 
						System.out.println("\n Player 2 does not have enough cards to go to war :( Player 1 wins!"); //if player1 doesn't have enough cards to go to war
						break; }
					else if (player1.size() < 4) { //if player 1 doesn't have enough cards to go to war
						System.out.println("\n Player 1 does not have enough cards to go to war :( Player 2 wins!");
						break; }
					else {
						while (player1.get(x).getValue() == player2.get(x).getValue()) {
							System.out.println("IT'S TIME FOR WAR!!!");
							for (int m = 1; m < 5; m++) {
								System.out.println("War Card for player 1 is..." + player1.get(x+m).toString());
								System.out.println("War Card for player 2 is..." + player2.get(x+m).toString()); 
							}
					
							if (player1.get(x+4).getValue() > player2.get(x+4).getValue()) {
								System.out.println("Player 1 wins the round! \n");
								for(int i = 0; i < 5; i++) {
									player1.add(player1.get(x));
									player1.add(player2.get(x));
									player1.remove(x);
									player2.remove(x);
								}
							}
					
							else if (player1.get(x+4).getValue() < player2.get(x+4).getValue()) {
								System.out.println("Player 2 wins the round! \n");
								for (int z = 0; z < 5; z++) {
									player2.add(player1.get(x));
									player2.add(player2.get(x));
									player1.remove(x);
									player2.remove(x);
								}
							}
						}
					}
				}
			}
		}
	}
}