package subString;

public class SubArrayFinderTest {
	
	public static void main(String[] args){
		SubArrayFinder saf = new SubArrayFinder();
		int[] array = {1,1,0,1,0,0,1,0,0,1,1};
		int k = 3;
		int[] subArray = saf.getShortestSubArray(array, k);
		
		saf.printArray(array);
		saf.printArray(subArray);
		
	}
}
