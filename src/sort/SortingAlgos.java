package sort;

public class SortingAlgos {
	
//-------------------------------------------------------------------------------------------------------
	/* ********************
		INSERTION SORT
	**********************/	
	public int[] insertionSort(int[] data){
	  int len = data.length;
	  int key = 0;
	  int i = 0;
	  for(int j = 1;j<len;j++){
	    key = data[j];
	    i = j-1;
	    while(i>=0 && isNormalSwapNeeded(data[i],key)){ // data[i] > key
	      data[i+1] = data[i];
	      i = i-1;
	      data[i+1]=key;
	    }
	  }
	  return data;
	}
//-------------------------------------------------------------------------------------------------------
	/* ********************
		SELECTION SORT
	**********************/		
	public int[] selectionSort(int[] data){
	  int lenD = data.length;
	  int iMin = 0;
	  int tmp = 0;
	  for(int i=0;i<lenD;i++){
	    iMin = i;
	    for(int j = i+1;j<lenD;j++){
	      if(isNormalSwapNeeded(data[iMin], data[j])){   // data[iMin] > data[k]
	        iMin = j;
	      }
	    }
	    tmp = data[i];
	    data[i] = data[iMin];
	    data[iMin] = tmp;
	  }
	  return data;
	}
//-------------------------------------------------------------------------------------------------------
	/* ********************
		BUBBLE SORT
	**********************/	
	
	public int[] bubbleSort(int[] data){
	  int lenD = data.length;
	  int tmp = 0;
	  for(int i = 0;i<lenD;i++){
	    for(int j = (lenD-1);j>=(i+1);j--){
	      if(data[j]<data[j-1]){
	        tmp = data[j];
	        data[j]=data[j-1];
	        data[j-1]=tmp;
	      }
	    }
	  }
	  return data;
	}
//----------------------------------------------------------------------------------------------------------	
	/* ********************
		QUICK SORT
		on average makes O(n log n) comparisons to sort n items
		worst case, it makes O(n^2) comparisons, though this behavior is rare. 
		Quick sort is often faster in practice than other O(n log n) algorithms
		Space complexity = O(1) , no extra space is required
	**********************/	
	
	public int[] quickSort(int[] arr){
		arr = quickSortRec(arr, 0, arr.length - 1);
		return arr;
	}
	
	public int partition(int arr[], int left, int right){
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	public int[] quickSortRec(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSortRec(arr, left, index - 1);
	      if (index < right)
	            quickSortRec(arr, index, right);
	      return arr;
	}
//-------------------------------------------------------------------------------------------------------
	/* ********************
			MERGE SORT
			Time complexity = O(nlogn) in all cases.
			Space complexity = O(n) - need an extra array
	**********************/
	public int[] mergeSort(int[] arr){
		arr = mergeSortRec(arr, 0, arr.length - 1);
		return arr;
	}
	
	public int[] mergeSortRec(int[] arr, int low, int high) {
		    // Check if low is smaller then high, if not then the array is sorted
		    if (low < high) {
		      // Get the index of the element which is in the middle
		      int middle = (low + high) / 2;
		      // Sort the left side of the array
		      mergeSortRec(arr, low, middle);
		      // Sort the right side of the array
		      mergeSortRec(arr, middle + 1, high);
		      // Combine them both
		      merge(arr,low, middle, high);
		    }
		    return arr;
		  }

		  public void merge(int[] arr,int low, int middle, int high) {

			 int[] helper = new int[arr.length];
		    // Copy both parts into the helper array
		    for (int i = low; i <= high; i++) {
		      helper[i] = arr[i];
		    }

		    int i = low;
		    int j = middle + 1;
		    int k = low;
		    // Copy the smallest values from either the left or the right side back
		    // to the original array
		    while (i <= middle && j <= high) {
		      if (helper[i] <= helper[j]) {
		        arr[k] = helper[i];
		        i++;
		      } else {
		        arr[k] = helper[j];
		        j++;
		      }
		      k++;
		    }
		    // Copy the rest of the left side of the array into the target array
		    // Don't need to copy rest of the right side of the array as they are already in correct place.
		    while (i <= middle) {
		      arr[k] = helper[i];
		      k++;
		      i++;
		    }

		  }

//-------------------------------------------------------------------------------------------------------
	/* ********************
		HEAP SORT
	**********************/	
	  public void buildheap(int []a){
		  int n=a.length-1;
		  for(int i=n/2;i>=0;i--){
	         maxheap(a,i);
		  }
	  }
		  
	  public void maxheap(int[] a, int i){ 
	      	int left=2*i;
	        int right=2*i+1;
	        int n= a.length - 1;
	        int largest;
	        if(left <= n && a[left] > a[i]){
	            largest=left;
	        }
	        else{
	            largest=i;
	        }
	        
	        if(right <= n && a[right] > a[largest]){
	            largest=right;
	        }
	        if(largest!=i){
	           // exchange(a[i],a[largest]);
	        	int temp = a[i];
	        	a[i] = a[largest];
	        	a[largest] = temp;
	        	
	            maxheap(a, largest);
	        }
	  }
		  
	  
	  public int[] heapSort(int []a){
	        buildheap(a);
	        int n=a.length -1 ;
	        for(int i=n;i>0;i--){
	           // exchange(a[0], a[i]);
	        	int temp = a[0];
	        	a[0] = a[i];
	        	a[i] = temp;
	            
	            
	            n=n-1;
	            maxheap(a, 0);
	        }
	        return a;
	    }
		  
	
//----------------------------------------------------------------------------------------------------------	
	//Given an integer array, sort the integer array such that 
	//the concatenated integer of the result array is max. 
	//e.g. [4, 94, 9, 14, 1] will be sorted to [9,94,4,14,1] 
	//where the result integer is 9944141
	
	// 56 and 9 should be swapped as 956 > 569
	
	public int getNumDigits(Long i){
		int recnt = 0;
		while(i > 0)
		{
			recnt++;
			i /= 10;
		}
		return recnt;
	}
	
	//(i, j) = (56 ,9)
	public Boolean isSwapNeeded(int i,int j){
		int iposnum = (int) (i*Math.pow(10,getNumDigits((long) j))+j); // 56 * 10^1 + 9 = 569
		int jposnum = (int) (j*Math.pow(10,getNumDigits((long) i))+i); // 9 * 10^2 + 56 = 956

	return iposnum < jposnum;
	}
	
	//Use isSwapNeeded(i,j) instead of this. This is not the good way
	public Boolean isSwapNeeded2(int i, int j){
		
		Integer iPosNum = Integer.parseInt(new Integer(i).toString() + new Integer(j).toString() );
		Integer jPosNum = Integer.parseInt(new Integer(j).toString() + new Integer(i).toString() );
		
		return iPosNum > jPosNum;
	}
	
	public Long getArrayAsSingleNumber(int[] array){
		Long num = (long) 0;
		
		if(array.length > 0){
			num = (long) array[0];
			for(int i= 1; i<array.length ; i++){
				Long j = (long) array[i];
				num = (long) (num*Math.pow(10,getNumDigits(j)) + j );
			}
		}
		
		return num;
	}
	
	
//-----------------------------------------------------------------------------------------------------------
	
	public Boolean isNormalSwapNeeded(int i, int j){
		return i > j;
	}
	
	public void displayArray (int[] array){
		System.out.println("Array is :");
		for(int i =0; i < array.length ; i++ ){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	
}


