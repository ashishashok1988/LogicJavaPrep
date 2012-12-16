package probSolving;

import java.util.Random;

public class ProbSolverTest {
	public static void main(String[] args) {
		ProbSolver probSolver = new ProbSolver();
	/*--------------------------------------------------* /
		int[] array = {1,2,4,7,1,4,6,3,8,2,3,10,12};
		int sum = 10;
		probSolver.printPairs1(array, sum);
		probSolver.printPairs2(array, sum);
	/*--------------------------------------------------*/
		
	/*--------------------------------------------------* /
		int[] array1  = {1,9,3,3,4,2,7,6};
		int[] array2 = {10,5,9,6,3,2,3};
		//probSolver.printCommonElements1(array1, array2);
		probSolver.printCommonElements2(array1, array2);
	/*--------------------------------------------------*/
		Random r = new Random();
		
		int[] array3 = new int[5];
		for(int i=0; i<array3.length ; i++){
			array3[i] = r.nextInt(99) + 1;
		}
		//probSolver.sortLargeDuplicateElements(array3);
		probSolver.printArray(array3);
		
		System.out.println(probSolver.secondLargest(array3));
		
		
		System.out.print(probSolver.mostFrequent("ahish"));
		
	}

}




