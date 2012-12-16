package cardsDeck;

import java.util.Random;

public class CardsDeck {

	
	public Card[] createCards(){
		Card[] cards = new Card[52];
		String[] cardTypes = {"S","H","D","C"};
		int count = 0;
		
		for(int i=0; i<cardTypes.length; i++){
			for(int j=0; j<13 ;j++){
				cards[count] = new Card(cardTypes[i], j+1);
				count += 1;
			}
		}
		return cards;
	}
	
	
	public Card[] shuffleCards(Card[] cards){
		Random rand = new Random();
		
		for(int i=cards.length-1; i >0 ; i--){
			int n = rand.nextInt(i+1);
			Card temp = cards[i];
			cards[i] = cards[n];
			cards[n] = temp;
		}
		
		return cards;
	}
	
	public void displayCards(Card[] cards){
		System.out.println("\nPrinting cards :\n");
		for(int i=0; i<cards.length ; i++){
			System.out.print(cards[i].getType()+""+cards[i].getNumber()+" ");
		}
		
		
	}
	
	
}
