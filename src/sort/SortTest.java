package sort;


public class SortTest {

	public static void main(String[] args) {
		
		SortingAlgos algo = new SortingAlgos();
		
	//	Scanner sc = new Scanner(System.in);
		
		int[] array = {46,89,23,12,25};
		/*for(int i =0; i < array.length ; i++ ){
			System.out.println("A["+i+"]=");
			array[i] = sc.nextInt();
		}*/
		algo.displayArray(array);
		algo.mergeSort(array);
		algo.displayArray(array);
		//System.out.println("Array as single number :"+ algo.getArrayAsSingleNumber(array));
	}

}
