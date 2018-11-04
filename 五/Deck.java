import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	Random random;
	
	public Deck() {
		this.cards = new ArrayList<Card>();
		this.random = new Random();
		
		// create all the cards
		this.generateDeck();
	}
	
	/*
	 * Generate all the cards for a deck
	 * the cards are stored in the member variable - cards
	 */
	private void generateDeck() {
		// TODO 3.1
		Deck deck = new Deck();
		for (int i = 0; i < 13; i++){
			for (int j = 0; j < 4; j++){
				String[] suitn = {"Heart","Spade","Diamond","Club"};
				deck.cards.add(new Card(i,suitn[j]));
			}
		}
	}

	/*
	 * Return a random card, remove it from the deck
	 */
	public Card getRandomCard() {
		int index = this.random.nextInt(this.cards.size());
		return this.cards.remove(index);
	}
	
	/*
	 * Create a CardGroup by picking 3 cards randomly
	 */
	public CardGroup createRandomCardGroup() {
		// TODO 3.1
		Card a = getRandomCard();
		Card b = getRandomCard();
		Card c = getRandomCard();
		CardGroup RandomCardGroup = new CardGroup(a,b,c);
		return RandomCardGroup; // to be replaced
	}
	/*@Override
	public String toString(){
		return cg1.
	}*/
	public static void main(String[] args) {
		Deck deck = new Deck();
		CardGroup cg1 = deck.createRandomCardGroup();
		CardGroup cg2 = deck.createRandomCardGroup();
		CardGroup cg3 = deck.createRandomCardGroup();
		if (cg1.compare(cg2)!=-1&&cg1.compare(cg3)!=-1){
			System.out.println("the biggest CardGroup is cg1");
			cg1.printCd();
		}
		else if(cg2.compare(cg1)!=-1&&cg2.compare(cg3)!=-1){
			System.out.println("the biggest CardGroup is cg2");
			cg2.printCd();
		}
		else if(cg3.compare(cg1)!=-1&&cg3.compare(cg3)!=-1){
			System.out.println("the biggest CardGroup is cg3");
			cg3.printCd();
		}
		// TODO 3.4
		// print out the biggest CardGroup
	}
}
