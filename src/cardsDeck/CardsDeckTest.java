package cardsDeck;

public class CardsDeckTest {

	public static void main(String[] args){
		CardsDeck cardsDeck = new CardsDeck();
		Card[] cards = cardsDeck.createCards();
		cardsDeck.displayCards(cards);
		cards = cardsDeck.shuffleCards(cards);
		cardsDeck.displayCards(cards);
	}
	
}
