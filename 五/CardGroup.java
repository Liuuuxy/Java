
public class CardGroup {
	private Card c1;
	private Card c2;
	private Card c3;
	private String cd;
	
	public CardGroup(Card c1, Card c2, Card c3) {
		super();
		// TODO 3.1
		this.c1 = new Card(c1.getNumber(),c1.getSuit());
		this.c2 = new Card(c2.getNumber(),c2.getSuit());
		this.c3 = new Card(c3.getNumber(),c3.getSuit());
		cd = "Cardgroup:"+c1.getSuit()+c1.getNumber()+","+c2.getSuit()+c2.getNumber()+","+c3.getSuit()+c3.getNumber()+".";
	}
	public void printCd(){
		System.out.println(cd);
	}
	/*
	 * Return the number of cards with the same number
	 */
	public int numOfSameNumber() {
		// TODO 3.2
		int count= 1;
		if(c1.getNumber() == c2.getNumber()&&c2.getNumber() == c3.getNumber()){
			count += 2;
		}
		else if (c2.getNumber() == c3.getNumber()||c2.getNumber() == c1.getNumber()||c1.getNumber() == c3.getNumber()){
			count++;
		}

		return count; // to be replaced
	}
	
	/*
	 * Return the sum of all 3 numbers.
	 */
	public int sumOfNumbers() {
		// TODO 3.3
		int sum = c1.getNumber()+ c2.getNumber() + c3.getNumber();
		return sum; // to be replaced
	}
    /*
    *花色相同否
    */
	public boolean numOfSameSuit() {
		// TODO 3.2
		if(c1.getSuit() == c2.getSuit() && c2.getSuit() == c3.getSuit()){
			return true;
		}
		return false;

	}

	/*
	 * Compare if it is bigger than CardGroup c
	 * @param c another CardGroup
	 * @return 1: bigger than c; 0: the same; -1: smaller than c. 
	 */

	public int compare(CardGroup c) {
		// TODO 3.4
		if (c.numOfSameSuit() == true && this.numOfSameSuit()== true){
			if (c.numOfSameNumber() == 3 && this.numOfSameNumber()==3){
				return 0;
			}
			else if (c.numOfSameNumber() != 3 && this.numOfSameNumber()==3){
				return 1;
			}
			else if(c.numOfSameNumber() == 2 && this.numOfSameNumber()==2){
				//to be done
				return 0;
			}
			else if (c.numOfSameNumber() != 2 && this.numOfSameNumber()==2){
				return 1;
			}
			else if (c.numOfSameNumber() != 2 && this.numOfSameNumber()!=2){
				return 0;
			}
		}
		else if(c.numOfSameSuit()==false && this.numOfSameSuit()== true){
			return 1;
		}
		return -1;
		// to be replaced
	}

}
