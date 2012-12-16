package cardsDeck;

public class Card {

	private int number;
	private String type;
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	Card (String type, int number){
		this.number = number;
		this.type = type;
	}
	
}
