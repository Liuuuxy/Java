
public class Card {
	private int number;//A,2,3,4,5,6,7,8,9,10,J,Q,K
	private String suit; // Heart, Spade, Diamond, Club
	
	public Card(int n, String s) {
		// TODO 3.1
		this.number = n;
		this.suit = s;

	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}

	
}
