package probSolving;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sort.SortingAlgos;

public class ProbSolver {
	
 /********************START Question 1 ***********************
  * Given array of n integers and given a number X, 
	find all the unique pairs of elements (a,b), whose summation is equal to X.
  */


	
	// method1 and method2 will work for duplicates too, but prints only 1 time.
	// method1 will print pairs (6,4) and (4,6) for sum =10, not sure how to avoid printing both if we want
	//method2 will print only pair (4,6) for sum=10, we can print(6,4) also easily if we want
	
	
	public void printPairs1(int[] array,int sum){
		
		//an O(n) solution - hashing the array. Then checking if sum-hash[i] exists 
		//in the hash table or not.
		
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<array.length-1; i++){
			hashMap.put(array[i], i);
		}
		
		for(int i=0; i<array.length -1 ; i++){
			if(hashMap.containsKey(sum - array[i])){
				int j = hashMap.get(sum - array[i]);
				if( j!= i){
					System.out.println("index pair ("+i+","+j+") with value pair ("+array[i]+","+array[j]+") has sum="+sum);
				}
			}
		}
		// Time Complexity = O(n) + O(n) = O(n)
		// Space Complexity = Need extra space for hashMap
	}
	
	public void printPairs2(int[] array, int sum){
		//an O(nlogn) solution - sort + check sum with 2 iterators (beginning and end).
		
		SortingAlgos sortingAlgo = new SortingAlgos();
		array = sortingAlgo.quickSort(array);
		
		int i=0, j= array.length -1 ;
		
		while(i<j){
			if(array[i] + array[j] == sum){
				System.out.println("value pair ("+array[i]+","+array[j]+") has sum="+sum);
				i++; j--;
			} else if(array[i] + array[j] < sum){
				i++;
			}else if(array[i] + array[j] > sum){
				j--;
			}
		}
		
		//Time complexity - [depends on sort algorithm used = nlogn] + [O(n) for while loop]) = O(nlogn) + O(n) = O(nlogn)
		//Space complexity - depends on the sort algorithm used.
	}
	
	//If a function f(n) can be written as a finite sum of other functions, 
	//then the fastest growing one determines the order of f(n). 
/******************** END Question 1 ***********************
	  * 	
	  */
//------------------------------------------------------------------------------------------
/******************** START Question 2 ***********************
  * 	 Two arrays. Find all the common elements.
  */

	// This method will not know if '3' is there two times in both arrays as we are storing it as keys in map
	public void printCommonElements1(int[] array1, int[] array2){
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<array1.length ; i++){
			map.put(array1[i], i);
		}
		
		for(int j=0; j< array2.length; j++){
			if(map.containsKey(array2[j])){
				//System.out.println(array2[j]+" is in array1 at "+map.get(array2[j])+" & in array2 at "+j);
				System.out.println(array2[j]);
				map.remove(array2[j]);
			}
		}
		
		
	}
	
	
	// this method will print '3' two times if and only if 3 is there two times in both the arrays
	public void printCommonElements2(int[] array1, int[] array2){
		SortingAlgos sortingAlgo = new SortingAlgos();
		sortingAlgo.quickSort(array1);
		sortingAlgo.quickSort(array2);
		
		int array1Length = array1.length;
		int array2Length = array2.length;
		int i=0, j=0;
		
		while(i<array1Length && j<array2Length){
			if(array1[i] == array2[j]){
				System.out.println(array1[i]);
				i++; j++;
			} else if(array1[i] > array2[j]){
				j++;
			} else {
				i++;
			}
		}
	}
/******************** END Question 2 ***********************
  * 	
  */
	
/**	Question3 an array of size 1 million with numbers ranging from 1-99. How can we efficiently sort it.

	Ans : In practice, you can first iterate through the array once and use a hash map to count the number of occurrences 
	of the individual elements (this is O(n) where n = size of the list). Then take all the unique elements and 
	sort them (this is O(k log k) where k = number of unique elements), and then expand this back to a list of 
	n elements in O(n) steps, recovering the counts from the hash table. If k << n you save time.

	This sort is not stable.
	
	*/
	
	
	public int[] sortLargeDuplicateElements(int[] array){
		Map<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<array.length ; i++){
			int count = 1;
			if(elementCountMap.containsKey(array[i])){
				count = elementCountMap.get(array[i]) + 1;
			}
			elementCountMap.put(array[i], count);
		}
		int []temp = new int[elementCountMap.size()];
		
		int j=0;
		for(int key : elementCountMap.keySet()){
			temp[j] = key;
			j++;
		}
		SortingAlgos sortAlgos = new SortingAlgos();
		temp = sortAlgos.quickSort(temp);
		
		j=0;
		
		for(int k=0; k< temp.length ; k++){
			int element = temp[k];
			int count = elementCountMap.get(element);
			for(int m=0; m< count ; m++){
				array[j] = element;
				j++;
			}
		}
		return array;
	}
	/******************** END Question 3 ***********************
	  * 	
	  */
		
	
	
	public void printArray(int[] array){
		for(int i=0; i<array.length ; i++){
			System.out.println(array[i]);
		}
	}
	
	/***
	 * Question 4---Find second largest number in an array
	 * 
	 */
	
	
	public int secondLargest(int[] numbers){
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i = 0; i < numbers.length ; i ++){
		    if(numbers[i] > first){
		      second = first;
		      first = numbers[i];
		    } else if (numbers[i] > second) {
		      second = numbers[i];
		    }
		  }
		return second ;
		
	}
	
	/***
	 * 
	 * Question 5 -- Find the most frequent char in a string
	 * 
	 */
	
	public Character mostFrequent(String input){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();

	    for (int i = 0; i < input.length(); i++) {
	      if (map.containsKey (input.charAt(i))) {
	        map.put(input.charAt(i), map.get (input.charAt (i)) + 1 );
	      } else {
	        map.put(input.charAt(i), 1 );
	      }
	    }
	    
	    int max = Integer.MIN_VALUE;
	    Character frequent = null;
	    
	    for(Character ch : map.keySet()){
	    	if(map.get(ch)> max){
	    		frequent = ch;
	    		max = map.get(ch);
	    	}
	    }

		return frequent;
	}
		
}
