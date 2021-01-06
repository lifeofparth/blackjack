/* Parth Chhasatiya
   September 10, 2019
   Purpose: This program is used to play the card game, War
   Inputs: N/A
   Output: The cards each player plays each turn and the end results of each round 
 */
/**
 * This class will hold all of the card properties and attributes.
 * @author Parth Chhasatiya */
public class Card {
	
	/** type of the card will be one of the four suits */
	private int type;
	/** value of the card will one of the 13 ranks */
	private int value;
	/** creates an array of the four suits */
	private String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"}; // creates an array of card suits
	/** creates an array of the 13 ranks */
	private String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "Ten", "Jack", "Queen", "King"}; // creates an array of card ranks
	
	/** This method will allow us to utilize the suit and rank
	 * arrays we created.
	 * @param typei the object's suit
	 * @param valuei the object's rank
	 */
	public Card(int typei, int valuei) {
		type = typei;
		value = valuei;
	}
	
	/** This method will output the card as a string representation. 
	 * Without this method the output's value would not display
	 * the card's data.
	 * @return the card as a string 
	 */
	public String toString() {
		String yourCard = rank[value] + " of " + suit[type]; // outputs a card
		return yourCard;
	}
	
	/** This method will get the value of the card by using it's rank.
	 * @return the value of the card as an integer
	 */
	public int getValue() {
		if (rank[value] == "2")
			return 2;
		if (rank[value] == "3")
			return 3;
		if (rank[value] == "4")
			return 4;
		if (rank[value] == "5")
			return 5;
		if (rank[value] == "6")
			return 6;
		if (rank[value] == "7")
			return 7;
		if (rank[value] == "8")
			return 8;
		if (rank[value] == "9")
			return 9;
		if (rank[value] == "Ten")
			return 10;
		if (rank[value] == "Jack")
			return 11;
		if (rank[value] == "Queen")
			return 12;
		if (rank[value] == "King")
			return 13;
		if (rank[value] == "Ace")
			return 14;
		else
			return 0;
	}
}