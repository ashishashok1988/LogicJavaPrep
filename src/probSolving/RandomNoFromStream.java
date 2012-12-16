package probSolving;

import java.util.Random;

public class RandomNoFromStream {

	static Random r = new Random();
	static int res = 0;    // The resultant random number
    static int count = 0;  //Count of numbers visited so far in stream
	
	public static void main(String[] args){
		
		 int stream[] = {1, 2, 3, 4};
		 int n = stream.length;
		 
		    // Use a different seed value for every run.
		  //  srand(time(NULL));
		    
		    for (int i = 0; i < n; ++i)
		        System.out.printf("Random number from first %d numbers is %d \n",
		                                i+1, selectRandom(stream[i]));
		
	}
	
	static int selectRandom(int x)
	{
	    count++;  // increment count of numbers seen so far
	 
	    // If this is the first element from stream, return it
	    if (count == 1)
	        res = x;
	    else
	    {
	        // Generate a random number from 0 to count - 1
	        int i = r.nextInt(count+1);
	 
	        // Replace the prev random number with new number with 1/count probability
	        if (i == count )
	            res  = x;
	    }
	    return res;
	}
	
}
