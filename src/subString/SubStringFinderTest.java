package subString;

public class SubStringFinderTest {

	public static void main(String[] args){
		SubStringFinder ssf = new SubStringFinder();
		int minLength = ssf.getShortestSubStringLength("dosbdafceeazbaz", "eba");
		if(minLength != Integer.MAX_VALUE){
			System.out.println("Minimum length of subString="+minLength);
		} else {
			System.out.println("substring not found");
		}
	}
	
}
