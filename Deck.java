/* Parth Chhasatiya
   September 10, 2019
   Purpose: This program is used to play the card game, War
   Inputs: N/A
   Output: The cards each player plays each turn and the end results of each round 
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/** 
 * This class will hold all of the deck's properties
 * and attributes, including its' methods
 * @author Parth Chhasatiya */
public class Deck { 
	
	/** creates an empty Array List full of the Object, Card */
	private static ArrayList<Card> myDeck; 
	
	/** This method will allow us to initialize
	 * and construct the Array List myDeck. */
	public Deck() {
		myDeck = new ArrayList<Card>();
		for (int x=0; x<4; x++) {
			for (int y=0; y<13; y++)
				myDeck.add(new Card(x,y)); //adds 52 Cards to the deck, creating a full deck
		}
	}
	
	/** This method will shuffle our deck
	 * so that the cards are in a randomized order 
	 */
	public void shuffle() {
		Collections.shuffle(myDeck);
	}
	
	/** This method will randomize a number between
	 * 0 and the size of the deck. That number will be an index in the array list
	 * and will be used to draw a card from the deck we created.
	 * The number will then be removed from the deck.
	 * @return a card from the deck
	 */
	public Card drawRandomCard() {
		Random gen = new Random();
		int index = gen.nextInt(myDeck.size());
		return myDeck.remove(index);
	}
	
	/** This method will output the deck and its' cards
	 * as a collection of strings
	 *@return the deck as a collection of strings */
	public String toString() {
		String yourDeck = "Deck: " + myDeck;
		return yourDeck;
	}
}

